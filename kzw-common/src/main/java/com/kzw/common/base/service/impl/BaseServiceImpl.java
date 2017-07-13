package com.kzw.common.base.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.kzw.common.base.mapper.BaseMapper;
import com.kzw.common.base.service.BaseService;
import com.kzw.common.util.PageData;

/**
 * 基础服务实现类
 * @author 子煜
 *
 */
public abstract class BaseServiceImpl<T, PK extends Serializable> implements BaseService<T, PK> {

	 protected BaseMapper<T, PK> baseMapper;
	 
	 public BaseMapper<T, PK> getBaseMapper() {
	        return baseMapper;
	    }

	    public void setBaseMapper(BaseMapper<T, PK> baseMapper) {
	        this.baseMapper = baseMapper;
	    }

	    @Override
	    public PageData selectPage(PageData pageData) {

	        // 分页
	        if (pageData.isPage()) {
	            PageHelper.startPage(pageData.getPageNum(), pageData.getPageSize(), true);
	        }
	        // 排序
	        /*if (pageData.getOrderBy() != null) {
	            PageHelper.orderBy(pageData.getOrderBy());
	        }*/
	        Page<T> page = (Page<T>) getBaseMapper().selectPage(pageData.getParams());
	        pageData.setResult(page.getResult());
	        pageData.setTotal((int) page.getTotal());
	        return pageData;
	    }

	    @Override
	    public T insert(T model) {
	        getBaseMapper().insert(model);
	        return model;
	    }


	    @Override
	    public int delete(PK modelPK) {
	        return getBaseMapper().delete(modelPK);
	    }


	    @Override
	    public T load(T model) {
	        return getBaseMapper().load(model);
	    }


	    @Override
	    public T update(T model) {
	        getBaseMapper().update(model);
	        return model;
	    }


	    @Override
	    public T selectById(PK modelPK) {
	        return getBaseMapper().selectById(modelPK);
	    }

	    @Override
	    public long selectCount(T model) {
	        return getBaseMapper().selectCount(model);
	    }

	    @Override
	    public boolean isExist(T model) {
	        long count = getBaseMapper().selectCount(model);
	        if (count > 0) {
	            return true;
	        }
	        return false;
	    }

	    @Override
	    public List<Map<String, Object>> selectToList(T model) {
	        return getBaseMapper().selectToList(model);
	    }

	    @Override
	    public List<T> selectByModel(T model) {
	        return getBaseMapper().selectByModel(model);
	    }
	 
}
