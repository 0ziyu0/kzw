package com.kzw.service;

import java.util.List;

import com.kzw.pojo.TbPartner;

/**
 * 合伙人
 * @author 子煜
 *
 */
public interface PartnerService {

	/**
	 * 根据合伙人ID查询(包含店主)
	 * @param storeId
	 * @return
	 */
	List<TbPartner> selectByUserId(Long userID); 
	
	/**
	 * 通过ID查询合伙人
	 * @param storeId
	 * @return
	 */
	List<TbPartner> selectByStoreId(Long storeId);
	
	/**
	 * 保存
	 * @param partner
	 */
	void save(TbPartner partner);
	
	/**
	 * 删除
	 * @param id
	 */
	void delete(Long id);
}
