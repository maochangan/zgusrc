package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.ArtGallery;
import net.zgysrc.www.bean.ArtGalleryExample;
import org.apache.ibatis.annotations.Param;

public interface ArtGalleryMapper {
    long countByExample(ArtGalleryExample example);

    int deleteByExample(ArtGalleryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ArtGallery record);

    int insertSelective(ArtGallery record);

    List<ArtGallery> selectByExample(ArtGalleryExample example);

    ArtGallery selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ArtGallery record, @Param("example") ArtGalleryExample example);

    int updateByExample(@Param("record") ArtGallery record, @Param("example") ArtGalleryExample example);

    int updateByPrimaryKeySelective(ArtGallery record);

    int updateByPrimaryKey(ArtGallery record);
}