package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.CollectionPost;
import net.zgysrc.www.bean.CollectionPostExample;
import org.apache.ibatis.annotations.Param;

public interface CollectionPostMapper {
    long countByExample(CollectionPostExample example);

    int deleteByExample(CollectionPostExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CollectionPost record);

    int insertSelective(CollectionPost record);

    List<CollectionPost> selectByExample(CollectionPostExample example);

    CollectionPost selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CollectionPost record, @Param("example") CollectionPostExample example);

    int updateByExample(@Param("record") CollectionPost record, @Param("example") CollectionPostExample example);

    int updateByPrimaryKeySelective(CollectionPost record);

    int updateByPrimaryKey(CollectionPost record);
}