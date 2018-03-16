package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.ArtCarousel;
import net.zgysrc.www.bean.ArtCarouselExample;
import org.apache.ibatis.annotations.Param;

public interface ArtCarouselMapper {
    long countByExample(ArtCarouselExample example);

    int deleteByExample(ArtCarouselExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ArtCarousel record);

    int insertSelective(ArtCarousel record);

    List<ArtCarousel> selectByExample(ArtCarouselExample example);

    ArtCarousel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ArtCarousel record, @Param("example") ArtCarouselExample example);

    int updateByExample(@Param("record") ArtCarousel record, @Param("example") ArtCarouselExample example);

    int updateByPrimaryKeySelective(ArtCarousel record);

    int updateByPrimaryKey(ArtCarousel record);
}