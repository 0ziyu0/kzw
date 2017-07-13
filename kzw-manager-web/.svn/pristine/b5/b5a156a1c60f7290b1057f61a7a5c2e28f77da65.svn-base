package com.kzw.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kzw.common.pojo.KZWResult;
import com.kzw.pojo.TbItemCat;
import com.kzw.service.ItemCatService;

@Controller
public class Classifications {

	@Resource
	private ItemCatService itemCatService;
	
	@RequestMapping("/classification/search")
	@ResponseBody
	public KZWResult search(Long id) {

		TbItemCat result = itemCatService.selectById(id);
		
		return KZWResult.ok(result);

	}
	
	@RequestMapping("/classification/delete")
	@ResponseBody
	public KZWResult delete(Long id) {

		try {
			itemCatService.deleteById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return KZWResult.build(400, "删除有误...");
		}
		
		return KZWResult.ok();

	}
	
	@RequestMapping("/classification/update")
	@ResponseBody
	public KZWResult update(Long id, String name) {

		try {
			String keyword = new String(name.getBytes("iso8859-1"), "utf-8");
			itemCatService.updateCatById(id, keyword);
		} catch (Exception e) {
			return KZWResult.build(400, "输入错误");
		}
		
		return KZWResult.ok();

	}
}
