package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.PostRelease;
import net.zgysrc.www.bean.PostReleaseExample;
import org.apache.ibatis.annotations.Param;

public interface PostReleaseMapper {
    long countByExample(PostReleaseExample example);

    int deleteByExample(PostReleaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PostRelease record);

    int insertSelective(PostRelease record);

    List<PostRelease> selectByExample(PostReleaseExample example);

    PostRelease selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PostRelease record, @Param("example") PostReleaseExample example);

    int updateByExample(@Param("record") PostRelease record, @Param("example") PostReleaseExample example);

    int updateByPrimaryKeySelective(PostRelease record);

    int updateByPrimaryKey(PostRelease record);
}