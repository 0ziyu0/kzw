package com.kzw.order.service;

import com.kzw.common.base.service.BaseService;
import com.kzw.common.pojo.KZWResult;
import com.kzw.pojo.StoreOrder;

public interface OrderStoreService extends BaseService<StoreOrder, Long> {

	/**
	 * 确认收货
	 * @param id
	 * @return
	 */
	KZWResult setHarvest(String id);
	
}
