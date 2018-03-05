package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.ArtComment;
import net.zgysrc.www.bean.ArtCommentExample;
import org.apache.ibatis.annotations.Param;

public interface ArtCommentMapper {
    long countByExample(ArtCommentExample example);

    int deleteByExample(ArtCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ArtComment record);

    int insertSelective(ArtComment record);

    List<ArtComment> selectByExample(ArtCommentExample example);

    ArtComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ArtComment record, @Param("example") ArtCommentExample example);

    int updateByExample(@Param("record") ArtComment record, @Param("example") ArtCommentExample example);

    int updateByPrimaryKeySelective(ArtComment record);

    int updateByPrimaryKey(ArtComment record);
}