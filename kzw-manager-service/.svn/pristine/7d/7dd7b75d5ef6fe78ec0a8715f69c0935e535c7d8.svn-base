package com.kzw.service;

import java.util.List;

import com.kzw.common.base.service.BaseService;
import com.kzw.common.pojo.KZWResult;
import com.kzw.pojo.TbItem;
import com.kzw.pojo.TbItemDesc;
import com.kzw.pojo.TbItemParamItem;

public interface ItemService extends BaseService<TbItem, Long>{
	
	/**
	 * 添加
	 * @param item
	 * @param desc
	 * @return
	 */
	KZWResult createItem(TbItem item, String desc, String itemParam) throws Exception;

	/**
	 * 根据商品id把规格参数封装成html片段
	 * @param itemId
	 * @return
	 */
	String getItemParamHtml(Long itemId);
	
	/**
	 * 通过主键更新
	 * @param item
	 */
	void updateByPrimaryKey(TbItem item);

	/**
	 * 得到商品描述
	 * @param itemId
	 * @return
	 */
	TbItemDesc selectItemDescById(Long itemId);

	/**
	 * 得到商品的描述信息
	 * @param itemId
	 * @return
	 */
	TbItemParamItem selectItemParamItemById(Long itemId);

	/**
	 * 信息商品
	 * @param item
	 * @param desc
	 * @param itemParams
	 * @return
	 */
	KZWResult updateItemAndDescAndParams(TbItem item, String desc,
			String itemParams);

	/**
	 * 商品上架
	 * @param ids
	 */
	void instock(List<Long> ids);

	/**
	 * 商品下架
	 * @param itemIds
	 */
	void reshelf(List<Long> itemIds);
	
}
