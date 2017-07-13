package com.kzw.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kzw.mapper.TbRoleUserMapper;
import com.kzw.pojo.TbRoleUser;
import com.kzw.service.UserRoleService;

@Service("userRoleService")
public class UserRoleServiceImpl implements UserRoleService {

	@Resource
	private TbRoleUserMapper roleUserMapper;
	
	@Override
	public List<TbRoleUser> selectByUserId(Long userId) {
		
		return roleUserMapper.selectByUserId(userId);
	}

}
