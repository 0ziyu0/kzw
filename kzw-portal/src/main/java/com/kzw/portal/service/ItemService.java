package com.kzw.portal.service;

import com.kzw.pojo.TbItem;

public interface ItemService {

	/**
	 * 根据商品id查询商品(远程调用)
	 * @param itemId
	 * @return
	 */
	TbItem getItemById(Long itemId);
	
	/**
	 * 根据商品id查询商品描述(远程调用)
	 * @param itemId
	 * @return
	 */
	String getItemDescById(Long itemId);
	
	/**
	 * 根据商品id查询商品参数(远程调用)
	 * @param itemId
	 * @return
	 */
	String getItemParamById(Long itemId);
}
