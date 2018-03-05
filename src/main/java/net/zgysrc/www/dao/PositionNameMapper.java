package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.PositionName;
import net.zgysrc.www.bean.PositionNameExample;
import org.apache.ibatis.annotations.Param;

public interface PositionNameMapper {
    long countByExample(PositionNameExample example);

    int deleteByExample(PositionNameExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PositionName record);

    int insertSelective(PositionName record);

    List<PositionName> selectByExample(PositionNameExample example);

    PositionName selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PositionName record, @Param("example") PositionNameExample example);

    int updateByExample(@Param("record") PositionName record, @Param("example") PositionNameExample example);

    int updateByPrimaryKeySelective(PositionName record);

    int updateByPrimaryKey(PositionName record);
}