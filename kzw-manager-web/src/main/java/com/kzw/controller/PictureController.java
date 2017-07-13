package com.kzw.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.kzw.common.pojo.PictureResult;
import com.kzw.common.util.JsonUtils;
import com.kzw.service.PictureService;

/**
 * 商品上传
 * @author 子煜
 *
 */
@Controller
public class PictureController {
	
	@Resource
	private PictureService pictureService;
	
	@RequestMapping("/pic/upload")
	@ResponseBody
	public String uploadFile(MultipartFile uploadFile) {
		
		PictureResult retult = pictureService.uploadPic(uploadFile);
		// 解决火狐浏览器兼容
		String json = JsonUtils.objectToJson(retult);
		return json;
	}
	
	
	
}


























