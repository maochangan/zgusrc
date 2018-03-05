package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.HatArea;
import net.zgysrc.www.bean.HatAreaExample;
import org.apache.ibatis.annotations.Param;

public interface HatAreaMapper {
    long countByExample(HatAreaExample example);

    int deleteByExample(HatAreaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HatArea record);

    int insertSelective(HatArea record);

    List<HatArea> selectByExample(HatAreaExample example);

    HatArea selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HatArea record, @Param("example") HatAreaExample example);

    int updateByExample(@Param("record") HatArea record, @Param("example") HatAreaExample example);

    int updateByPrimaryKeySelective(HatArea record);

    int updateByPrimaryKey(HatArea record);
}