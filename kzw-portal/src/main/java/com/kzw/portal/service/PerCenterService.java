package com.kzw.portal.service;



import com.kzw.pojo.Tbseconditem;
import com.kzw.portal.pojo.SeItemResult;

public interface PerCenterService {

	
	/**
	 * 新增二手商品
	 * @return
	 */
	int InsertSecItem(Tbseconditem seItem );
	
	/**
	 * 在售商品
	 * @param userId
	 * @param pageNum
	 * @return
	 */
	SeItemResult   getOnsellItem( String userId,Integer pageNum);
	
	/**
	 * 所有商品
	 * @param userId
	 * @return
	 */
	SeItemResult   getItemAll(Integer pageNum);
	/**
	 * 购买
	 * @param itemId
	 * @return
	 */
	
	
	int chageState(String itemId);

	
	
}
