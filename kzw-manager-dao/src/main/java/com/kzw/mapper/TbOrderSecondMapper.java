package com.kzw.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kzw.common.base.mapper.BaseMapper;
import com.kzw.common.pojo.SeOrderInfo;
import com.kzw.pojo.TbOrderSecond;

public interface TbOrderSecondMapper extends BaseMapper<TbOrderSecond, Long> {
    int deleteByPrimaryKey(Integer userid);

    int insert(TbOrderSecond record);

    int insertSelective(TbOrderSecond record);

    TbOrderSecond selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(TbOrderSecond record);

    int updateByPrimaryKey(TbOrderSecond record);
    
    
    List<SeOrderInfo> selectByUserIdforbuyer(@Param(value="userid") Integer userid);
    
    List<SeOrderInfo> selectByUserIdforseller(@Param(value="userid") Integer userid);
    
    
}