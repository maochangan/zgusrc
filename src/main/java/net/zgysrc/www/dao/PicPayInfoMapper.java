package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.PicPayInfo;
import net.zgysrc.www.bean.PicPayInfoExample;
import org.apache.ibatis.annotations.Param;

public interface PicPayInfoMapper {
    long countByExample(PicPayInfoExample example);

    int deleteByExample(PicPayInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PicPayInfo record);

    int insertSelective(PicPayInfo record);

    List<PicPayInfo> selectByExample(PicPayInfoExample example);

    PicPayInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PicPayInfo record, @Param("example") PicPayInfoExample example);

    int updateByExample(@Param("record") PicPayInfo record, @Param("example") PicPayInfoExample example);

    int updateByPrimaryKeySelective(PicPayInfo record);

    int updateByPrimaryKey(PicPayInfo record);
}