package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.DeanInfo;
import net.zgysrc.www.bean.DeanInfoExample;
import org.apache.ibatis.annotations.Param;

public interface DeanInfoMapper {
    long countByExample(DeanInfoExample example);

    int deleteByExample(DeanInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeanInfo record);

    int insertSelective(DeanInfo record);

    List<DeanInfo> selectByExample(DeanInfoExample example);

    DeanInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeanInfo record, @Param("example") DeanInfoExample example);

    int updateByExample(@Param("record") DeanInfo record, @Param("example") DeanInfoExample example);

    int updateByPrimaryKeySelective(DeanInfo record);

    int updateByPrimaryKey(DeanInfo record);
}