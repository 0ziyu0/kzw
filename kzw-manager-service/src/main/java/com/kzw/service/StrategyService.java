package com.kzw.service;

import java.util.List;

import com.kzw.pojo.TbStrategy;
import com.kzw.pojo.TbTimes;
import com.kzw.vo.StrategyVo;

public interface StrategyService {

	/**
	 * 根据当前店铺id查询对应七天的策略
	 * @param storeId
	 * @return
	 */
	public List<TbStrategy> findStrategyList(Long storeId);
	
	/**
	 * 根据店铺查询对应的时间
	 * @param storeId
	 * @return
	 */
	public List<TbTimes> selectTimeBySid(int strategyId);
	
	/**
	 * 通过实体查询
	 * @param strategy
	 * @return
	 */
	public List<TbStrategy> selectByStrategy(TbStrategy strategy);

	/**
	 * 修改策略和时间
	 * @param strategyVo
	 */
	public void updateStrategyVo(StrategyVo strategyVo);
}
