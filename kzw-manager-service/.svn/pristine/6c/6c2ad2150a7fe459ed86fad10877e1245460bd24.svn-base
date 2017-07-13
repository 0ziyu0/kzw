package com.kzw.service.impl;

import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.kzw.pojo.TbUser;
import com.kzw.common.pojo.KZWResult;
import com.kzw.common.util.HttpClientUtil;
import com.kzw.common.util.JsonUtils;
import com.kzw.mapper.TbUserMapper;
import com.kzw.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private TbUserMapper userMapper;
	@Value("${REDIS_URL}")
	private String REDIS_URL;
	
	@Override
	public TbUser selectById(Long userId) {
		
		return userMapper.selectByPrimaryKey(userId);
	}

	@Override
	public TbUser selectByUser(TbUser user) {
		
		return userMapper.selectByUser(user);
	}

	@Override
	public KZWResult loginStore(String userName, String passWord) {
		
		TbUser user = new TbUser();
		user.setUsername(userName);
		user = userMapper.selectByUser(user);
		if(user == null) {
			return KZWResult.build(400, "用户名或密码错误");
		}
		if(!user.getPassword().equals(DigestUtils.md5DigestAsHex(passWord.getBytes()))) {
			return KZWResult.build(400, "用户名或密码错误");
		}
		
		String token = UUID.randomUUID().toString();
		user.setPassword(token);
//		String userJson = JsonUtils.objectToJson(user);
//		Map<String, String> beanToMap = BeanUtil.beanToMap(user);
		String result = HttpClientUtil.doGet(REDIS_URL + "/" + user.getId() + "/" + token);
		KZWResult kzwResult = JsonUtils.jsonToPojo(result, KZWResult.class);
		if(kzwResult.getStatus() == 200) {
			kzwResult.setMsg(token);
			kzwResult.setData(user);
			return kzwResult;
		}
		
		return kzwResult;
	}

}
