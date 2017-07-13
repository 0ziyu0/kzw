package com.kzw.common.util;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PageData implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int pageNum = 1; // 起始页
    private int pageSize = 10; // 每页条数
    private int total; // 总条数
    private String orderBy; // 排序
    private List<?> result; // 返回结果
    private boolean isPage; // 是否分页
    private Map<String, Object> params = new HashMap<String, Object>(); // 查询条件

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }


    public List<?> getResult() {
        return result;
    }

    public void setResult(List<?> result) {
        this.result = result;
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

    public boolean isPage() {
        return isPage;
    }

    public void setPage(boolean isPage) {
        this.isPage = isPage;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }
    
}
