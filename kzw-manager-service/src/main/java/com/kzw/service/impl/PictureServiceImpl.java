package com.kzw.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.kzw.common.pojo.PictureResult;
import com.kzw.service.PictureService;

@Service("pictureService")
public class PictureServiceImpl implements PictureService {

	@Value("${IMAGE_SERVICE_ADDR}")
	private String IMAGE_SERVICE_ADDR;
	
	@Override
	public PictureResult uploadPic(MultipartFile picFile) {
		PictureResult result = new PictureResult();
		// 判断图片是否为空
		if(picFile.isEmpty()) {
			result.setError(1);
			result.setMessage("图片为空");
			return result;
		}
		// 将图片上传到服务器
		try{
			// 获取图片原始名字
			String originalFileName = picFile.getOriginalFilename();
			// 去掉上传文件的.
			String extName = originalFileName.substring(originalFileName.lastIndexOf(".") + 1);
			FastDFSClient client = new FastDFSClient("classpath:client.conf");
			String url = client.uploadFile(picFile.getBytes(), extName);
			// 相应URL给客户端		
			result.setError(0);		
			result.setUrl("http://" + IMAGE_SERVICE_ADDR + "/" + url);		
		}catch(Exception e) {
			e.printStackTrace();
			result.setError(1);
			result.setMessage("图片上传失败,请重试");
		}
		
		return result;
	}

	@Override
	public int deletePic(String group, String fileName) throws Exception {

		FastDFSClient client = new FastDFSClient("classpath:client.conf");
		
		return client.deleteFile(group, fileName);
	}

	
}



























