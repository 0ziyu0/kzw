package com.kzw.search.service;

import com.kzw.common.base.service.BaseService;
import com.kzw.pojo.TbItem;
import com.kzw.search.pojo.SearchResult;

public interface SearchService extends BaseService<TbItem, Long>{
	
	/**
	 * 按开始时间查询
	 * @param beginTime
	 * @return
	 */
	Integer selectCount(Integer beginTime);
}
