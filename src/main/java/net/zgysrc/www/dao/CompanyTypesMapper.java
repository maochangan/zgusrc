package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.CompanyTypes;
import net.zgysrc.www.bean.CompanyTypesExample;
import org.apache.ibatis.annotations.Param;

public interface CompanyTypesMapper {
    long countByExample(CompanyTypesExample example);

    int deleteByExample(CompanyTypesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CompanyTypes record);

    int insertSelective(CompanyTypes record);

    List<CompanyTypes> selectByExample(CompanyTypesExample example);

    CompanyTypes selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CompanyTypes record, @Param("example") CompanyTypesExample example);

    int updateByExample(@Param("record") CompanyTypes record, @Param("example") CompanyTypesExample example);

    int updateByPrimaryKeySelective(CompanyTypes record);

    int updateByPrimaryKey(CompanyTypes record);
}