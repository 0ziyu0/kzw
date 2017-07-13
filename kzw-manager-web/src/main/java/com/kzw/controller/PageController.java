package com.kzw.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kzw.common.pojo.KZWResult;
import com.kzw.common.util.CookieUtils;
import com.kzw.common.util.RedisUtil;
import com.kzw.pojo.TbRoleUser;
import com.kzw.pojo.TbUser;
import com.kzw.service.UserRoleService;
import com.kzw.service.UserService;

/**
 * 后台页面跳转
 * @author 子煜
 *
 */
@Controller
public class PageController {
	
	@Resource
	private UserService userService;
	@Resource
	private UserRoleService userRoleService;
	
	@RequestMapping("/")
	public String showIndex(String token, HttpServletRequest request, HttpServletResponse response, Model model) {
		/*if(StringUtils.isNotBlank(token)) {
			CookieUtils.setCookie(request, response, "KZW_STORE", token);
		}*/
		String userJson = RedisUtil.getUser(request);
		KZWResult format = KZWResult.format(userJson);
		if(format.getStatus() != 200) {
			return null;
		}
		// 取用户信息
		format = KZWResult.formatToPojo(userJson, TbUser.class);
		TbUser user = (TbUser) format.getData();
		List<TbRoleUser> roleUserList = userRoleService.selectByUserId(user.getId());
		if(roleUserList != null && roleUserList.size() > 0) {
			return "index-admin";
		}
		
		return "index";
	}
	
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page) {
		
		return page;
	}
	
	/**
	 * 保存token
	 * @param token
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/saveToken/{token}")
	public String saveToken(@PathVariable String token, HttpServletRequest request, HttpServletResponse response) {
		
		CookieUtils.setCookie(request, response, "KZW_STORE", token);
		
		return "index";
	}
	
	@RequestMapping("/showLogin")
	public String showLogin() {
		
		return "login";
	}
	
	@RequestMapping("/login")
	public String login(String userName, String passWord, HttpServletRequest request, HttpServletResponse response) {
		
		KZWResult result = userService.loginStore(userName, passWord);
		if(result.getStatus() == 200) {
			CookieUtils.setCookie(request, response, "KZW_STORE", result.getMsg());
			request.getSession().setAttribute("user", (TbUser) result.getData());
		}
		
		return "index";
	}
}
