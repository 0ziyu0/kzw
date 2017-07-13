package com.kzw.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kzw.mapper.TbStrategyMapper;
import com.kzw.mapper.TbTimesMapper;
import com.kzw.pojo.TbStrategy;
import com.kzw.pojo.TbTimes;
import com.kzw.service.StrategyService;
import com.kzw.vo.StrategyVo;

@Service("strategyService")
public class StrategyServiceImpl implements StrategyService {

	@Resource
	private TbStrategyMapper strategyMapper;
	@Resource
	private TbTimesMapper timesMapper;
	
	@Override
	public List<TbStrategy> findStrategyList(Long storeId) {
		
		return strategyMapper.findStrategyList(storeId);
	}

	@Override
	public List<TbTimes> selectTimeBySid(int strategyId) {
		
		return strategyMapper.selectTimeBySid(strategyId);
	}

	@Override
	public List<TbStrategy> selectByStrategy(TbStrategy strategy) {
		
		return strategyMapper.selectByStrategy(strategy);
	}

	@Override
	public void updateStrategyVo(StrategyVo strategyVo) {
		// 策略
		strategyMapper.updateByPrimaryKeySelective(strategyVo.getStrategy());
		// 时间
		timesMapper.deleteByStrategyId(strategyVo.getStrategy().getId());
		for (TbTimes times : strategyVo.getTimesList()) {
			if(times != null && times.getBeginTime() != null){
				timesMapper.insert(times);
			}
		}
	}

}
