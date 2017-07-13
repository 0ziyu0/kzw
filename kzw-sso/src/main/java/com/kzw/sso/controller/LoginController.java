package com.kzw.sso.controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kzw.common.pojo.KZWResult;
import com.kzw.common.util.ExceptionUtil;
import com.kzw.pojo.TbUser;
import com.kzw.sso.service.LoginService;

@Controller
public class LoginController {

	@Resource
	private LoginService loginService;
	
	@RequestMapping(value = "/user/login", method = RequestMethod.POST)
	@ResponseBody
	public KZWResult login(String username, String password, 
			HttpServletRequest request, HttpServletResponse response) {
		
		try {
			return loginService.login(username, password, request, response);
		} catch (Exception e) {
			e.printStackTrace();
			return KZWResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
	
	@RequestMapping("/user/token/{token}")
	@ResponseBody
	public Object getUserByToken(@PathVariable String token, String callback) {
		
		try {
			KZWResult result = loginService.getUserByToken(token);
			if(StringUtils.isNoneBlank(callback)) {
				MappingJacksonValue jsonp = new MappingJacksonValue(result);
				jsonp.setJsonpFunction(callback);
				return jsonp;
			}
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return KZWResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
//	@RequestMapping(value = "/setUserToRedis/{id}/{token}/{address}")
	@RequestMapping(value = "/setUserToRedis/{id}/{token}")
	@ResponseBody
	public KZWResult setUserToRedis(TbUser user, @PathVariable String token) {
		
		user = loginService.selectById(user.getId());
		user.setPassword(null);
		
		return loginService.setUserToRedis(user, token);
	}
	
	@RequestMapping("/user/userSession")
	@ResponseBody
	public Object userSession(HttpServletRequest request, String callback) {
		
		try {
			KZWResult result = new KZWResult();
			HttpSession session = request.getSession();
			TbUser user = (TbUser) session.getAttribute("user");
			if(user != null) {
				result.setData(user);
				if(StringUtils.isNoneBlank(callback)) {
					MappingJacksonValue jsonp = new MappingJacksonValue(result);
					jsonp.setJsonpFunction(callback);
					return jsonp;
				}
				return result;
			} 
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return KZWResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
}




























