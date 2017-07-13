package com.kzw.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kzw.common.pojo.EasyUIDataGridResult;
import com.kzw.common.pojo.KZWResult;
import com.kzw.mapper.TbItemParamItemMapper;
import com.kzw.mapper.TbItemParamMapper;
import com.kzw.pojo.TbItemParam;
import com.kzw.pojo.TbItemParamExample;
import com.kzw.pojo.TbItemParamExample.Criteria;
import com.kzw.service.ItemParamService;

@Service("itemParamService")
public class ItemParamServiceImpl implements ItemParamService {

	@Resource
	private TbItemParamMapper itemParamMapper;
	@Resource
	private TbItemParamItemMapper itemParamItemMapper;


	@Override
	public KZWResult getItemParamByCid(Long cid) {

		TbItemParamExample example = new TbItemParamExample();
		Criteria criteria = example.createCriteria();
		criteria.andItemCatIdEqualTo(cid);

		List<TbItemParam> list = itemParamMapper.selectByExampleWithBLOBs(example);
		if(list != null && list.size() > 0) {
			TbItemParam itemParam = list.get(0);
			return KZWResult.ok(itemParam);
		}

		return KZWResult.ok();
	}

	@Override
	public KZWResult insertItemParam(Long cid, String paramData) {

		TbItemParam itemParam = new TbItemParam();
		Date date = new Date();

		itemParam.setItemCatId(cid);
		itemParam.setParamData(paramData);
		itemParam.setCreated(date);
		itemParam.setUpdated(date);

		itemParamMapper.insertSelective(itemParam);

		return KZWResult.ok();
	}

	@Override
	public EasyUIDataGridResult getItemList(Integer page, Integer rows) {
		TbItemParamExample example = new TbItemParamExample();
		//分页处理
		PageHelper.startPage(page, rows);
		List<TbItemParam> list = itemParamMapper.selectByExampleWithBLOBs(example);
		//创建一个返回值对象
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setRows(list);

		//取记录总条数
		PageInfo<TbItemParam> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	@Override
	public KZWResult deleteItemParam(Long cid) {
		try{
			itemParamMapper.deleteByPrimaryKey(cid);
		} catch(Exception e) {
			return KZWResult.build(400, "删除有误!!");
		}
		
		return KZWResult.ok();
	}

}





















