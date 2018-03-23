package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.PicType;
import net.zgysrc.www.bean.PicTypeExample;
import org.apache.ibatis.annotations.Param;

public interface PicTypeMapper {
    long countByExample(PicTypeExample example);

    int deleteByExample(PicTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PicType record);

    int insertSelective(PicType record);

    List<PicType> selectByExample(PicTypeExample example);

    PicType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PicType record, @Param("example") PicTypeExample example);

    int updateByExample(@Param("record") PicType record, @Param("example") PicTypeExample example);

    int updateByPrimaryKeySelective(PicType record);

    int updateByPrimaryKey(PicType record);
}