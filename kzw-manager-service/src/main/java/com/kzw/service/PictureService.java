package com.kzw.service;

import org.springframework.web.multipart.MultipartFile;

import com.kzw.common.pojo.PictureResult;

public interface PictureService {
	
	/**
	 * 上传图片
	 * @param picFile
	 * @return
	 */
	PictureResult uploadPic(MultipartFile picFile);
	
	/**
	 * 删除文件
	 * @param group
	 * @param fileName
	 * @return
	 * @throws Exception
	 */
	int deletePic(String group, String fileName) throws Exception;
}
