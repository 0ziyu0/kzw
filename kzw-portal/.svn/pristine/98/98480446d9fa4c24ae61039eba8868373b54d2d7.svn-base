package com.kzw.portal.interceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.kzw.pojo.TbUser;
import com.kzw.portal.service.UserService;

public class LoginInterceptor implements HandlerInterceptor {

	@Resource
	private UserService userService;
	
	@Value("${SSO_LOGIN_URL}")
	private String SSO_LOGIN_URL;
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		TbUser user = userService.getUserByToken(request, response);
		if (user == null) {
			String storeName = request.getParameter("storeName");
			response.sendRedirect("http://localhost:8083/sso/page/login?redirectURL=" + request.getRequestURL() + "?storeName=" + storeName);
			return false;
		}
		// 添加用户信息
		request.setAttribute("user", user);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}

}
