package com.kzw.rest.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kzw.common.pojo.KZWResult;
import com.kzw.common.util.DateUtil;
import com.kzw.common.util.ExceptionUtil;
import com.kzw.common.util.IDUtils;
import com.kzw.common.util.PageData;
import com.kzw.common.util.PageDataGenerator;
import com.kzw.pojo.Tbseconditem;
import com.kzw.rest.service.SecondItemService;

@Controller
@RequestMapping("/secondItem")
public class SecondItemController {

	@Resource
	private SecondItemService secondItemService;

	/**
	 * 二手商品上传
	 * 
	 * @param secondItem
	 * @return
	 */
	@RequestMapping("/upload")
	@ResponseBody
	public KZWResult InsetItems(Integer userid, String itemname, String img,
			Float itemprice, String itemdescription) {

		try {
			Tbseconditem secondItem = new Tbseconditem();

			IDUtils idutil = new IDUtils();
			DateUtil date = new DateUtil();
			secondItem.setItemid(idutil.genItemId());
			secondItem.setUserid(userid);
			secondItem.setImg(img);
			//secondItem.setUptime(date.NowTime("yyyy-MM-dd HH:mm:ss").toString());			secondItem.setItemname(itemname);
			secondItem.setItemdescription(itemdescription);
			secondItem.setItemprice(itemprice.floatValue());
			secondItem.setItemstate(1);
			Tbseconditem re = secondItemService.insert(secondItem);
			return KZWResult.ok(re);
		} catch (Exception e) {
			e.printStackTrace();
			return KZWResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	
	@RequestMapping("/onsell")
	@ResponseBody
	public KZWResult getseItembyuserId(HttpServletRequest request,String userId,Integer pageNum) {
		try {
			PageData pageDate = PageDataGenerator.newInstall(request,
					Tbseconditem.class, true);
			pageDate.getParams().put("userId", userId);
			pageDate.getParams().put("itemState", 1);//商品状态
			pageDate.setPageNum(pageNum);
		//	pageDate.getParams().put("pageNum", pageNum);
			PageData result = secondItemService.selectPage(pageDate);
			return KZWResult.ok(result);
		} catch (Exception e) {
			e.printStackTrace();
			return KZWResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
	@RequestMapping("/ItemAll")
	@ResponseBody
	public KZWResult getItemAll(HttpServletRequest request,Integer pageNum) {
		try {
			PageData pageDate = PageDataGenerator.newInstall(request,
					Tbseconditem.class, true);
			pageDate.getParams().put("itemState", 1);//商品状态
			pageDate.setPageNum(pageNum);
			pageDate.setPageSize(20);
			PageData result = secondItemService.selectPage(pageDate);
			return KZWResult.ok(result);
		} catch (Exception e) {
			e.printStackTrace();
			return KZWResult.build(500, ExceptionUtil.getStackTrace(e));
		}

	}	

	@RequestMapping("/changeState")
	@ResponseBody
	public KZWResult buySeItem(HttpServletRequest request,String  itemId) {
		try {
			Tbseconditem secondItem = new Tbseconditem();
			secondItem.setItemid(Long.parseLong(itemId));
			secondItem.setItemstate(0);//已经购买
			int x=secondItemService.updateByPrimaryKey(secondItem);
			return KZWResult.ok(x);
		} catch (Exception e) {
			e.printStackTrace();
			return KZWResult.build(500, ExceptionUtil.getStackTrace(e));
		}

	}	
	
	
	

}
