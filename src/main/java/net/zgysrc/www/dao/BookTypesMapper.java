package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.BookTypes;
import net.zgysrc.www.bean.BookTypesExample;
import org.apache.ibatis.annotations.Param;

public interface BookTypesMapper {
    long countByExample(BookTypesExample example);

    int deleteByExample(BookTypesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BookTypes record);

    int insertSelective(BookTypes record);

    List<BookTypes> selectByExample(BookTypesExample example);

    BookTypes selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BookTypes record, @Param("example") BookTypesExample example);

    int updateByExample(@Param("record") BookTypes record, @Param("example") BookTypesExample example);

    int updateByPrimaryKeySelective(BookTypes record);

    int updateByPrimaryKey(BookTypes record);
}