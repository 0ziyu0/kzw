package com.kzw.portal.service.impl;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.kzw.common.pojo.KZWResult;
import com.kzw.common.pojo.SeOrderInfo;
import com.kzw.common.util.HttpClientUtil;
import com.kzw.common.util.JsonUtils;
import com.kzw.pojo.TbOrderSecond;
import com.kzw.portal.pojo.OrderInfo;
import com.kzw.portal.pojo.SearchItem;
import com.kzw.portal.service.OrderService;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Value("${ORDER_BASE_URL}")
	private String ORDER_BASE_URL;
	@Value("${ORDER_CREATE_URL}")
	private String ORDER_CREATE_URL;
	@Value("${ORDER_CREATESEORDER_URL}")
	private String ORDER_CREATESEORDER_URL;
	@Value("${ORDER_SEORDERINFO_URL}")
	private String ORDER_SEORDERINFO_URL;
	@Value("${ORDER_HARVEST_URL}")
	private String ORDER_HARVEST_URL;
	@Value("${ORDER_ITEMORDER_URL}")
	private String	ORDER_ITEMORDER_URL;

	
	
	
	
	
	@Override
	public String createOrder(OrderInfo orderInfo) {
		
		/*Map<String, String> param = BeanUtil.beanToMap(orderInfo);
		String result = HttpClientUtil.doPost(ORDER_BASE_URL + ORDER_CREATE_URL, param);*/
		
		String json = JsonUtils.objectToJson(orderInfo);
		String result = HttpClientUtil.doPostJson(ORDER_BASE_URL + ORDER_CREATE_URL, json);
		
		KZWResult kzwResult = KZWResult.format(result);
		// 返回订单号
		String orderId = kzwResult.getData().toString();
		
		return orderId;
	}


	@Override
	public String createSeOrder(String userId,String sellerId,String itemId) {
		HashMap<String, String> maps=new HashMap<String, String> ();
		maps.put("userId", userId);
		maps.put("sellerId", sellerId);
		maps.put("itemId", itemId);		
		String result = HttpClientUtil.doPost(ORDER_BASE_URL + ORDER_CREATESEORDER_URL, maps);
		
		KZWResult kzwResult = KZWResult.format(result);
		// 返回订单号
		
		return null;
	}
	
	@Override
	public List<SeOrderInfo> SeorderInfo(String userId) {
		HashMap<String, String> map=new HashMap<String, String> ();
		map.put("userId", userId);	
		String result = HttpClientUtil.doPost(ORDER_BASE_URL + ORDER_SEORDERINFO_URL, map);	
		KZWResult  kzwResult = JsonUtils.jsonToPojo(result, KZWResult.class);		
		
		Object   object=kzwResult.getData();
		List<SeOrderInfo> ordres = (List<SeOrderInfo>) object;
		return ordres;
	}
	
	@Override
	public KZWResult itemOrder( String pageNum ,Long userId) {
		HashMap<String, String> map=new HashMap<String, String> ();
		map.put("page", pageNum);	
		map.put("userId", userId.toString());	
		String result = HttpClientUtil.doPost(ORDER_BASE_URL + ORDER_ITEMORDER_URL, map);	
		KZWResult  kzwResult = JsonUtils.jsonToPojo(result, KZWResult.class);
		
		return kzwResult;
	}
	
	@Override
	public KZWResult harvest(String orderId) {
		HashMap<String, String> map=new HashMap<String, String> ();
		map.put("orderId", orderId);	
		String result = HttpClientUtil.doPost(ORDER_BASE_URL + ORDER_HARVEST_URL, map);	
		KZWResult  kzwResult = JsonUtils.jsonToPojo(result, KZWResult.class);	
		
		return kzwResult;
	}
	
	
	
	
	
	

}






















