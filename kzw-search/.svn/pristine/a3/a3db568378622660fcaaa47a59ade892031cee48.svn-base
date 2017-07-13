package com.kzw.search.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kzw.common.pojo.KZWResult;
import com.kzw.common.util.DataUtil;
import com.kzw.common.util.ExceptionUtil;
import com.kzw.common.util.PageData;
import com.kzw.common.util.PageDataGenerator;
import com.kzw.pojo.TbItem;
import com.kzw.search.pojo.SearchResult;
import com.kzw.search.pojo.secondItem;
import com.kzw.search.service.SearchService;
import com.kzw.search.service.SecondItemsService;


@Controller
public class SearchController {

	@Resource
	private SearchService searchService;
	
	@Resource
	private SecondItemsService secondItemsService;
	
	
	@RequestMapping("/q")
	@ResponseBody
	public KZWResult search(@RequestParam(defaultValue="") String keyword, 
			@RequestParam(defaultValue="1") Integer page, 
			@RequestParam(defaultValue="30") Integer rows, HttpServletRequest request) {
		
		try {
			SearchResult result = new SearchResult();
			String other = DataUtil.getWeekOfDate();
			Integer hours = DataUtil.getCurrentHour();
//			keyword = new String(keyword.getBytes("iso8859-1"), "utf-8");
			PageData pageDate = PageDataGenerator.newInstall(request, TbItem.class, true);
			
			pageDate.getParams().put("keyword", keyword);
			pageDate.getParams().put("beginTime", hours);
			pageDate.getParams().put("other", other);
			
			PageData p = searchService.selectPage(pageDate);
			/*List<SearchItem> itemList = (List<SearchItem>)p.getResult();*/
			
			Integer recordCount = p.getTotal();
			int pageCount = (recordCount / rows);
			if(recordCount % rows > 0) {
				pageCount++;
			}
			result.setPageCount(pageCount); // 总页数
			result.setCurPage(page); // 当前页
			result.setRecordCount(recordCount);
			result.setItemList(p.getResult());
			return KZWResult.ok(result);
		
		} catch (Exception e) {
			e.printStackTrace();
			return KZWResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	

	@RequestMapping("/ssItem")
	@ResponseBody
	public KZWResult searchseondItem(@RequestParam(defaultValue="") String keyword, 
			@RequestParam(defaultValue="1") Integer pageNum, 
			@RequestParam(defaultValue="20") Integer pageSize, HttpServletRequest request) {
		
		try {
			PageData pageDate = PageDataGenerator.newInstall(request, secondItem.class, true);	
			if(StringUtils.isNotBlank(keyword)){
				pageDate.getParams().put("keyword", keyword);
			}
			pageDate.getParams().put("itemState", 1);
			pageDate.setPageNum(pageNum);
			pageDate.setPageSize(pageSize);
			PageData p = secondItemsService.selectPage(pageDate);		
			return KZWResult.ok(p);
	
		} catch (Exception e) {
			e.printStackTrace();
			return KZWResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	@RequestMapping("/byItemId")
	@ResponseBody
	public KZWResult searchItemId( String itemId, HttpServletRequest request) {
		
		try {
			secondItem p = secondItemsService.selectByPrimaryKey( Long.parseLong(itemId));		
			return KZWResult.ok(p);
	
		} catch (Exception e) {
			e.printStackTrace();
			return KZWResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	}
	
	
	
	
	
	
	
}




















