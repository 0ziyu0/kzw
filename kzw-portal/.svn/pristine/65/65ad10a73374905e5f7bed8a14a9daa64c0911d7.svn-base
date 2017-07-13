package com.kzw.portal.service;

import java.util.List;

import com.kzw.common.pojo.KZWResult;
import com.kzw.common.pojo.SeOrderInfo;
import com.kzw.pojo.TbOrderSecond;
import com.kzw.portal.pojo.OrderInfo;
public interface OrderService {

	String createOrder(OrderInfo orderInfo);
	
	String createSeOrder(String userId,String sellerId,String itemId);
	
	 List<SeOrderInfo> SeorderInfo(String userId);
	 KZWResult harvest(String orderId);
	 KZWResult itemOrder( String pageNum,Long userId);
	 
}
