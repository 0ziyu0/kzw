package com.kzw.sso.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.kzw.common.pojo.KZWResult;
import com.kzw.mapper.TbUserMapper;
import com.kzw.pojo.TbUser;
import com.kzw.pojo.TbUserExample;
import com.kzw.pojo.TbUserExample.Criteria;
import com.kzw.sso.service.RegisterService;

@Service("registerService")
public class RegisterServiceImpl implements RegisterService {

	@Resource
	private TbUserMapper userMapper;
	
	@Override
	public KZWResult checkData(String param, Integer type) {
		
		TbUserExample example = new TbUserExample();
		Criteria criteria = example.createCriteria();
		// 1、2、3分别代表对username、phone、email进行检查
		if(1 == type) {
			criteria.andUsernameEqualTo(param);
		} else if (2 == type) {
			criteria.andPhoneEqualTo(param);
		} else if (3 == type) {
			criteria.andEmailEqualTo(param);
		}
		
		List<TbUser> list = userMapper.selectByExample(example);
		if(list == null || list.isEmpty()) {
			return KZWResult.ok(true);
		}
		
		return KZWResult.ok(false);
	}

	@Override
	public KZWResult register(TbUser user) {
		
		if(StringUtils.isBlank(user.getUsername()) || StringUtils.isBlank(user.getPassword())) {
			return KZWResult.build(400, "用户名，密码不能为空");
		}
		// 校验数据是否重复
		KZWResult result = this.checkData(user.getUsername(), 1);
		if(!(boolean) result.getData()) {
			return KZWResult.build(400, "用户名重复");
		}
		result = this.checkData(user.getPhone(), 2);
		if(!(boolean) result.getData()) {
			return KZWResult.build(400, "手机号重复");
		}
		if(StringUtils.isNotBlank(user.getEmail())) {
			result = this.checkData(user.getEmail(), 3);
			if(!(boolean) result.getData()) {
				return KZWResult.build(400, "邮箱重复");
			}
		}
		Date date = new Date();
		user.setUpdated(date);
		user.setCreated(date);
		//md5加密
		user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
		userMapper.insertSelective(user);
		
		return KZWResult.ok();
	}



}
























