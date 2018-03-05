package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.IndustryCategory;
import net.zgysrc.www.bean.IndustryCategoryExample;
import org.apache.ibatis.annotations.Param;

public interface IndustryCategoryMapper {
    long countByExample(IndustryCategoryExample example);

    int deleteByExample(IndustryCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IndustryCategory record);

    int insertSelective(IndustryCategory record);

    List<IndustryCategory> selectByExample(IndustryCategoryExample example);

    IndustryCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IndustryCategory record, @Param("example") IndustryCategoryExample example);

    int updateByExample(@Param("record") IndustryCategory record, @Param("example") IndustryCategoryExample example);

    int updateByPrimaryKeySelective(IndustryCategory record);

    int updateByPrimaryKey(IndustryCategory record);
}