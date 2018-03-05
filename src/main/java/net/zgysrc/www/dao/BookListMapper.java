package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.BookList;
import net.zgysrc.www.bean.BookListExample;
import org.apache.ibatis.annotations.Param;

public interface BookListMapper {
    long countByExample(BookListExample example);

    int deleteByExample(BookListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BookList record);

    int insertSelective(BookList record);

    List<BookList> selectByExampleWithBLOBs(BookListExample example);

    List<BookList> selectByExample(BookListExample example);

    BookList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BookList record, @Param("example") BookListExample example);

    int updateByExampleWithBLOBs(@Param("record") BookList record, @Param("example") BookListExample example);

    int updateByExample(@Param("record") BookList record, @Param("example") BookListExample example);

    int updateByPrimaryKeySelective(BookList record);

    int updateByPrimaryKeyWithBLOBs(BookList record);

    int updateByPrimaryKey(BookList record);
}