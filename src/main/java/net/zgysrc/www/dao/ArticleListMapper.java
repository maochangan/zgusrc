package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.ArticleList;
import net.zgysrc.www.bean.ArticleListExample;
import org.apache.ibatis.annotations.Param;

public interface ArticleListMapper {
    long countByExample(ArticleListExample example);

    int deleteByExample(ArticleListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ArticleList record);

    int insertSelective(ArticleList record);

    List<ArticleList> selectByExampleWithBLOBs(ArticleListExample example);

    List<ArticleList> selectByExample(ArticleListExample example);

    ArticleList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ArticleList record, @Param("example") ArticleListExample example);

    int updateByExampleWithBLOBs(@Param("record") ArticleList record, @Param("example") ArticleListExample example);

    int updateByExample(@Param("record") ArticleList record, @Param("example") ArticleListExample example);

    int updateByPrimaryKeySelective(ArticleList record);

    int updateByPrimaryKeyWithBLOBs(ArticleList record);

    int updateByPrimaryKey(ArticleList record);
}