package com.kzw.portal.pojo;

import java.util.List;

import com.kzw.pojo.Tbseconditem;


public class SeItemResult {
	
	private List<Tbseconditem> seitemList;
	private int pageNum;    // 第几页
    private int pageSize;    // 每页记录数
    private int pages;        // 总页数	
    private int size;        // 当前页的数量
	public List<Tbseconditem> getSeitemList() {
		return seitemList;
	}
	public void setSeitemList(List<Tbseconditem> seitemList) {
		this.seitemList = seitemList;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
}
