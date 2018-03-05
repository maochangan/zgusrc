package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.BookPrice;
import net.zgysrc.www.bean.BookPriceExample;
import org.apache.ibatis.annotations.Param;

public interface BookPriceMapper {
    long countByExample(BookPriceExample example);

    int deleteByExample(BookPriceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BookPrice record);

    int insertSelective(BookPrice record);

    List<BookPrice> selectByExample(BookPriceExample example);

    BookPrice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BookPrice record, @Param("example") BookPriceExample example);

    int updateByExample(@Param("record") BookPrice record, @Param("example") BookPriceExample example);

    int updateByPrimaryKeySelective(BookPrice record);

    int updateByPrimaryKey(BookPrice record);
}