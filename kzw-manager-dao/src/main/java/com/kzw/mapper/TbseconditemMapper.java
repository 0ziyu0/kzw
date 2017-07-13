package com.kzw.mapper;

import com.kzw.common.base.mapper.BaseMapper;
import com.kzw.pojo.Tbseconditem;

public interface TbseconditemMapper extends BaseMapper<Tbseconditem,Long> {
    int deleteByPrimaryKey(Long itemid);

    int insert(Tbseconditem record);

    int insertSelective(Tbseconditem record);

    Tbseconditem selectByPrimaryKey(Long itemid);

    int updateByPrimaryKeySelective(Tbseconditem record);

    int updateByPrimaryKey(Tbseconditem record);
}