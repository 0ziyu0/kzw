package com.kzw.portal.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kzw.pojo.TbUser;

public interface UserService {

	/**
	 * 取用户信息(远程调用)
	 * @param request
	 * @param response
	 * @return
	 */
	TbUser getUserByToken(HttpServletRequest request, HttpServletResponse response);
	
	/**
	 * 通过token查询
	 * @param token
	 * @return
	 */
	TbUser selectUserByToken(String token);
	
}
