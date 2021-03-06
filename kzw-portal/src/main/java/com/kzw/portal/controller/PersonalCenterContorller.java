package com.kzw.portal.controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.kzw.common.pojo.KZWResult;
import com.kzw.common.util.FastDFSClient;
import com.kzw.common.util.JsonUtils;
import com.kzw.common.util.RedisUtil;
import com.kzw.pojo.TbOrderSecond;
import com.kzw.pojo.TbUser;
import com.kzw.pojo.Tbseconditem;
import com.kzw.portal.pojo.SeItemResult;
import com.kzw.portal.service.OrderService;
import com.kzw.portal.service.PerCenterService;



@Controller
@RequestMapping("/personalCenter")
public class PersonalCenterContorller {
	//@Value("${IMAGE_SERVICE_ADDR}")
	private String IMAGE_SERVICE_ADDR ="119.29.137.97";
	@Resource
	private PerCenterService percenterService;
	@Resource
	private OrderService oderservice;
	
	@RequestMapping("/index")
	public String search(Model model) {	
		return "/personalCenter/add";
	}

	
	/**
	 * 上传商品
	 * @param itemname
	 * @param itemprice
	 * @param itemdescription
	 * @param request
	 * @param response
	 * @param img
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/add")  
	public KZWResult addSecondItem(String itemname,Float itemprice,String itemdescription,HttpServletRequest request,
			HttpServletResponse response,MultipartFile img,Model model) {	
		KZWResult result=new KZWResult();
		Tbseconditem seItem=new Tbseconditem();
		String userJson = RedisUtil.getUser(request);
		
		KZWResult format = KZWResult.format(userJson);
		format = KZWResult.formatToPojo(userJson, TbUser.class);
		TbUser user = (TbUser) format.getData();
		
		seItem.setUserid(user.getId().intValue());
		// 将图片上传到服务器
		try{
			// 获取图片原始名字
			String originalFileName = img.getOriginalFilename();
			// 去掉上传文件的.
			String extName = originalFileName.substring(originalFileName.lastIndexOf(".") + 1);
			FastDFSClient client = new FastDFSClient("classpath:client.conf");
			String url = client.uploadFile(img.getBytes(), extName);
			String urlimg="http://" + IMAGE_SERVICE_ADDR + "/" + url;
			seItem.setImg(urlimg);
			seItem.setItemdescription(itemdescription);
			seItem.setItemname(itemname);
			seItem.setItemprice(itemprice);
			int re=percenterService.InsertSecItem(seItem);
			if(re==0){
				result.setMsg("上传成功!");
			}
		}catch(Exception e) {
			e.printStackTrace();
			result.setMsg("上传失败,请重试");
		}
		return result;
	}
	
	/**
	 * 在售二手商品
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping("/onsell")
	public String OnSecondItem(HttpServletRequest request,@RequestParam(value="pageNum", defaultValue="1") Integer pageNum,HttpServletResponse response,Model model){
		String userJson = RedisUtil.getUser(request);
		KZWResult format = KZWResult.format(userJson);
		format = KZWResult.formatToPojo(userJson, TbUser.class);
		TbUser user = (TbUser) format.getData();
		String userId=user.getId().toString();
		SeItemResult  result  = percenterService.getOnsellItem(userId,pageNum);
		if(result.getSeitemList().size()>0){
			model.addAttribute("result",result);
		}else{
			model.addAttribute("msg","暂无数据！");	
		}
				
		return "personalCenter/onsell";	
	} 
	

	@RequestMapping("/onsellJson")
	@ResponseBody
	public String OnSecondItemJson(HttpServletRequest request,@RequestParam(value="pageNum", defaultValue="1") Integer pageNum,HttpServletResponse response,Model model){
		String userJson = RedisUtil.getUser(request);
		KZWResult format = KZWResult.format(userJson);
		format = KZWResult.formatToPojo(userJson, TbUser.class);
		TbUser user = (TbUser) format.getData();
		String userId=user.getId().toString();
		SeItemResult  result  = percenterService.getOnsellItem(userId,pageNum);
		if(result.getSeitemList().size()>0){
			return JsonUtils.objectToJson(result) ;	
		}else{
			return null;	
		}
		
	} 
	
	
	@RequestMapping("/buySeItem")
	public void buyItem(HttpServletRequest request,HttpServletResponse response,Model model,String itemId,String sellerId){
		String userJson = RedisUtil.getUser(request);
		KZWResult format = KZWResult.format(userJson);
		format = KZWResult.formatToPojo(userJson, TbUser.class);
		TbUser user = (TbUser) format.getData();
		String userId=user.getId().toString();		
		if(StringUtils.isNotBlank(userId) && StringUtils.isNotBlank(itemId));{
			oderservice.createSeOrder(userId,sellerId,itemId);	
			percenterService.chageState(itemId);
		}		
		
		return  ;
		
	} 
	
	@RequestMapping("/SeorderInfo")
	public String SeorderInfo(HttpServletRequest request,HttpServletResponse response,Model model){
		String userJson = RedisUtil.getUser(request);
		KZWResult format = KZWResult.format(userJson);
		format = KZWResult.formatToPojo(userJson, TbUser.class);
		TbUser user = (TbUser) format.getData();
		String userId=user.getId().toString();				
		model.addAttribute("resultList",oderservice.SeorderInfo(userId));
		return "personalCenter/Sencondorderlist";
	}

}
