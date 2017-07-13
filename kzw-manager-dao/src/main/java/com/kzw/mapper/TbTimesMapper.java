package com.kzw.mapper;

import org.apache.ibatis.annotations.Param;

import com.kzw.pojo.TbTimes;

public interface TbTimesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbTimes record);

    int insertSelective(TbTimes record);

    TbTimes selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbTimes record);

    int updateByPrimaryKey(TbTimes record);
    
    void deleteByStrategyId(@Param(value="StrategyId") Integer strategyId);
}