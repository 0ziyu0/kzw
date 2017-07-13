package com.kzw.controller;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kzw.common.pojo.EasyUIDataGridResult;
import com.kzw.common.pojo.KZWResult;
import com.kzw.common.util.DataUtil;
import com.kzw.common.util.ExceptionUtil;
import com.kzw.common.util.PageData;
import com.kzw.common.util.PageDataGenerator;
import com.kzw.common.util.RedisUtil;
import com.kzw.pojo.TbItem;
import com.kzw.pojo.TbItemDesc;
import com.kzw.pojo.TbItemParamItem;
import com.kzw.pojo.TbPartner;
import com.kzw.pojo.TbUser;
import com.kzw.service.ItemService;
import com.kzw.service.PartnerService;
import com.kzw.service.StoreService;


@Controller
public class ItemController {
	
	@Resource
	private ItemService itemService;
	@Resource
	private StoreService storeService;
	@Resource
	private PartnerService partnerService;
	
	/**
	 * 商品列表
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/item/list")
	@ResponseBody
	public EasyUIDataGridResult getItemList(TbItem tbItem, Integer page, Integer rows, HttpServletRequest request) {
		PageData pageDate = PageDataGenerator.newInstall(request, TbItem.class, true);
		// 得到当前登录人id。根据当前登录人的所属的店铺查询（查询合伙人表）
		String userJson = RedisUtil.getUser(request);
		KZWResult format = KZWResult.format(userJson);
		if(format.getStatus() != 200) {
			return null;
		}
		// 取用户信息
		format = KZWResult.formatToPojo(userJson, TbUser.class);
		TbUser user = (TbUser) format.getData();
		
		List<TbPartner> partnerList = partnerService.selectByUserId(user.getId());
		pageDate.getParams().put("storeId", partnerList.get(0).getStoreId());
		if(StringUtils.isNotBlank(tbItem.getCreatetimeStr())) {
			pageDate.getParams().put("createtime", DataUtil.getDateByString(tbItem.getCreatetimeStr()));
		}
		if(StringUtils.isNotBlank(tbItem.getUpdatetimeStr())) {
			pageDate.getParams().put("updatetime", DataUtil.getDateByString(tbItem.getUpdatetimeStr()));
		}
		PageData p = itemService.selectPage(pageDate);
		
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(p.getTotal());
		result.setRows(p.getResult());
		
		return result;
	}
	
	@RequestMapping("/item/datagrid")
	@ResponseBody
	public EasyUIDataGridResult datagrid(TbItem tbItem, Integer page, Integer rows, HttpServletRequest request) {
		PageData pageDate = PageDataGenerator.newInstall(request, TbItem.class, true);
		// 得到当前登录人id。根据当前登录人的所属的店铺查询（查询合伙人表）
		String userJson = RedisUtil.getUser(request);
		KZWResult format = KZWResult.format(userJson);
		if(format.getStatus() != 200) {
			return null;
		}
		// 取用户信息
		format = KZWResult.formatToPojo(userJson, TbUser.class);
		TbUser user = (TbUser) format.getData();
		
		List<TbPartner> partnerList = partnerService.selectByUserId(user.getId());
		pageDate.getParams().put("storeId", partnerList.get(0).getStoreId());
		PageData p = itemService.selectPage(pageDate);
		
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(p.getTotal());
		result.setRows(p.getResult());
		
		return result;
	}
	
	/**
	 * 商品保存
	 * @param item
	 * @param desc
	 * @param itemParam
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/item/save")
	@ResponseBody
	public KZWResult createItem(TbItem item, String desc, String itemParams, HttpServletRequest request) {
		
		KZWResult result = null;
//		String userJson = null;
		
		try {
			String userJson = RedisUtil.getUser(request);
			KZWResult format = KZWResult.format(userJson);
			if(format.getStatus() != 200) {
				return null;
			}
			// 取用户信息
			format = KZWResult.formatToPojo(userJson, TbUser.class);
			TbUser user = (TbUser) format.getData();
			// 店铺ID
			List<TbPartner> partner = partnerService.selectByUserId(user.getId());
			item.setStoreId(partner.get(0).getStoreId());
			result = itemService.createItem(item, desc, itemParams);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	/**
	 * 商品编辑
	 * @param itemIds
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/update")  
	@ResponseBody
	public KZWResult update(TbItem item, String desc, String itemParams) {
		
		KZWResult result = itemService.updateItemAndDescAndParams(item, desc, itemParams);
		
		return result;
	}
	
	/**
	 * 商品参数
	 * @param itemId
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/item/{itemId}")
	@ResponseBody
	public String showItemParam(@PathVariable Long itemId,  Model model) {
		
		model.addAttribute("html", itemService.getItemParamHtml(itemId));
		
		return "itemparam";
		
	}
	
	/**
	 * 删除
	 * @param ids
	 * @return
	 */
	@RequestMapping(value="/item/delete")  
	@ResponseBody
	public KZWResult delete(Long [] ids) {
		for (Long id : ids) {
			itemService.delete(id);
		}
		return KZWResult.ok();
	}
	
	/**
	 * 下架
	 * @param ids
	 * @return
	 */
	@RequestMapping(value="/item/instock")  
	@ResponseBody
	public KZWResult instock(Long [] ids) {
		List<Long> itemIds = new ArrayList<>();
		for (Long id : ids) {
			itemIds.add(id);
		}
		itemService.instock(itemIds);
		return KZWResult.ok();
	}
	
	@RequestMapping(value="/item/reshelf")  
	@ResponseBody
	public KZWResult reshelf(Long [] ids) {
		List<Long> itemIds = new ArrayList<>();
		for (Long id : ids) {
			itemIds.add(id);
		}
		itemService.reshelf(itemIds);
		return KZWResult.ok();
	}
	
	// ================== 获取商品有关参数 ===================== 
	/**
	 * 获取商品描述
	 * @param itemId 
	 * @return
	 */
	@RequestMapping("/item/desc/{itemId}")
	@ResponseBody
	public KZWResult getItemDescById(@PathVariable Long itemId) {
		
		try {
			TbItemDesc itemDesc = itemService.selectItemDescById(itemId);
			return KZWResult.ok(itemDesc);
		} catch (Exception e) {
			e.printStackTrace();
			return KZWResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	/**
	 * 获取商品描述
	 * @param itemId 
	 * @return
	 */
	@RequestMapping("/item/param/{itemId}")
	@ResponseBody
	public KZWResult getItemParamById(@PathVariable Long itemId) {
		
		try {
			TbItemParamItem result = itemService.selectItemParamItemById(itemId);
			return KZWResult.ok(result);
		} catch (Exception e) {
			e.printStackTrace();
			return KZWResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
	
	
}














