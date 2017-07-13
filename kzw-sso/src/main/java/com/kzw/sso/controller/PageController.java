 package com.kzw.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {

	@RequestMapping("/page/login")
	public String showLogin(String redirectURL, Model model) {
		// 将参数传递给jsp
		model.addAttribute("redirect", redirectURL);
		return "login";
	}
	
	@RequestMapping("/page/register")
	public String showRegister() {
//		System.out.println("sdfas");
//		System.out.println("sdfas12");
//		System.out.println("sdfas323");
		return "register";
	}
}





















