package com.kzw.search.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kzw.common.base.mapper.BaseMapper;
import com.kzw.common.base.service.impl.BaseServiceImpl;
import com.kzw.search.mapper.secondItemMapper;
import com.kzw.search.pojo.secondItem;
import com.kzw.search.service.SecondItemsService;


@Service("seconditemsService")
public class SecondItemsServiceImpl extends BaseServiceImpl<secondItem, Long>  implements SecondItemsService {

	@Resource
	private secondItemMapper secondItemMapper;

	
	@Resource(name ="secondItemMapper")
	@Override
	public void setBaseMapper(BaseMapper<secondItem, Long> baseMapper) {
		this.baseMapper = baseMapper;
	}


	@Override
	public secondItem selectByPrimaryKey(Long itemid) {
		
		return secondItemMapper.selectByPrimaryKey(itemid);
	}
	
	
	
}
