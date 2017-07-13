package com.kzw.portal.service;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kzw.common.pojo.KZWResult;
import com.kzw.portal.pojo.CartItem;

public interface CartService {

	/**
	 * 添加购物车
	 * @param itemId
	 * @param num
	 * @param request
	 * @param response
	 * @return
	 */
	KZWResult addCart(Long itemId, Integer num, HttpServletRequest request, HttpServletResponse response);
	
	/**
	 * 获取购物车
	 * @param request
	 * @return
	 */
	List<CartItem> getCartItems(HttpServletRequest request);
	
	/**
	 * 修改购物车物品数量
	 * @param itemId
	 * @param num
	 * @param request
	 * @param response
	 * @return
	 */
	KZWResult updataCartItem(Long itemId, Integer num, HttpServletRequest request, HttpServletResponse response);
	
	/**
	 * 删除
	 * @param itemId
	 * @param request
	 * @param response
	 * @return
	 */
	KZWResult deleteCartItem(Long itemId, HttpServletRequest request, HttpServletResponse response);
}































