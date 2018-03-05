package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.CompanyVip;
import net.zgysrc.www.bean.CompanyVipExample;
import org.apache.ibatis.annotations.Param;

public interface CompanyVipMapper {
    long countByExample(CompanyVipExample example);

    int deleteByExample(CompanyVipExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CompanyVip record);

    int insertSelective(CompanyVip record);

    List<CompanyVip> selectByExample(CompanyVipExample example);

    CompanyVip selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CompanyVip record, @Param("example") CompanyVipExample example);

    int updateByExample(@Param("record") CompanyVip record, @Param("example") CompanyVipExample example);

    int updateByPrimaryKeySelective(CompanyVip record);

    int updateByPrimaryKey(CompanyVip record);
}