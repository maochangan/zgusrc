package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.ImageInfo;
import net.zgysrc.www.bean.ImageInfoExample;
import org.apache.ibatis.annotations.Param;

public interface ImageInfoMapper {
    long countByExample(ImageInfoExample example);

    int deleteByExample(ImageInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ImageInfo record);

    int insertSelective(ImageInfo record);

    List<ImageInfo> selectByExample(ImageInfoExample example);

    ImageInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ImageInfo record, @Param("example") ImageInfoExample example);

    int updateByExample(@Param("record") ImageInfo record, @Param("example") ImageInfoExample example);

    int updateByPrimaryKeySelective(ImageInfo record);

    int updateByPrimaryKey(ImageInfo record);
}