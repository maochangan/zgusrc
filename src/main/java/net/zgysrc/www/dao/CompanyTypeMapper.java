package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.CompanyType;
import net.zgysrc.www.bean.CompanyTypeExample;
import org.apache.ibatis.annotations.Param;

public interface CompanyTypeMapper {
    long countByExample(CompanyTypeExample example);

    int deleteByExample(CompanyTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CompanyType record);

    int insertSelective(CompanyType record);

    List<CompanyType> selectByExample(CompanyTypeExample example);

    CompanyType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CompanyType record, @Param("example") CompanyTypeExample example);

    int updateByExample(@Param("record") CompanyType record, @Param("example") CompanyTypeExample example);

    int updateByPrimaryKeySelective(CompanyType record);

    int updateByPrimaryKey(CompanyType record);
}