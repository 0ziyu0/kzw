package com.kzw.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kzw.common.pojo.EasyUIDataGridResult;
import com.kzw.common.pojo.KZWResult;
import com.kzw.common.util.HttpClientUtil;
import com.kzw.pojo.TbContent;
import com.kzw.service.ContentService;


@Controller
@RequestMapping("/content")
public class ContentController {

	@Resource
	private ContentService contentService;
	
	@Value("${REST_BASE_URL}")
	private String REST_BASE_URL;
	@Value("${REST_CONTENT_SYNC_URL}")
	private String REST_CONTENT_SYNC_URL;

	@RequestMapping("/save")
	@ResponseBody
	public KZWResult insertContent(TbContent content) {

		content.setCategoryId(89L);
		KZWResult result = contentService.insertContent(content);
		// 同步缓存
		HttpClientUtil.doGet(REST_BASE_URL + REST_CONTENT_SYNC_URL + content.getCategoryId());
		
		return result;

	}

	@RequestMapping("/query/list")
	@ResponseBody
	public EasyUIDataGridResult getContentList(Integer page, Integer rows) {

		return contentService.getContentList(page, rows);

	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public KZWResult delete(Long ids) {

		return contentService.deleteContent(ids);

	}
	
}



















