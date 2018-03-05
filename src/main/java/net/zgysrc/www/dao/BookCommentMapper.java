package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.BookComment;
import net.zgysrc.www.bean.BookCommentExample;
import org.apache.ibatis.annotations.Param;

public interface BookCommentMapper {
    long countByExample(BookCommentExample example);

    int deleteByExample(BookCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BookComment record);

    int insertSelective(BookComment record);

    List<BookComment> selectByExample(BookCommentExample example);

    BookComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BookComment record, @Param("example") BookCommentExample example);

    int updateByExample(@Param("record") BookComment record, @Param("example") BookCommentExample example);

    int updateByPrimaryKeySelective(BookComment record);

    int updateByPrimaryKey(BookComment record);
}