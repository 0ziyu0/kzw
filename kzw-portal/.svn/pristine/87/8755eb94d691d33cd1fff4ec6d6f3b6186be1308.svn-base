package com.kzw.portal.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
import com.kzw.pojo.TbUser;
import com.kzw.pojo.Tbseconditem;
import com.kzw.portal.pojo.SeItemResult;
import com.kzw.portal.service.PerCenterService;
import com.kzw.portal.service.SearchService;

@Controller
@RequestMapping("/secondItem")
public class SecondItemController {

	@Resource
	private PerCenterService percenterService;
	@Resource
	private SearchService searchService;

	@RequestMapping("/SecondItemList")
	public String search(HttpServletRequest request,@RequestParam(value="pageNum", defaultValue="1") Integer pageNum,HttpServletResponse response,Model model) {
		SeItemResult  result  = percenterService.getItemAll(pageNum);
		if(result.getSeitemList().size()>0){
			model.addAttribute("result",result);
		}else{
			model.addAttribute("msg","暂无数据！");	
		}
				
		return "/secondItem";
	}
	
	
	// 二手详情
	@RequestMapping("/base/detail")
	public String search(Long itemId, Model model) {	
		Tbseconditem result = searchService.selectByPrimaryKey(itemId);
		model.addAttribute("item", result);
		return "DetailSeitem";
	}
	
	
	
	

}
