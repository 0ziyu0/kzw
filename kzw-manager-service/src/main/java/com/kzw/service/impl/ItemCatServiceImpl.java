package com.kzw.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kzw.common.pojo.EasyUITreeNode;
import com.kzw.mapper.TbItemCatMapper;
import com.kzw.pojo.TbItemCat;
import com.kzw.pojo.TbItemCatExample;
import com.kzw.pojo.TbItemCatExample.Criteria;
import com.kzw.service.ItemCatService;

@Service("itemCatService")
public class ItemCatServiceImpl implements ItemCatService {
	
	@Resource
	private TbItemCatMapper itemCatMapper;

	@Override
	public List<EasyUITreeNode> getItemCatList(long parentId) {
		
		// 根据parentId查询到分类列表
		TbItemCatExample example = new TbItemCatExample();
		// 设置查询条件
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		
		// 执行查询
		List<TbItemCat> list = itemCatMapper.selectByExample(example);
		// 转化成EasyUITreeNode列表
		List<EasyUITreeNode> resultList = new ArrayList<>();
		for (TbItemCat itemCat : list) {
			// 创建一个节点对象
			EasyUITreeNode node = new EasyUITreeNode();
			node.setId(itemCat.getId());
			node.setText(itemCat.getName());
			node.setState(itemCat.getIsParent() ? "closed" : "open");
			resultList.add(node);
		}
		
		return resultList;
	}

	@Override
	public TbItemCat selectById(long id) {
		
		return itemCatMapper.selectByPrimaryKey(id);
		
	}

	@Override
	public void updateCatById(long id, String name) {
		
		itemCatMapper.updataById(id, name);
	}

	@Override
	public void deleteById(long id) {
		
		itemCatMapper.deleteByPrimaryKey(id);
	}

	
}

























