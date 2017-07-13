package com.kzw.portal.service;

import com.kzw.pojo.Tbseconditem;
import com.kzw.portal.pojo.SeItemResult;
import com.kzw.portal.pojo.SearchResult;


public interface SearchService {

	SearchResult search(String keyword, int page, int rows);
	/**
	 * 所有商品
	 * @param userId
	 * @return
	 */
	SeItemResult   ssItem(Integer pageNum,String keyword);
	
	/**
	 * 根据商品ID查询 
	 * @param itemid
	 * @return
	 */
	Tbseconditem selectByPrimaryKey(Long itemid);
	
}
