package com.kzw.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kzw.common.pojo.EasyUITreeNode;
import com.kzw.common.pojo.KZWResult;
import com.kzw.mapper.TbContentCategoryMapper;
import com.kzw.pojo.TbContentCategory;
import com.kzw.pojo.TbContentCategoryExample;
import com.kzw.pojo.TbContentCategoryExample.Criteria;
import com.kzw.service.ContentCatgoryService;

@Service("contentCatgoryService")
public class ContentCatgoryServiceImpl implements ContentCatgoryService {

	@Resource
	private TbContentCategoryMapper contentCategoryMapper;
	
	@Override
	public List<EasyUITreeNode> getContentCatList(Long parentId) {
		
		TbContentCategoryExample example = new TbContentCategoryExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		
		List<TbContentCategory> list = contentCategoryMapper.selectByExample(example);
		
		List<EasyUITreeNode> resultList = new ArrayList<>();
		for (TbContentCategory contentCategory : list) {
			EasyUITreeNode node = new EasyUITreeNode();
			node.setId(contentCategory.getId());
			node.setText(contentCategory.getName());
			node.setState(contentCategory.getIsParent() ? "closed" : "open");
			resultList.add(node);
		}
		
		return resultList;
	}

	@Override
	public KZWResult insertCatgory(Long parentId, String name) {
		
		TbContentCategory contentCatgory = new TbContentCategory();
		Date date = new Date();
		
		contentCatgory.setName(name);
		contentCatgory.setParentId(parentId);
		// 1(正常),2(删除)
		contentCatgory.setStatus(1);
		contentCatgory.setIsParent(false);
		//'排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数'
		contentCatgory.setSortOrder(1);
		contentCatgory.setCreated(date);
		contentCatgory.setUpdated(date);
		
		contentCategoryMapper.insertSelective(contentCatgory);
		// 取返回的主键
		Long id = contentCatgory.getId();
		// 更新当前插入的节点的父节点的isParent属性
		TbContentCategory parentNode = contentCategoryMapper.selectByPrimaryKey(parentId);
		if(!parentNode.getIsParent()) {
			parentNode.setIsParent(true);
			contentCategoryMapper.updateByPrimaryKey(parentNode);
		}
		
		// 返回主键
		return KZWResult.ok(id);
		
	}

}
























