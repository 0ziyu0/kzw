package com.kzw.search.service;

import com.kzw.common.base.service.BaseService;
import com.kzw.search.pojo.secondItem;

public interface SecondItemsService extends BaseService<secondItem, Long> {
	secondItem selectByPrimaryKey(Long itemid);
	
}
