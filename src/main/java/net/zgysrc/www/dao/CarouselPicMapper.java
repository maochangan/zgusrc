package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.CarouselPic;
import net.zgysrc.www.bean.CarouselPicExample;
import org.apache.ibatis.annotations.Param;

public interface CarouselPicMapper {
    long countByExample(CarouselPicExample example);

    int deleteByExample(CarouselPicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CarouselPic record);

    int insertSelective(CarouselPic record);

    List<CarouselPic> selectByExample(CarouselPicExample example);

    CarouselPic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CarouselPic record, @Param("example") CarouselPicExample example);

    int updateByExample(@Param("record") CarouselPic record, @Param("example") CarouselPicExample example);

    int updateByPrimaryKeySelective(CarouselPic record);

    int updateByPrimaryKey(CarouselPic record);
}