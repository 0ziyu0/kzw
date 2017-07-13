package com.kzw.portal.service.impl;


import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.kzw.common.pojo.KZWResult;
import com.kzw.common.util.HttpClientUtil;
import com.kzw.portal.pojo.Products;
import com.kzw.portal.service.ProductsService;

@Service("productsService")
public class ProductsServiceImpl implements ProductsService {

	@Value("${REST_BASE_URL}")
	private String REST_BASE_URL;
	@Value("${PRODUCTS_SERVICE}")
	private String PRODUCTS_SERVICE;
	
	@Override
	public KZWResult getProductsList(Long parentId) {
		
		String json = HttpClientUtil.doGet(REST_BASE_URL + PRODUCTS_SERVICE + parentId);
		if(StringUtils.isNotBlank(json)) {
			KZWResult kzwResult = KZWResult.formatToList(json, Products.class);
			
			if(kzwResult.getStatus() == 200) {
				return kzwResult;
			}
		}
		
		return null;
	}

}
