package net.zgysrc.www.utils;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * 爬虫工具类
 * 
 * @author Administrator
 *
 */
public class NetDownUtil {

	/**
	 * 连接
	 * 
	 * @param url
	 * @param encoding
	 * @return
	 */
	public static String saveUrl(String url, String encoding) {
		// io流处处理输入
		InputStreamReader isr = null;
		// 存网页数据
		StringBuffer bf = new StringBuffer();
		try {
			// 建立网络连接
			URL urlObj = new URL(url);
			// 加载连接
			URLConnection uc = urlObj.openConnection();
			uc.setRequestProperty("User-Agent",
					"Mozilla/5.0 (iPad; U; CPU OS 4_3_3 like Mac OS X; en-us) AppleWebKit/533.17.9 (KHTML, like Gecko) Version/5.0.2 Mobile/8J2 Safari/6533.18.5");
			uc.setConnectTimeout(60000000);

			// io流处处理输入
			isr = new InputStreamReader(uc.getInputStream(), encoding);
			// 缓冲区 说白就是将html下载到本地内存
			BufferedReader reader = new BufferedReader(isr);
			// 定义临时文件
			String line = "";
			// 循环出元素
			while ((line = reader.readLine()) != null) {
				// 边读 边写！以及打印换行
				bf.append(line + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (isr != null)
					isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return bf.toString();
	}

	/**
	 * 爬虫核心
	 * 
	 * @param url
	 * @param encoding
	 * @return
	 */
	public static List<HashMap<String, String>> getInfo(String url, String encoding) {
		List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
		// 加载处理网页 调上方法
		String html = saveUrl(url, encoding);
		// 或者解析本地
		// String html = getLocalHtml(url, encoding);
		// 开始解析
		Document document = Jsoup.parse(html);
		// 获取元素 父级元素 div id 或其他
		Element element = document.getElementById("resultList");
		// 获取子级元素 div classname等
		Elements elements = element.getElementsByClass("el");
		// 循环
		for (Element el : elements) {
			Elements elementss = el.getElementsByTag("a");
			// 获取连接
			String urls = elementss.attr("href");
			if (urls != null && urls != "") {
				HashMap<String, String> map = getInformation(urls, encoding);
				list.add(map);
			} else {
				continue;
			}
		}
		return list;
	}

	/**
	 * 爬详情页
	 * 
	 * @param url
	 * @param encoding
	 * @return
	 */
	public static HashMap<String, String> getInformation(String url, String encoding) {
		HashMap<String, String> map = new HashMap<String, String>();
		String html = saveUrl(url, encoding);
		Document document = Jsoup.parse(html);
		Elements title = document.getElementsByTag("h1");
		if (title.size() == 0) {
			content();
		}
		// 职位名
		String pTyoeTwo = title.get(0).text();
		Elements addewss = document.getElementsByClass("lname");
		// 地点
		String address = addewss.text();
		Elements div = document.getElementsByClass("cn");
		Elements sarry = div.get(0).getElementsByTag("strong");
		if (sarry.size() == 0) {
			content();
		}
		// 薪资
		String sarrys = sarry.get(0).text();
		Elements divInfo = document.getElementsByClass("cname");
		if (divInfo.size() == 0) {
			content();
		}
		Elements com = divInfo.get(0).getElementsByTag("a");
		if (com.size() == 0) {
			content();
		}
		// 公司名
		String company = com.get(0).attr("title");
		Elements cInfos = document.getElementsByClass("msg ltype");
		if (cInfos.size() == 0) {
			content();
		}
		String companyInfos = cInfos.text();
		StringBuffer sb = new StringBuffer(companyInfos);
		int cut = sb.indexOf("|");
		int cutEnd = sb.lastIndexOf("|");
		// 公司类型
		String compantType = sb.substring(0, cut - 2);
		// 公司规模
		String companySize = sb.substring(cut + 3, cutEnd - 2);
		// 行业类型
		String instuType = sb.substring(cutEnd + 3, sb.length());
		Elements requirement = document.getElementsByClass("sp4");
		if (requirement.size() == 0) {
			content();
		}
		String[] s = new String[4];
		for (int i = 0; i < requirement.size(); i++) {
			s[i] = requirement.get(i).text();
		}
		// 无工作经验
		String servers = s[0];
		// 学历
		String edu = s[1];
		// 人数
		String size = s[2];
		// 发布时间
		String time = s[3];
		Elements jobInfo = document.getElementsByClass("bmsg job_msg inbox");
		if (jobInfo.size() == 0) {
			content();
		}
		// test
		String jobinfos = jobInfo.get(0).text();
		map.put("pTyoeTwo", pTyoeTwo);
		map.put("address", address);
		map.put("sarrys", sarrys);
		map.put("company", company);
		map.put("compantType", compantType);
		map.put("companySize", companySize);
		map.put("instuType", instuType);
		map.put("servers", servers);
		map.put("edu", edu);
		map.put("size", size);
		map.put("time", time);
		map.put("majorOne", jobinfos);
		return map;
	}

	/**
	 * 爬本地
	 * 
	 * @param path
	 * @param encoding
	 * @return
	 */
	@SuppressWarnings("resource")
	public static String getLocalHtml(String path, String encoding) {
		String xmlString;
		byte[] strBuffer = null;
		int flen = 0;
		File xmlfile = new File(path);
		try {
			InputStream in = new FileInputStream(xmlfile);
			flen = (int) xmlfile.length();
			strBuffer = new byte[flen];
			in.read(strBuffer, 0, flen);
		} catch (Exception e) {
			e.printStackTrace();
		}
		xmlString = new String(strBuffer); // 构建String时，可用
		return xmlString;
	}

}
