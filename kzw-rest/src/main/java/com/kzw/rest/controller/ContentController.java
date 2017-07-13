package com.kzw.rest.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kzw.common.pojo.KZWResult;
import com.kzw.common.util.ExceptionUtil;
import com.kzw.pojo.TbContent;
import com.kzw.rest.service.ContentService;


@Controller
public class ContentController {

	@Resource
	private ContentService contentService;

	@RequestMapping("/content/{cid}")
	@ResponseBody
	public KZWResult getContentList(@PathVariable Long cid) {

		try {
			List<TbContent> list = contentService.getContentList(cid);
			return KZWResult.ok(list);
		} catch (Exception e) {
			e.printStackTrace();
			return KZWResult.build(500, ExceptionUtil.getStackTrace(e));
		}

	}

	@RequestMapping("/sync/content/{cid}")
	@ResponseBody
	public KZWResult syncContent(@PathVariable Long cid) {

		try {

			KZWResult result = contentService.syncContent(cid);
			return result;
		} catch (Exception e) {
			
			e.printStackTrace();
			return KZWResult.build(500, ExceptionUtil.getStackTrace(e));
		}

	}

}


























