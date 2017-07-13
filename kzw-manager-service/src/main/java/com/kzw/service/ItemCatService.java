package com.kzw.service;

import java.util.List;

import com.kzw.common.pojo.EasyUITreeNode;
import com.kzw.pojo.TbItemCat;

public interface ItemCatService {

	/**
	 * 得到分类列表
	 * @param parentId
	 * @return
	 */
	List<EasyUITreeNode> getItemCatList(long parentId);
	
	TbItemCat selectById(long id);
	
	void deleteById(long id);
	
	void updateCatById(long id, String name);
}
