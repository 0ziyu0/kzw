package com.kzw.common.pojo;

import java.util.List;

public class OrderRestule {

	private List<?> list;
	private Integer recordCount;
	private int pageCount;
	private int curPage;
	
	public List<?> getList() {
		return list;
	}
	public void setList(List<?> list) {
		this.list = list;
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
	public OrderRestule() {
		super();
	}
	public OrderRestule(List<?> list, Integer recordCount, int pageCount,
			int curPage) {
		super();
		this.list = list;
		this.recordCount = recordCount;
		this.pageCount = pageCount;
		this.curPage = curPage;
	}
	@Override
	public String toString() {
		return "OrderRestule [list=" + list + ", recordCount=" + recordCount
				+ ", pageCount=" + pageCount + ", curPage=" + curPage + "]";
	}
	
}
