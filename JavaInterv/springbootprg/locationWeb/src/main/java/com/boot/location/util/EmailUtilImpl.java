package com.boot.location.util;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailUtilImpl implements EmailUtil {

	@Autowired
	private JavaMailSender sender;
	
	@Override
	public void sendEmail(String toAddress, String sub, String body) {

		MimeMessage msg=sender.createMimeMessage();
		sender.send(msg);
		
	}

}