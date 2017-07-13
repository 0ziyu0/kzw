package com.kzw.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kzw.common.base.mapper.BaseMapper;
import com.kzw.common.base.service.impl.BaseServiceImpl;
import com.kzw.mapper.StoreOrderMapper;
import com.kzw.pojo.StoreOrder;
import com.kzw.service.StoreOrderService;

@Service("storeOrderService")
public class StoreOrderServiceImpl extends BaseServiceImpl<StoreOrder, Long> implements
		StoreOrderService {

	@Resource
	private StoreOrderMapper storeOrderMapper;
	
	@Resource(name = "storeOrderMapper")
	@Override
	public void setBaseMapper(BaseMapper<StoreOrder, Long> baseMapper) {
		this.baseMapper = baseMapper;
	}

	@Override
	public void delivery(List<String> itemIds) {
		
		storeOrderMapper.delivery(itemIds);
	}
}
