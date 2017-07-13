package com.kzw.order.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kzw.mapper.TbUserMapper;
import com.kzw.order.service.UserService;
import com.kzw.pojo.TbUser;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private TbUserMapper tbusermapper;
	
	@Override
	public TbUser gettbuser(Long userId) {
		
		return tbusermapper.selectByPrimaryKey(userId);
	}

}
