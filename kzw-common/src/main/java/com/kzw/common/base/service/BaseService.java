package com.kzw.common.base.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.kzw.common.util.PageData;

public interface BaseService <T, PK extends Serializable>{

	/**
	 * 分页接口
	 * @param pageData
	 * @return
	 */
    public PageData selectPage(PageData pageData);

    /**
     * 插入
     * @param model
     * @return
     */
    T insert(T model);

    /**
     * 删除
     * @param modelPK
     * @return
     */
    int delete(PK modelPK);

    /**
     * 加载
     * @param model
     * @return
     */
    T load(T model);

    /**
     * 更新
     * @param model
     * @return
     */
    T update(T model);

    /**
     * 根据ID查询
     * @param modelPK
     * @return
     */
    T selectById(PK modelPK);

    /**
     * 查询总数
     * @param model
     * @return
     */
    long selectCount(T model);

    /**
     * 是否存在
     * @param model
     * @return
     */
    boolean isExist(T model);

    /**
     * 查询返回至listMap中
     * @param model
     * @return
     */
    List<Map<String, Object>> selectToList(T model);

    List<T> selectByModel(T model);
}
