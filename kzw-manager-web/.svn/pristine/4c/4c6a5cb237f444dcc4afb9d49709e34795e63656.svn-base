package com.kzw.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kzw.common.pojo.EasyUITreeNode;
import com.kzw.common.pojo.KZWResult;
import com.kzw.service.ContentCatgoryService;


@Controller
@RequestMapping("/content/category")
public class ContentCategoryController {
	
	@Resource
	private ContentCatgoryService contentCatgoryService;
	 
	@RequestMapping("/list")
	@ResponseBody
	public List<EasyUITreeNode> getContentCatgoryList(@RequestParam(value = "id", defaultValue = "0") Long parentId) {
		
		return contentCatgoryService.getContentCatList(parentId);
		
	}
	
	@RequestMapping("/create")
	@ResponseBody
	public KZWResult createNode(Long parentId, String name) {
		
		return contentCatgoryService.insertCatgory(parentId, name);
		
	}
	
	
	
}































