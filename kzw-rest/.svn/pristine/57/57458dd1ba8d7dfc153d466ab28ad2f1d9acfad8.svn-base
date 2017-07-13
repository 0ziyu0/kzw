package com.kzw.rest.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kzw.common.base.mapper.BaseMapper;
import com.kzw.common.base.service.impl.BaseServiceImpl;
import com.kzw.mapper.TbseconditemMapper;
import com.kzw.pojo.Tbseconditem;
import com.kzw.rest.service.SecondItemService;

@Service("seconditemService")
public class SecondItemServiceImpl extends BaseServiceImpl  <Tbseconditem,Long> implements SecondItemService    {

	@Resource
	private TbseconditemMapper tbseconditemMapper;

	
	@Resource(name = "tbseconditemMapper")
	@Override
	public void setBaseMapper(BaseMapper<Tbseconditem, Long> baseMapper) {
		this.baseMapper = baseMapper;
	}


	@Override
	public int updateByPrimaryKey(Tbseconditem record) {
		
		return tbseconditemMapper.updateByPrimaryKey(record);
	}
	
	
	
}
