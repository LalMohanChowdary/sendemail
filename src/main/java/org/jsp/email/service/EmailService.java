package org.jsp.email.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailService {

	@Autowired
	JavaMailSender javaMailSender;

	public void sendEmail(String reciepnt,String message,String body) {

		SimpleMailMessage mailMessage=new SimpleMailMessage();
		mailMessage.setFrom(body);
		mailMessage.setTo(body);
		mailMessage.setText(body);
		mailMessage.setSubject(body);
		 
		javaMailSender.send(mailMessage);
	}

}
