package com.kzw.portal.controller;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.MediaType;

import com.kzw.common.pojo.KZWResult;
import com.kzw.pojo.TbItem;
import com.kzw.portal.service.ItemService;
import com.kzw.portal.service.StoreService;


@Controller
public class ItemController {

	@Resource
	private ItemService itemService;
	@Resource
	private StoreService storeService;
	
	@RequestMapping("/item/base/{itemId}")
	public String showItemInfo(@PathVariable Long itemId, String storeName, Model model) {
		
		TbItem item = itemService.getItemById(itemId);
		try {
			if(StringUtils.isNotBlank(storeName)) {
				String name = new String(storeName.getBytes("iso8859-1"), "utf-8");
				model.addAttribute("storeName", name);
			} else {
				// 通过itemId查询店铺名称
				KZWResult kzwResult = storeService.selectByStoreNameByItemId(itemId);
				String sName = (String) kzwResult.getData();
				model.addAttribute("storeName", sName);
			}
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		model.addAttribute("item", item);
		
		return "item";
	}
	
	@RequestMapping(value="/item/desc/{itemId}", produces=MediaType.TEXT_HTML_VALUE+";charset=utf-8") 
	@ResponseBody
	public String getItemDesc(@PathVariable Long itemId) {
		
		return itemService.getItemDescById(itemId);
	}
	
	@RequestMapping(value="/item/param/{itemId}", produces=MediaType.TEXT_HTML_VALUE+";charset=utf-8") 
	@ResponseBody
	public String getItemParam(@PathVariable Long itemId) {
		
		return itemService.getItemParamById(itemId);
	}
	
}




















