package com.kzw.common.base.mapper;

import java.util.List;
import java.util.Map;
import com.github.pagehelper.Page;

public interface BaseMapper<T, PK extends java.io.Serializable> {
	
	/**
	 * 插入
	 * @param params
	 * @return
	 */
	Page<T> selectPage(Map<String, Object> params);
	
	/**
	 * 删除
	 * @param model
	 * @return
	 */
	long selectCount(T model);
	
	/**
	 * 加载
	 * @param model
	 * @return
	 */
	int insert(T model);
	
	/**
	 * 更新
	 * @param modelPK
	 * @return
	 */
	int delete(PK modelPK);
	
	/**
	 * 
	 * @param model
	 * @return
	 */
	T load(T model);
	
	/**
	 * 根据ID查询
	 * @param model
	 * @return
	 */
	int update(T model);
	
	/**
	 * 
	 * @param modelPK
	 * @return
	 */
	T selectById(PK modelPK);
	
	/**
	 * 查询返回至listMap中
	 * @param model
	 * @return
	 */
	List<Map<String, Object>> selectToList(T model);
	
	/**
	 * 根据实体查询
	 * @param model
	 * @return
	 */
	List<T> selectByModel(T model);
}
