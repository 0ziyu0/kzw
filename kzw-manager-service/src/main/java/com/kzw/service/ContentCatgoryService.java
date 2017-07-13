package com.kzw.service;

import java.util.List;

import com.kzw.common.pojo.EasyUITreeNode;
import com.kzw.common.pojo.KZWResult;

public interface ContentCatgoryService {

	/**
	 * 通过父节点得到树节点
	 * @param parentId
	 * @return
	 */
	List<EasyUITreeNode> getContentCatList(Long parentId);
	
	/**
	 * 添加节点
	 * @param parentId
	 * @return
	 */
	KZWResult insertCatgory(Long parentId, String name);
}
