package com.kzw.mapper;

import com.kzw.pojo.TbRoleUser;
import com.kzw.pojo.TbRoleUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRoleUserMapper {
    int countByExample(TbRoleUserExample example);

    int deleteByExample(TbRoleUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbRoleUser record);

    int insertSelective(TbRoleUser record);

    List<TbRoleUser> selectByExample(TbRoleUserExample example);

    TbRoleUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbRoleUser record, @Param("example") TbRoleUserExample example);

    int updateByExample(@Param("record") TbRoleUser record, @Param("example") TbRoleUserExample example);

    int updateByPrimaryKeySelective(TbRoleUser record);

    int updateByPrimaryKey(TbRoleUser record);
    
    List<TbRoleUser> selectByUserId(@Param("userId") Long userId);
}