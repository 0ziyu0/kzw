package com.kzw.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kzw.common.pojo.EasyUIDataGridResult;
import com.kzw.common.pojo.KZWResult;
import com.kzw.service.ItemParamService;


@Controller
@RequestMapping("/item/param")
public class ItemParamController {
	
	@Resource
	private ItemParamService itemParamService;
	
	@RequestMapping("/query/itemcatid/{cid}")
	@ResponseBody
	public KZWResult getItemCatByCid(@PathVariable Long cid) {
		
		return itemParamService.getItemParamByCid(cid);
	} 
	
	/**
	 * 保存
	 * @param cid
	 * @param paramData
	 * @return
	 */
	@RequestMapping("/save/{cid}")
	@ResponseBody
	public KZWResult insertItemParam(@PathVariable Long cid, String paramData) {
		
		return itemParamService.insertItemParam(cid, paramData);
	} 
	
	/**
	 * 展示规格参数
	 * @param cid
	 * @param paramData
	 * @return
	 */
	@RequestMapping("/list")
	@ResponseBody
	public EasyUIDataGridResult insertItemParam(Integer page, Integer rows) {
		
		EasyUIDataGridResult result = itemParamService.getItemList(page, rows);
		
		return result;
	} 
	
	/**
	 * 删除
	 * @param cid
	 * @return
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public KZWResult delete(Long [] ids) {
		KZWResult result = null;
		for (Long id : ids) {
			result = itemParamService.deleteItemParam(id);
		}
		
		return result;
	} 
}



























