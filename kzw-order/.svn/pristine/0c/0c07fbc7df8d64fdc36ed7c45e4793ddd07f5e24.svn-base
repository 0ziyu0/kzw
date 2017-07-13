package com.kzw.order.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kzw.common.pojo.SeOrderInfo;
import com.kzw.order.pojo.OrderInfo;
import com.kzw.pojo.TbOrderSecond;
import com.kzw.pojo.TbUser;

public interface OrderService {

	/**
	 * 创建订单
	 * @param orderInfo
	 * @return
	 */
	String createOrder(OrderInfo orderInfo);
	
	/**
	 * 通过店铺ID查询开店人
	 * @param storeId
	 * @return
	 */
	List<TbUser> getStoreUser(Long storeId);
	
	
	/**
	 * 创建订单
	 * @param orderInfo
	 * @return
	 */
	int createSeOrder(TbOrderSecond orderInfo);
	
	

    
    List<SeOrderInfo> selectByUserIdforbuyer(Integer userId);

	
	
}
