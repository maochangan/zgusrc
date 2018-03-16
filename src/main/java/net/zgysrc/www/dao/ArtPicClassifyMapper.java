package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.ArtPicClassify;
import net.zgysrc.www.bean.ArtPicClassifyExample;
import org.apache.ibatis.annotations.Param;

public interface ArtPicClassifyMapper {
    long countByExample(ArtPicClassifyExample example);

    int deleteByExample(ArtPicClassifyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ArtPicClassify record);

    int insertSelective(ArtPicClassify record);

    List<ArtPicClassify> selectByExample(ArtPicClassifyExample example);

    ArtPicClassify selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ArtPicClassify record, @Param("example") ArtPicClassifyExample example);

    int updateByExample(@Param("record") ArtPicClassify record, @Param("example") ArtPicClassifyExample example);

    int updateByPrimaryKeySelective(ArtPicClassify record);

    int updateByPrimaryKey(ArtPicClassify record);
}