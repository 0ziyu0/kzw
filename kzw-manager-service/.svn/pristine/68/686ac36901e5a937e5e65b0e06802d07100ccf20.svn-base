package com.kzw.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kzw.mapper.TbStoreMapper;
import com.kzw.pojo.TbStore;
import com.kzw.service.StoreService;

@Service("storeService")
public class StoreServiceImpl implements StoreService {

	@Resource
	private TbStoreMapper storeMapper;
	
	
	@Override
	public TbStore selectByuserId(Long userId) {
		
		return storeMapper.selectByUserId(userId);
	}

	@Override
	public TbStore selectByid(Long id) {
		
		return storeMapper.selectByPrimaryKey(id);
	}

	@Override
	public void update(TbStore store) {
		
		storeMapper.updateByPrimaryKeySelective(store);
	}

}













