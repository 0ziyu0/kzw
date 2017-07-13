package com.kzw.search.pojo;

import java.util.List;


public class SearchResult {

	private List<?> itemList;
	private Integer recordCount;
	private int pageCount;
	private int curPage;
	public List<?> getItemList() {
		return itemList;
	}
	public void setItemList(List<?> itemList) {
		this.itemList = itemList;
	}
	public Integer getRecordCount() {
		return recordCount;
	}
	public void setRecordCount(Integer recordCount) {
		this.recordCount = recordCount;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public SearchResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SearchResult(List<?> itemList, Integer recordCount, int pageCount,
			int curPage) {
		super();
		this.itemList = itemList;
		this.recordCount = recordCount;
		this.pageCount = pageCount;
		this.curPage = curPage;
	}
	
}
