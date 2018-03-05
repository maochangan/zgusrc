package net.zgysrc.www.utils;

import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import net.zgysrc.www.bean.CompanyUser;

public class MailUtil extends Thread {
	public static final String FROM = "jpncolor@163.com";
	public static final String PWD = "zgysrc111";
	public static final String URL = "http://www.zgysrc.net:80/zgysrc";
	public static final int TIMELIMIT = 1000 * 60 * 60 * 24; 
	public static final String TITLE = "答美色彩账号激活邮件";
	public static final String HOST = "smtp.163.com";
	public static final String SMTP = "smtp";

	public static CompanyUser activateMail(CompanyUser u)
			throws AddressException, MessagingException, NoSuchAlgorithmException {
		String to = u.getcEmail();
		Long curTime = System.currentTimeMillis();
		long activateTime = curTime + TIMELIMIT;
		String token = to + curTime;
		u.setToken(UtilsMD5.md5(token));
		u.setCreateDate(new Date());
		u.setEmailAc("0");
		token = u.getToken();
		u.setEmainAcTime(activateTime);
		String content = "<p>您好 O(∩_∩)O~~<br><br>欢迎加入答美色彩!<br><br>帐户需要激活才能使用，赶紧激活成为答美色擦正式的一员吧:)<br><br>请在24小时内点击下面的链接立即激活帐户："
				+ "<br><a href='" + URL + "/companyUser" + "/activatEmail/?token=" + token + "&email=" + to + "'>" + URL
				+ "/activatemail/?token=" + token + "&email=" + to + "</a></p>";
		MailUtil.sendMail(to, TITLE, content);
		return u;
	}

	public static void sendMail(String to, String title, String content) throws AddressException, MessagingException {

		Properties props = new Properties(); 
		props.put("mail.smtp.host", HOST);
		props.put("mail.smtp.auth", "true");
		Session session = Session.getInstance(props);
	
		MimeMessage message = new MimeMessage(session);
		message.setFrom(new InternetAddress(FROM));
		message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
		message.setSubject(title);
		
	
		message.setContent(content, "text/html;charset=gbk");
		message.setSentDate(new Date());
		message.saveChanges();
	
		Transport transport = session.getTransport(SMTP);
		
		transport.connect(FROM, PWD);
		transport.sendMessage(message, message.getAllRecipients());
		transport.close();
	}
}
