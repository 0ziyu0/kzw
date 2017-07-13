package com.kzw.order.util;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailUtils {

	
	public static void setEmailMessage(String to, String orderId) {
		
		try {
			Properties prop = new Properties();
			prop.setProperty("mail.host", "smtp.163.com");
			prop.setProperty("mail.smtp.auth", "true");
			
			Authenticator auth = new Authenticator() {
				public PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("15928031703", "lwj886");
				}
			};
			
			Session session = Session.getDefaultInstance(prop, auth);
			
			session.setDebug(true);
			
			MimeMessage msg = new MimeMessage(session);
			
			msg.setFrom(new InternetAddress("15928031703@163.com"));
			msg.addRecipients(RecipientType.TO, to);
			msg.setSubject("开张网订单提醒");
			msg.setText("你有一笔来自开张网的订单，订单号为: " + orderId + "。", "utf-8");
			
			Transport.send(msg);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
	}
	
}
