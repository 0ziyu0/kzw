package com.kzw.service;

import java.util.List;

import com.kzw.common.base.service.BaseService;
import com.kzw.pojo.StoreOrder;

public interface StoreOrderService extends BaseService<StoreOrder, Long> {

	/**
	 * 批量发货
	 * @param itemIds
	 */
	void delivery(List<String> itemIds);

}
