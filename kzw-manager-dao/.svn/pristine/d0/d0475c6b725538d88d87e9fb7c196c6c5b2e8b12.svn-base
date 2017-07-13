package com.kzw.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kzw.common.base.mapper.BaseMapper;
import com.kzw.pojo.StoreOrder;

public interface StoreOrderMapper extends BaseMapper<StoreOrder, Integer> {

	/**
	 * 批量发货
	 * @param itemIds
	 */
	void delivery(@Param(value="itemIds") List<String> itemIds);
	
	/**
	 * 确认收货
	 * @param itemIds
	 */
	void harvest(@Param(value="id") String id);
}
