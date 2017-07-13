package com.kzw.rest.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kzw.mapper.TbItemDescMapper;
import com.kzw.mapper.TbItemMapper;
import com.kzw.mapper.TbItemParamItemMapper;
import com.kzw.pojo.TbItem;
import com.kzw.pojo.TbItemDesc;
import com.kzw.pojo.TbItemParamItem;
import com.kzw.pojo.TbItemParamItemExample;
import com.kzw.pojo.TbItemParamItemExample.Criteria;
import com.kzw.rest.component.JedisClient;
import com.kzw.rest.service.ItemService;

@Service("itemService")
public class ItemServiceImpl implements ItemService {
	
	@Resource
	private TbItemMapper itemMapper;
	@Resource
	private TbItemDescMapper itemDescMapper;
	@Resource
	private TbItemParamItemMapper itemParamItemMapper;
	
	@Resource
	private JedisClient jedisClient;
	
	@Override
	public TbItem getItemById(Long itemId) {
		// 由于服务器原因，暂时不走redis
		TbItem item = itemMapper.selectByPrimaryKey(itemId);
		return item;
	}

	@Override
	public TbItemDesc getItemDescById(Long itemId) {
		// 暂时不走redis
		TbItemDesc itemDesc = null;
		itemDesc = itemDescMapper.selectByPrimaryKey(itemId);
		return itemDesc;
	}

	@Override
	public TbItemParamItem getItemParamItemById(Long itemId) {
		// 暂时不走redis
		TbItemParamItem itemParamItem = null;
		TbItemParamItemExample example = new TbItemParamItemExample();
		Criteria criteria = example.createCriteria();
		criteria.andItemIdEqualTo(itemId);
		
		List<TbItemParamItem> list = itemParamItemMapper.selectByExampleWithBLOBs(example);
		// 取规格参数
		if(list != null && list.size() > 0) {
			itemParamItem = list.get(0);
		}
		
		return itemParamItem;
	}


	

}






























