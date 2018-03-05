package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.HatCity;
import net.zgysrc.www.bean.HatCityExample;
import org.apache.ibatis.annotations.Param;

public interface HatCityMapper {
    long countByExample(HatCityExample example);

    int deleteByExample(HatCityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HatCity record);

    int insertSelective(HatCity record);

    List<HatCity> selectByExample(HatCityExample example);

    HatCity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HatCity record, @Param("example") HatCityExample example);

    int updateByExample(@Param("record") HatCity record, @Param("example") HatCityExample example);

    int updateByPrimaryKeySelective(HatCity record);

    int updateByPrimaryKey(HatCity record);
}