package net.zgysrc.www.utils.MobileUtils;

/**
 * 短信验证码工具
 * 
 * @ClassName: IndustrySMS
 * @Description: 短信验证码
 *
 */
public class IndustrySMS
{
	private static String operation = "/industrySMS/sendSMS";

	private static String accountSid = Config.ACCOUNT_SID;


	public static void execute(String to ,String code)
	{
		String smsContent = "【金鹏鸟科技】您的验证码为"+code+ "，请于10分钟内正确输入，如非本人操作，请忽略此短信。";
		String url = Config.BASE_URL + operation;
		String body = "accountSid=" + accountSid + "&to=" + to + "&smsContent=" + smsContent
				+ HttpUtil.createCommonParam();

		// 提交请求
		String result = HttpUtil.post(url, body);
		System.out.println("result:" + System.lineSeparator() + result);
	}
	
	public static void main(String[] args) {
		String to = "15968174667";
		String code = "123456";
		IndustrySMS.execute(to,code);
	}
	
}
