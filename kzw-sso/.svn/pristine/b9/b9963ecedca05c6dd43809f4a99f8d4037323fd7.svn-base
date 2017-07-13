package com.kzw.sso.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kzw.common.pojo.KZWResult;
import com.kzw.pojo.TbUser;

public interface LoginService {

	/**
	 * 用户登录接口
	 * @param userName
	 * @param password
	 * @param request
	 * @param response
	 * @return
	 */
	KZWResult login(String userName, String password, HttpServletRequest request, HttpServletResponse response);
	
	/**
	 * 通过token来查询用户
	 * @param token
	 * @return
	 */
	KZWResult getUserByToken(String token);
	
	/**
	 * ID查询
	 * @param id
	 * @return
	 */
	TbUser selectById(Long id);
	
	/**
	 * 设置用户到redis
	 * @param user
	 * @param token
	 * @return
	 */
	KZWResult setUserToRedis(TbUser user, String token);
}









