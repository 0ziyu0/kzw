package com.kzw.rest.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kzw.rest.pojo.CatNode;
import com.kzw.rest.pojo.ItemCatResult;
import com.kzw.rest.pojo.Products;
import com.kzw.rest.service.ItemCatService;
import com.kzw.common.pojo.KZWResult;
import com.kzw.common.util.DataUtil;
import com.kzw.mapper.TbItemCatMapper;
import com.kzw.mapper.TbItemMapper;
import com.kzw.mapper.TbStoreMapper;
import com.kzw.pojo.TbItem;
import com.kzw.pojo.TbItemCat;
import com.kzw.pojo.TbItemCatExample;
import com.kzw.pojo.TbItemCatExample.Criteria;
import com.kzw.pojo.TbStore;

@Service("itemCatService")
public class ItemCatServiceImpl implements ItemCatService {

	@Resource
	private TbItemCatMapper itemCatMapper;
	
	@Resource
	private TbItemMapper itemMapper;
	@Resource
	private TbStoreMapper storeMapper;

	@Override
	public ItemCatResult getItemCatList() {
		// 这里使用递归的方法查询商品分类列表
		List catList = this.getItemCatList(0l);

		ItemCatResult result = new ItemCatResult();
		result.setData(catList);

		return result;
	}

	@Override
	public List getItemCatList(Long parentId) {
		// 根据父id查询列表
		TbItemCatExample example = new TbItemCatExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		List<TbItemCat> list = itemCatMapper.selectByExample(example);

		// 根据前台面叶显示效果，左超过14会超越下边栏
		int index = 0;
		List resultList = new ArrayList<>();
		for (TbItemCat itemCat : list) {
			if(index >= 14) {
				break;
			}
			// 如果是父节点
			if(itemCat.getIsParent()) {
				CatNode node = new CatNode();
				node.setUrl("/products/" + itemCat.getId() + ".html");
				// 如果当前节点是第一级节点
				if(itemCat.getParentId() == 0) {
					// search.html?q=
					node.setName("<a href='/products/" + itemCat.getId() + ".html'>" + itemCat.getName() + "</a>");
					// 一级节点不能超过14
					index++;
				} else {
					node.setName(itemCat.getName());
				}
				node.setItems(this.getItemCatList(itemCat.getId()));
				// 把弄得添加到列表中
				resultList.add(node);
			} else {
				// 如果是叶子节点
				String item = "/products/" + itemCat.getId() + ".html|" + itemCat.getName();
				resultList.add(item);
			}
		}

		return resultList;
	}

	@Override
	public KZWResult getProductsById(Long parentId) {

		List<TbItem> result = new ArrayList<>();
		List<Products> resultList = new ArrayList<>();
		List catList = this.getProducts(parentId, result);
		for (TbItem item : result) {
			// 通过商品id查询店铺名称
			TbStore store = storeMapper.selectByPrimaryKey(item.getStoreId());
			// 查询开店时间
			Integer num = storeMapper.countNum(store.getId(), DataUtil.getWeekOfDate(), DataUtil.getCurrentHour());
			if(num > 0) {
				Products p = new Products();
				p.setItem(item);
				p.setStore_name(store.getStoreName());
				resultList.add(p);
			}
		}

		return KZWResult.ok(resultList);
	}

	private List getProducts(Long parentId, List<TbItem> result) {
		// 根据父id查询列表
		TbItemCatExample example = new TbItemCatExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		List<TbItemCat> list = itemCatMapper.selectByExample(example);
		if(list.size() < 1) {
			List<TbItem> itemList = itemMapper.selectByCid(parentId);
			for (TbItem tbItem : itemList) {
				result.add(tbItem);
			}
			return result;
		}
		for (TbItemCat itemCat : list) {
			if(itemCat.getIsParent()) {
				this.getProducts(itemCat.getId(), result);
				
			} else {
				// 如果是叶子节点通过分类id查询
				List<TbItem> itemList = itemMapper.selectByCid(itemCat.getId());
				for (TbItem tbItem : itemList) {
					result.add(tbItem);
				}
			}
		}
		
		return result;
	}

}






























