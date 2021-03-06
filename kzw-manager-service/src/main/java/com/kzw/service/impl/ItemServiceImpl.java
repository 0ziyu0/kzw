package com.kzw.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.kzw.common.base.mapper.BaseMapper;
import com.kzw.common.base.service.impl.BaseServiceImpl;
import com.kzw.common.pojo.KZWResult;
import com.kzw.common.util.IDUtils;
import com.kzw.common.util.JsonUtils;
import com.kzw.mapper.TbItemDescMapper;
import com.kzw.mapper.TbItemMapper;
import com.kzw.mapper.TbItemParamItemMapper;
import com.kzw.pojo.TbItem;
import com.kzw.pojo.TbItemDesc;
import com.kzw.pojo.TbItemParamItem;
import com.kzw.pojo.TbItemParamItemExample;
import com.kzw.pojo.TbItemParamItemExample.Criteria;
import com.kzw.service.ItemService;

@Service("itemService")
public class ItemServiceImpl extends BaseServiceImpl<TbItem, Long> implements ItemService {

	@Resource
	private TbItemMapper tbItemMapper;
	@Resource
	private TbItemDescMapper itemDescMapper;
	@Resource
	private TbItemParamItemMapper itemParamItemMapper;

	@Resource(name = "tbItemMapper")
	@Override
	public void setBaseMapper(BaseMapper<TbItem, Long> baseMapper) {
		this.baseMapper = baseMapper;
	}

	@Override
	public KZWResult createItem(TbItem item, String desc, String itemParam) throws Exception {

		// 生成商品id
		long itemId = IDUtils.genItemId();
		// 补全商品属性
		item.setId(itemId);
		// '商品状态，1-正常，2-下架，3-删除'
		item.setStatus((byte)1);
		Date date = new Date();
		item.setCreatetime(date);
		item.setUpdatetime(date);
		// 插入基本信息
		tbItemMapper.insertSelective(item);
		// 添加描述信息
		KZWResult result = this.insertItemDesc(itemId, desc, date);
		if(result.getStatus() != 200) {
			throw new Exception();
		}
		// 添加规格参数
		result = this.insertItemParamItem(itemId, itemParam, date);
		if(result.getStatus() != 200) {
			throw new Exception();
		}

		return KZWResult.ok();
	}

	/**
	 * 添加描述
	 * @param itemId
	 * @param desc
	 * @return
	 */
	private KZWResult insertItemDesc(Long itemId, String desc, Date date) {

		TbItemDesc itemDesc = new TbItemDesc();
		itemDesc.setItemId(itemId);
		itemDesc.setItemDesc(desc);
		itemDesc.setCreated(date);
		itemDescMapper.insertSelective(itemDesc);

		return KZWResult.ok();
	}

	/**
	 * 规格参数
	 * @param itemId
	 * @param itemParam
	 * @param date
	 * @return
	 */
	private KZWResult insertItemParamItem(Long itemId, String itemParam, Date date) {

		TbItemParamItem itemParamItem = new TbItemParamItem();
		itemParamItem.setCreated(date);
		itemParamItem.setItemId(itemId);
		itemParamItem.setParamData(itemParam);
		itemParamItem.setUpdated(date);
		itemParamItemMapper.insertSelective(itemParamItem);

		return KZWResult.ok();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public String getItemParamHtml(Long itemId) {

		TbItemParamItemExample example = new TbItemParamItemExample();
		com.kzw.pojo.TbItemParamItemExample.Criteria criteria = example.createCriteria();

		criteria.andItemIdEqualTo(itemId);
		List<TbItemParamItem> list = itemParamItemMapper.selectByExample(example);
		if(list ==null || list.isEmpty()) {
			return "";
		}

		// 取出规格参数
		TbItemParamItem itemParamItem = list.get(0);
		// 取json数据
		String paramData = itemParamItem.getParamData();
		List<Map> mapList = JsonUtils.jsonToList(paramData, Map.class);

		StringBuffer sb = new StringBuffer();
		sb.append("<table cellpadding=\"0\" cellspacing=\"1\" width=\"100%\" border=\"0\" class=\"Ptable\">\n");
		sb.append("	<tbody>\n");
		for (Map map : mapList) {
			sb.append("		<tr>\n");
			sb.append("			<th class=\"tdTitle\" colspan=\"2\">"+map.get("group")+"</th>\n");
			sb.append("		</tr>\n");
			//取规格项
			List<Map>mapList2 = (List<Map>) map.get("params");
			for (Map map2 : mapList2) {
				sb.append("		<tr>\n");
				sb.append("			<td class=\"tdTitle\">"+map2.get("k")+"</td>\n");
				sb.append("			<td>"+map2.get("v")+"</td>\n");
				sb.append("		</tr>\n");
			}
		}
		sb.append("	</tbody>\n");
		sb.append("</table>");

		return sb.toString();
	}

	@Override
	public void updateByPrimaryKey(TbItem item) {
		tbItemMapper.updateByPrimaryKey(item);

	}

	@Override
	public TbItemDesc selectItemDescById(Long itemId) {

		TbItemDesc itemDesc = itemDescMapper.selectByPrimaryKey(itemId);
		return itemDesc;
	}

	@Override
	public TbItemParamItem selectItemParamItemById(Long itemId) {
		// 暂时不走redis
		TbItemParamItem itemParamItem = null;
		TbItemParamItemExample example = new TbItemParamItemExample();
		Criteria criteria = example.createCriteria();
		criteria.andItemIdEqualTo(itemId);

		List<TbItemParamItem> list = itemParamItemMapper.selectByExampleWithBLOBs(example);
		// 取规格参数
		if(list != null && list.size() > 0) {
			itemParamItem = list.get(0);
		}

		return itemParamItem;
	}

	@Override
	public KZWResult updateItemAndDescAndParams(TbItem item, String desc,
			String itemParams) {
		// 修改基本信息
		if(item != null) {
			item.setUpdatetime(new Date());
			tbItemMapper.update(item);
		}
		// 修改描述
		if(StringUtils.isNotBlank(desc)) {
			TbItemDesc itemDesc = new TbItemDesc();
			itemDesc.setItemDesc(desc);
			itemDesc.setCreated(null);
			itemDesc.setUpdated(new Date());
			itemDesc.setItemId(item.getId());
			itemDescMapper.updateByPrimaryKeySelective(itemDesc);
		}
		// 修改参数
		if(StringUtils.isNotBlank(itemParams)) {
			TbItemParamItem paramItem = new TbItemParamItem();
			paramItem.setUpdated(new Date());
			paramItem.setParamData(itemParams);
			paramItem.setItemId(item.getId());
			itemParamItemMapper.updateByPrimaryKeySelective(paramItem);
		}
		
		return KZWResult.ok();
	}

	@Override
	public void instock(List<Long> ids) {
		
		tbItemMapper.instock(ids);
	}

	@Override
	public void reshelf(List<Long> itemIds) {
		
		tbItemMapper.reshelf(itemIds);
	}

}



















