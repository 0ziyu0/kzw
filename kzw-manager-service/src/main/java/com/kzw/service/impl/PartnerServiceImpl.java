package com.kzw.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kzw.mapper.TbPartnerMapper;
import com.kzw.pojo.TbPartner;
import com.kzw.service.PartnerService;

@Service("partnerService")
public class PartnerServiceImpl implements PartnerService {

	@Resource
	private TbPartnerMapper partnerMapper;
	
	@Override
	public List<TbPartner> selectByUserId(Long userId) {
		
		return partnerMapper.selectByUserId(userId);
	}

	@Override
	public List<TbPartner> selectByStoreId(Long storeId) {
		
		return partnerMapper.selectByStoreId(storeId);
	}

	@Override
	public void save(TbPartner partner) {
		
		partnerMapper.insertSelective(partner);
	}

	@Override
	public void delete(Long id) {
		
		partnerMapper.deleteByPrimaryKey(id);
	}

}
