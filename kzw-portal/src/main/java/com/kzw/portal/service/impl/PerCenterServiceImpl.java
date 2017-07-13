package com.kzw.portal.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.kzw.common.pojo.KZWResult;
import com.kzw.common.util.HttpClientUtil;
import com.kzw.common.util.JsonUtils;
import com.kzw.pojo.Tbseconditem;
import com.kzw.portal.pojo.SeItemResult;
import com.kzw.portal.service.PerCenterService;

@Service("PerCenterService")
public class PerCenterServiceImpl implements PerCenterService {

	@Value("${REST_SECDITEM_PARAM_URL}")
	private String REST_SECDITEM_PARAM_URL;//新增商品
	@Value("${REST_SECDITEM_ONSELL_URL}")
	private String REST_SECDITEM_ONSELL_URL;//在售	
	@Value("${REST_SECDITEM_ItemAll_URL}")
	private String REST_SECDITEM_ItemAll_URL;//所有商品	
	@Value("${REST_BASE_URL}")
	private String REST_BASE_URL;
	@Value("${REST_SECDITEM_BUY_URL}")
	private String REST_SECDITEM_BUY_URL;
	
	
	
	
	@Override
	public int InsertSecItem(Tbseconditem seItem) {


		HashMap<String, String> map	 =new  HashMap<String, String>();
		map.put("userid", seItem.getUserid().toString());
		map.put("itemname", seItem.getItemname());
		map.put("img", seItem.getImg());
		map.put("itemprice", seItem.getItemprice().toString());
		map.put("itemdescription", seItem.getItemdescription());
		String re = HttpClientUtil.doPost(REST_BASE_URL + REST_SECDITEM_PARAM_URL,map);

		
		if(StringUtils.isNotBlank(re)) {
			int m=1;
			return m;
		}
		return 0;
		

	}

	@Override
	public SeItemResult getOnsellItem(String userId,Integer pageNum) {
		HashMap<String, String> map	 =new  HashMap<String, String>();
		map.put("userId", userId);
		map.put("pageNum", pageNum.toString());	
		SeItemResult  seResult =new SeItemResult();
		String re = HttpClientUtil.doGet(REST_BASE_URL + REST_SECDITEM_ONSELL_URL,map);
		KZWResult  kzwResult = JsonUtils.jsonToPojo(re, KZWResult.class);
		if(StringUtils.isNotBlank(re)) {
			if(kzwResult.getData() != null) {
				Map maps = (Map) kzwResult.getData();
				Object object = maps.get("result");
				List<Tbseconditem> d = (List<Tbseconditem>) object;
				seResult.setSeitemList(d); 
				seResult.setPageNum((Integer) maps.get("pageNum"));
				seResult.setPageSize((Integer)maps.get("pageSize"));
				seResult.setSize((Integer)maps.get("total"));
				seResult.setPages(((Integer)maps.get("total")+ 9)/9);
			}
		}
		
		return seResult ;
	}
	
	@Override
	public SeItemResult getItemAll(Integer pageNum) {
		HashMap<String, String> map	 =new  HashMap<String, String>();
		map.put("pageNum", pageNum.toString());	
		SeItemResult  seResult =new SeItemResult();
		String re = HttpClientUtil.doGet(REST_BASE_URL + REST_SECDITEM_ItemAll_URL,map);
		KZWResult  kzwResult = JsonUtils.jsonToPojo(re, KZWResult.class);
		if(StringUtils.isNotBlank(re)) {
			if(kzwResult.getData() != null) {
				Map maps = (Map) kzwResult.getData();
				Object object = maps.get("result");
				List<Tbseconditem> d = (List<Tbseconditem>) object;
				seResult.setSeitemList(d); 
				seResult.setPageNum((Integer) maps.get("pageNum"));
				seResult.setPageSize((Integer)maps.get("pageSize"));
				seResult.setSize((Integer)maps.get("total"));
				seResult.setPages(((Integer)maps.get("total")+ 19)/19);
			}
		}
		
		return seResult ;
	}

	
	@Override
	public int chageState(String itemId ) {
		HashMap<String, String> map	 =new  HashMap<String, String>();
		map.put("itemId", itemId);	
		SeItemResult  seResult =new SeItemResult();
		String re = HttpClientUtil.doGet(REST_BASE_URL + REST_SECDITEM_BUY_URL,map);
		KZWResult  kzwResult = JsonUtils.jsonToPojo(re, KZWResult.class);
		if(StringUtils.isNotBlank(re)) {
			
		}
		
		return 0 ;
	}
	
	

}
