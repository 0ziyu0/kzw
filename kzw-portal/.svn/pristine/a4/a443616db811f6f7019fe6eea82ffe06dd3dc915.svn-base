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
import com.kzw.portal.pojo.SearchItem;
import com.kzw.portal.pojo.SearchResult;
import com.kzw.portal.service.SearchService;

@Service("searchService")
public class SearchServiceImpl implements SearchService {

	@Value("${SEARCH_BASE_URL}")
	private String SEARCH_BASE_URL;
	@Value("${Second_SEARCH_BASE_URL}")
	private String Second_SEARCH_BASE_URL;
	@Value("${DETAIL_SEARCH_BASE_URL}")
	private String DETAIL_SEARCH_BASE_URL;
	
	@Override
	public SearchResult search(String keyword, int page, int rows) {
		
		Map<String, String> param = new HashMap<>();
		SearchResult result = new SearchResult();
		if(keyword != null) {
			param.put("keyword", keyword);
		}
		param.put("page", page + "");
		param.put("rows", rows + "");
		
		String json = HttpClientUtil.doPost(SEARCH_BASE_URL, param);
		if(StringUtils.isNotBlank(json)) {
			KZWResult kResult = JsonUtils.jsonToPojo(json, KZWResult.class);
			if(kResult.getData() != null) {
				Map map = (Map) kResult.getData();
				Object object = map.get("itemList");
				List<SearchItem> d = (List<SearchItem>) object;
				result.setItemList(d);
				Long count = (Long) map.get("Count");
				Integer pageCount = (Integer) map.get("pageCount");
				Integer curPage = (Integer) map.get("curPage");
				
				result.setCurPage(curPage);
				result.setPageCount(pageCount);
				result.setRecordCount(count);
			}
		}
		
		return result;
	}
	
	@Override
	public SeItemResult ssItem(Integer pageNum,String keyword) {
		HashMap<String, String> map	 =new  HashMap<String, String>();
		map.put("pageNum", pageNum.toString());
		map.put("keyword", keyword);	
		SeItemResult  seResult =new SeItemResult();
		String re = HttpClientUtil.doPost(Second_SEARCH_BASE_URL,map);
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
	public Tbseconditem selectByPrimaryKey(Long itemid) {
		HashMap<String, String> map	 =new  HashMap<String, String>();
		map.put("itemId", itemid.toString());	
		Tbseconditem  seResult =new Tbseconditem();
		String re = HttpClientUtil.doPost(DETAIL_SEARCH_BASE_URL,map);
		KZWResult  kzwResult = JsonUtils.jsonToPojo(re, KZWResult.class);
		
		if(StringUtils.isNotBlank(re)) {
			if(kzwResult.getData() != null) {
				Map maps = (Map) kzwResult.getData();
				String xx=(String) maps.get("itemid").toString();
				seResult.setItemid(Long.parseLong(xx));
				seResult.setUserid((Integer)maps.get("userid"));
				seResult.setUptime(maps.get("uptime").toString());
				seResult.setItemname((String)maps.get("itemname"));
				seResult.setImg((String)maps.get("img"));
				seResult.setItemprice(Float.parseFloat(maps.get("itemprice").toString())  );
				seResult.setItemdescription((String)maps.get("itemdescription"));
				seResult.setItemstate((Integer)maps.get("itemstate"));
			}
		}
		
		return seResult ;
	}
	
	
	
	
	

}























