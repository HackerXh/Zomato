package com.zomato.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping("/User")
	public String User() {
		System.out.println("This is User's Info Page Url");
		return "user";
	}
}
