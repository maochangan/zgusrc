package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.PostitonType;
import net.zgysrc.www.bean.PostitonTypeExample;
import org.apache.ibatis.annotations.Param;

public interface PostitonTypeMapper {
    long countByExample(PostitonTypeExample example);

    int deleteByExample(PostitonTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PostitonType record);

    int insertSelective(PostitonType record);

    List<PostitonType> selectByExample(PostitonTypeExample example);

    PostitonType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PostitonType record, @Param("example") PostitonTypeExample example);

    int updateByExample(@Param("record") PostitonType record, @Param("example") PostitonTypeExample example);

    int updateByPrimaryKeySelective(PostitonType record);

    int updateByPrimaryKey(PostitonType record);
}