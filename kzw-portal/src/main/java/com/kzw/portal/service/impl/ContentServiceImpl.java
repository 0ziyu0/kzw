package com.kzw.portal.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.kzw.common.pojo.KZWResult;
import com.kzw.common.util.HttpClientUtil;
import com.kzw.common.util.JsonUtils;
import com.kzw.pojo.TbContent;
import com.kzw.portal.pojo.AdNode;
import com.kzw.portal.service.ContentService;


@Service("contentService")
public class ContentServiceImpl implements ContentService {

	@Value("${REST_BASE_URL}")
	private String REST_BASE_URL;

	@Value("${REST_CONTENT_URL}")
	private String  REST_CONTENT_URL;
	
	@Value("${REST_CONTENT_AD1_CID}")
	private String REST_CONTENT_AD1_CID;
	
	
	@Override
	public String getAd1List() {

		String json = HttpClientUtil.doGet(REST_BASE_URL + REST_CONTENT_URL + REST_CONTENT_AD1_CID);
		
		if(StringUtils.isBlank(json)) {
			return "";
		}
		
		// 把json转化成Java对象
		KZWResult kzwResult = KZWResult.formatToList(json, TbContent.class);
		// 取出data属性
		List<TbContent> contentLIst = (List<TbContent>) kzwResult.getData();
		
		List<AdNode> resultList = new ArrayList<>();
		for (TbContent content : contentLIst) {
			AdNode node = new AdNode();
			node.setAlt(content.getSubTitle());
			node.setHref(content.getUrl());
			node.setHeight(240);
			node.setWidth(670);
			node.setSrc(content.getPic());
			node.setHeightB(240);
			node.setHeightB(550);
			node.setSrcB(content.getPic2());
			resultList.add(node);
		}
		// 把结果集转化成json对象
		
		return JsonUtils.objectToJson(resultList);
		
	}

}

























