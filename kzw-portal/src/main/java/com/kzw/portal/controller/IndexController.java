package com.kzw.portal.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kzw.common.pojo.KZWResult;
import com.kzw.common.util.CookieUtils;
import com.kzw.portal.service.ContentService;

@Controller
public class IndexController {
	
	@Resource
	private ContentService contentService;

	@RequestMapping("/index")
	public String showIndex(HttpServletRequest request, HttpServletResponse response, Model model, String token) {
		
		model.addAttribute("ad1", contentService.getAd1List());
		if(StringUtils.isNoneBlank(token)) {
			CookieUtils.setCookie(request, response, "KZW_TOKEN", token);
		}
		
		return "index";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		try {
			CookieUtils.deleteCookie(request, response, "KZW_TOKEN");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		model.addAttribute("ad1", contentService.getAd1List());
		
		return "index";
	}
	
	@RequestMapping("/setCookie")
	public KZWResult setCookie(Model model) {
		
		model.addAttribute("ad1", contentService.getAd1List());
		
		return null;
	}
	
}



































