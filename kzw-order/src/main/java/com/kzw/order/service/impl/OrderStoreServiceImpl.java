package com.kzw.order.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kzw.common.base.mapper.BaseMapper;
import com.kzw.common.base.service.impl.BaseServiceImpl;
import com.kzw.common.pojo.KZWResult;
import com.kzw.mapper.StoreOrderMapper;
import com.kzw.order.service.OrderStoreService;
import com.kzw.pojo.StoreOrder;
@Service("orderStoreService")
public class OrderStoreServiceImpl extends BaseServiceImpl<StoreOrder, Long> implements
		OrderStoreService {

	@Resource
	private StoreOrderMapper storeOrderMapper;
	
	@Resource(name = "storeOrderMapper")
	@Override
	public void setBaseMapper(BaseMapper<StoreOrder, Long> baseMapper) {
		this.baseMapper = baseMapper;
	}

	@Override
	public KZWResult setHarvest(String id) {
		
		try {
			storeOrderMapper.harvest(id);
			return KZWResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return KZWResult.build(400, "参数错误...");
		}
		
	}

	
}
