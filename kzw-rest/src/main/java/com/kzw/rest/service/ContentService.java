package com.kzw.rest.service;

import java.util.List;

import com.kzw.common.pojo.KZWResult;
import com.kzw.pojo.TbContent;

public interface ContentService {

	/**
	 * 发布内容
	 * @param cid
	 * @return
	 */
	List<TbContent> getContentList(Long cid);
	
	/**
	 * 同步缓存--添加、修改时把以前缓存中内容删除
	 * @param cid
	 * @return
	 */
	KZWResult syncContent(Long cid);
}
