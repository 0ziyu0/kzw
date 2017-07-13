package com.kzw.portal.controller;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kzw.pojo.Tbseconditem;
import com.kzw.portal.pojo.SeItemResult;
import com.kzw.portal.pojo.SearchResult;
import com.kzw.portal.service.SearchService;

@Controller
public class SearchController {

	@Resource
	private SearchService searchService;

	// 校园小店
	@RequestMapping("/search")
	public String search(@RequestParam("q") String keyword,
			@RequestParam(defaultValue = "1") Integer page,
			@RequestParam(defaultValue = "20") Integer rows, Model model) {

		try {
			keyword = new String(keyword.getBytes("iso8859-1"), "utf-8");
		} catch (UnsupportedEncodingException e) {
			keyword = "";
			e.printStackTrace();
		}

		SearchResult search = searchService.search(keyword, page, rows);
		model.addAttribute("query", keyword);
		model.addAttribute("totalPages", search.getPageCount());
		model.addAttribute("itemList", search.getItemList());
		model.addAttribute("page", search.getCurPage());

		return "search";
	}

	// 校园二手
	@RequestMapping("/searchSeItem")
	public String search(@RequestParam("q") String keyword,
			@RequestParam(defaultValue = "1") Integer pageNum, Model model) {
		try {
			keyword = new String(keyword.getBytes("iso8859-1"), "utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SeItemResult result = searchService.ssItem(pageNum, keyword);
		model.addAttribute("query", keyword);
		model.addAttribute("result", result);
		return "SsItemsearch";
	}



}
