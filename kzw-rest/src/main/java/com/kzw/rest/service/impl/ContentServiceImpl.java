package com.kzw.rest.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.kzw.common.pojo.KZWResult;
import com.kzw.common.util.JsonUtils;
import com.kzw.mapper.TbContentMapper;
import com.kzw.pojo.TbContent;
import com.kzw.pojo.TbContentExample;
import com.kzw.pojo.TbContentExample.Criteria;
import com.kzw.rest.component.JedisClient;
import com.kzw.rest.service.ContentService;


@Service("contentService")
public class ContentServiceImpl implements ContentService {

	@Resource
	private TbContentMapper contentMapper;

	@Resource
	private JedisClient jedisClient;
	@Value("${REDIS_CONTENT_KEY}")
	private String REDIS_CONTENT_KEY;



	@Override
	public KZWResult syncContent(Long cid) {

		jedisClient.hdel(REDIS_CONTENT_KEY, cid + "");

		return KZWResult.ok();
	}


	@Override
	public List<TbContent> getContentList(Long cid) {
		// 添加缓存时不能影响正常的业务逻辑，必须用try包住
//		try {
//			String json = jedisClient.hget(REDIS_CONTENT_KEY, cid + "");
//			if(!StringUtils.isBlank(json)) {
//				List<TbContent> list = JsonUtils.jsonToList(json, TbContent.class);
//				return list;
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		TbContentExample example = new TbContentExample();
		Criteria criteria = example.createCriteria();
		criteria.andCategoryIdEqualTo(cid);

		List<TbContent> list = contentMapper.selectByExampleWithBLOBs(example);

		/*try {
			jedisClient.hset(REDIS_CONTENT_KEY, cid + "", JsonUtils.objectToJson(list));
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		return list;
	}

}




























