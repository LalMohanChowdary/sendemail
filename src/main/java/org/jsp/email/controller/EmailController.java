package org.jsp.email.controller;

import org.jsp.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
	
	@Autowired
	EmailService service;
	
	@GetMapping("/sendemail")
	public String sendEmail() {
		service.sendEmail("lal","ihi","dkwq");
		return "sent Sucessfully";
	}

}
