package com.kzw.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kzw.common.pojo.EasyUITreeNode;
import com.kzw.service.ItemCatService;

/**
 * 商品分类查询
 * @author 子煜
 *
 */
@Controller
@RequestMapping("/item/cat")
public class ItemCatController {

	@Resource
	private ItemCatService itemCatService;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<EasyUITreeNode> getItemCatList(@RequestParam(value="id", defaultValue="0") Long parentId) {
		
		return itemCatService.getItemCatList(parentId);
		
	}
	
	
}



























