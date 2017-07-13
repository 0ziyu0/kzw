package com.kzw.common.util;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;

/**
 * 获取redis中用户信息
 * @author 子煜
 *
 */
public class RedisUtil {
	
	public static String getUser(HttpServletRequest request) {
		String token = CookieUtils.getCookieValue(request, "KZW_TOKEN");
		
		String userJson = HttpClientUtil.doGet("http://localhost:8083/sso/user/token/" + token);
		if(StringUtils.isEmpty(userJson) || userJson.equals("[]")) {
			return null;
		}
		
		return userJson;
	}
	
	/*public static TbUser getStoreUser(HttpServletRequest request) {
		String token = CookieUtils.getCookieValue(request, "KZW_STORE");
		
		String userJson = HttpClientUtil.doGet("http://localhost:8083/sso/user/token/" + token);
		if(StringUtils.isEmpty(userJson) || userJson.equals("[]")) {
			return null;
		}
		
		HttpSession session = request.getSession();
		TbUser user = (TbUser) session.getAttribute("user");
		if(user != null) {
			return user;
		}
		
		return user;
	}*/
	
}









