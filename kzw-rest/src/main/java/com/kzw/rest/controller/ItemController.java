package com.kzw.rest.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kzw.common.pojo.KZWResult;
import com.kzw.common.util.ExceptionUtil;
import com.kzw.pojo.TbItem;
import com.kzw.pojo.TbItemDesc;
import com.kzw.pojo.TbItemParamItem;
import com.kzw.rest.service.ItemService;

/**
 * 这里的信息改成不走redis，直接查询数据库
 * @author 子煜
 *
 */
@Controller
@RequestMapping("/item")
public class ItemController {
	
	@Resource
	private ItemService itemService;
	
	@RequestMapping("/base/{itemId}")
	@ResponseBody
	public KZWResult getItemById(@PathVariable Long itemId) {
		
		try {
			TbItem result = itemService.getItemById(itemId);
			return KZWResult.ok(result);
		} catch (Exception e) {
			e.printStackTrace();
			return KZWResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	/**
	 * 获取商品描述信息
	 * @param itemId
	 * @return
	 */
	@RequestMapping("/desc/{itemId}")
	@ResponseBody
	public KZWResult getItemDescById(@PathVariable Long itemId) {
		
		try {
			TbItemDesc itemDesc = itemService.getItemDescById(itemId);
			return KZWResult.ok(itemDesc);
		} catch (Exception e) {
			e.printStackTrace();
			return KZWResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	@RequestMapping("/param/{itemId}")
	@ResponseBody
	public KZWResult getItemParamById(@PathVariable Long itemId) {
		
		try {
			TbItemParamItem result = itemService.getItemParamItemById(itemId);
			return KZWResult.ok(result);
		} catch (Exception e) {
			e.printStackTrace();
			return KZWResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	
	
}


























