package com.kzw.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kzw.common.pojo.EasyUIDataGridResult;
import com.kzw.common.pojo.KZWResult;
import com.kzw.mapper.TbContentMapper;
import com.kzw.pojo.TbContent;
import com.kzw.pojo.TbContentExample;
import com.kzw.pojo.TbContentExample.Criteria;
import com.kzw.service.ContentService;

@Service("contentService")
public class ContentServiceImpl implements ContentService {

	@Resource
	private TbContentMapper contentMapper;
	
	@Override
	public KZWResult insertContent(TbContent content) {
		
		Date date = new Date();
		content.setCreated(date);
		content.setUpdated(date);
		
		contentMapper.insertSelective(content);
		
		return KZWResult.ok();
	}

	@Override
	public EasyUIDataGridResult getContentList(Integer page, Integer rows) {
		
		TbContentExample example = new TbContentExample();
		Criteria criteria = example.createCriteria();
		
		PageHelper.startPage(page, rows);
		List<TbContent> list = contentMapper.selectByExample(example);
		PageInfo<TbContent> pageInfo = new PageInfo<TbContent>(list);
		
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(pageInfo.getList());
		
		return result;
	}

	@Override
	public KZWResult deleteContent(Long ids) {
		
		try {
			contentMapper.deleteByPrimaryKey(ids);
			return KZWResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return KZWResult.build(400, "删除错误...");
		}
		
	}

}






















