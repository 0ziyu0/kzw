package com.kzw.search.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kzw.common.base.mapper.BaseMapper;
import com.kzw.pojo.TbItem;
import com.kzw.search.pojo.SearchItem;

public interface ItemMapper extends BaseMapper<TbItem, Long>{
	
	List<SearchItem> getItemList();

	Integer selectCount(@Param(value = "beginTime") Integer beginTime);
	
}
