package com.kzw.portal.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.kzw.common.pojo.KZWResult;
import com.kzw.common.util.BeanUtil;
import com.kzw.common.util.HttpClientUtil;
import com.kzw.pojo.TbStore;
import com.kzw.portal.service.StoreService;

@Service("storeService")
public class StoreServiceImpl implements StoreService {

	@Value("${REST_BASE_URL}")
	private String REST_BASE_URL;
	@Value("${REST_USER_PARTNER_SERVICE}")
	private String REST_USER_PARTNER_SERVICE;
	@Value("${REST_STORE_SAVEREGISTER_SERVICE}")
	private String REST_STORE_SAVEREGISTER_SERVICE;
	@Value("${REST_STORE_SELECTSTORENAME_ITEMID}")
	private String REST_STORE_SELECTSTORENAME_ITEMID;

	@Override
	public KZWResult selectByUserId(Long userId) {
		
		String json = HttpClientUtil.doGet(REST_BASE_URL + REST_USER_PARTNER_SERVICE + userId);
		KZWResult result = KZWResult.format(json);
		return result;
	}

	@Override
	public KZWResult saveRegisterStore(TbStore store) {
		
		Map<String, String> param = BeanUtil.beanToMap(store);
		
		String json = HttpClientUtil.doPost(REST_BASE_URL + REST_STORE_SAVEREGISTER_SERVICE, param);
		KZWResult result = KZWResult.format(json);
		return result;
	}

	@Override
	public KZWResult selectByStoreNameByItemId(Long itemId) {
		
		String json = HttpClientUtil.doGet(REST_BASE_URL + REST_STORE_SELECTSTORENAME_ITEMID + itemId);
		KZWResult result = KZWResult.format(json);
		return result;
	}
	
}
