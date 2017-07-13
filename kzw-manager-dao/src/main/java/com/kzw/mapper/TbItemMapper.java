package com.kzw.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kzw.common.base.mapper.BaseMapper;
import com.kzw.pojo.TbItem;

public interface TbItemMapper extends BaseMapper<TbItem, Long>{
    int deleteByPrimaryKey(Long id);

    int insert(TbItem record);

    int insertSelective(TbItem record);

    TbItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbItem record);

    int updateByPrimaryKey(TbItem record);

	void instock(@Param(value = "ids") List<Long> ids);
	
	void reshelf(@Param(value = "ids") List<Long> ids);
	
	List<TbItem> selectByCid(@Param(value = "id") Long id);
}