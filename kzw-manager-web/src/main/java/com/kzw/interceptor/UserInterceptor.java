package com.kzw.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.kzw.pojo.TbUser;

public class UserInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		return true;
		
		/*try {
			String url = request.getRequestURI();
			if(url.contains("showLogin") || url.contains("login") || url.contains("js")  || url.contains("css")) {
				//是公开地址则放行
				return true;
			}
			String userJson = RedisUtil.getStoreUser(request);
			KZWResult format = KZWResult.format(userJson);
			if(format.getStatus() == 200) {
				return true;
			}
			HttpSession session = request.getSession();
			TbUser user = (TbUser) session.getAttribute("user");
			if(user != null) {
				return true;
			}
			request.getRequestDispatcher("timeout.jsp").forward(request, response);
		} catch (Exception e) {
			request.getRequestDispatcher("timeout.jsp").forward(request, response);
		}
		return false;*/
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
