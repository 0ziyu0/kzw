package com.kzw.portal.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kzw.common.pojo.KZWResult;
import com.kzw.common.util.RedisUtil;
import com.kzw.pojo.TbStore;
import com.kzw.pojo.TbUser;
import com.kzw.portal.pojo.SearchResult;
import com.kzw.portal.service.SearchService;
import com.kzw.portal.service.StoreService;
import com.kzw.portal.service.UserService;

@Controller
@RequestMapping("/store")
public class StoreController {

	@Resource
	private UserService userService;
	@Resource
	private StoreService storeService;
	@Resource
	private SearchService searchService;
	
	@RequestMapping("/checkStore")
	@ResponseBody
	public KZWResult checkStore(String token, Model model) {
		
		TbUser user = userService.selectUserByToken(token);
		if(user == null) {
			KZWResult.build(400, "用户信息不存在...");
		}
		// 查询店铺信息
		return storeService.selectByUserId(user.getId());
	}
	
	/**
	 * 店铺注册
	 * @return
	 */
	@RequestMapping("/register")
	public String register() {
		
		return "storeRegister";
	}
	
	/**
	 * 保存店铺
	 * @param store
	 * @return
	 */
	@RequestMapping("/saveRegister")
	public String saveRegister(TbStore store, HttpServletRequest request) {
		
		String userJson = RedisUtil.getUser(request);
		KZWResult format = KZWResult.format(userJson);
		if(format.getStatus() != 200) {
			return null;
		}
		// 取用户信息
		format = KZWResult.formatToPojo(userJson, TbUser.class);
		TbUser user = (TbUser) format.getData();
		store.setUserId(user.getId());
		KZWResult result = storeService.saveRegisterStore(store);
		
		return "redirect:/" ;
	}
	
	/**
	 * 校园小店
	 * @param page
	 * @param rows
	 * @param model
	 * @return
	 */
	@RequestMapping("/shop")
	public String shop(@RequestParam(defaultValue="1")Integer page, @RequestParam(defaultValue="20")Integer rows, Model model) {
		
		SearchResult search = searchService.search(null, page, rows);
		model.addAttribute("totalPages", search.getPageCount());
		model.addAttribute("itemList", search.getItemList());
		model.addAttribute("page", search.getCurPage());
		
		return "store";
	}
	
}