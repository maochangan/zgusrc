package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.ArtPicInfo;
import net.zgysrc.www.bean.ArtPicInfoExample;
import org.apache.ibatis.annotations.Param;

public interface ArtPicInfoMapper {
    long countByExample(ArtPicInfoExample example);

    int deleteByExample(ArtPicInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ArtPicInfo record);

    int insertSelective(ArtPicInfo record);

    List<ArtPicInfo> selectByExample(ArtPicInfoExample example);

    ArtPicInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ArtPicInfo record, @Param("example") ArtPicInfoExample example);

    int updateByExample(@Param("record") ArtPicInfo record, @Param("example") ArtPicInfoExample example);

    int updateByPrimaryKeySelective(ArtPicInfo record);

    int updateByPrimaryKey(ArtPicInfo record);
}