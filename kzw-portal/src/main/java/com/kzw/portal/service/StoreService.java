package com.kzw.portal.service;

import com.kzw.common.pojo.KZWResult;
import com.kzw.pojo.TbStore;

public interface StoreService {

	/**
	 * 通过用户ID查询合伙人
	 * @param userId
	 * @return
	 */
	KZWResult selectByUserId(Long userId);
	
	/**
	 * 注册店铺
	 * @param store
	 * @return
	 */
	KZWResult saveRegisterStore(TbStore store);
	
	/**
	 * 通过商品id查询店铺名称
	 * @param itemId
	 * @return
	 */
	KZWResult selectByStoreNameByItemId(Long itemId);
}
