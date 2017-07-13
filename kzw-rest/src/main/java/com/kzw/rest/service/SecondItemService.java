package com.kzw.rest.service;

import com.kzw.common.base.service.BaseService;
import com.kzw.pojo.Tbseconditem;

public interface SecondItemService extends BaseService<Tbseconditem, Long> {
	
	int updateByPrimaryKey(Tbseconditem record);
}
