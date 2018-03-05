package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.CompanyUser;
import net.zgysrc.www.bean.CompanyUserExample;
import org.apache.ibatis.annotations.Param;

public interface CompanyUserMapper {
    long countByExample(CompanyUserExample example);

    int deleteByExample(CompanyUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CompanyUser record);

    int insertSelective(CompanyUser record);

    List<CompanyUser> selectByExample(CompanyUserExample example);

    CompanyUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CompanyUser record, @Param("example") CompanyUserExample example);

    int updateByExample(@Param("record") CompanyUser record, @Param("example") CompanyUserExample example);

    int updateByPrimaryKeySelective(CompanyUser record);

    int updateByPrimaryKey(CompanyUser record);
}