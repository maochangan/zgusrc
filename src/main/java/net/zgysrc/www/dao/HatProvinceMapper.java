package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.HatProvince;
import net.zgysrc.www.bean.HatProvinceExample;
import org.apache.ibatis.annotations.Param;

public interface HatProvinceMapper {
    long countByExample(HatProvinceExample example);

    int deleteByExample(HatProvinceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HatProvince record);

    int insertSelective(HatProvince record);

    List<HatProvince> selectByExample(HatProvinceExample example);

    HatProvince selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HatProvince record, @Param("example") HatProvinceExample example);

    int updateByExample(@Param("record") HatProvince record, @Param("example") HatProvinceExample example);

    int updateByPrimaryKeySelective(HatProvince record);

    int updateByPrimaryKey(HatProvince record);
}