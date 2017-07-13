package com.kzw.search.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kzw.common.base.mapper.BaseMapper;
import com.kzw.common.base.service.impl.BaseServiceImpl;
import com.kzw.pojo.TbItem;
import com.kzw.search.mapper.ItemMapper;
import com.kzw.search.service.SearchService;

@Service("searchService")
public class SearchServiceImpl extends BaseServiceImpl<TbItem, Long> implements SearchService {

	@Resource
	private ItemMapper itemMapper;

	@Resource(name = "itemMapper")
	@Override
	public void setBaseMapper(BaseMapper<TbItem, Long> baseMapper) {
		this.baseMapper = baseMapper;
	}
	
	@Override
	public Integer selectCount(Integer beginTime) {
		
		return itemMapper.selectCount(beginTime);
	}

}
