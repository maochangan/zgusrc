package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.FollowList;
import net.zgysrc.www.bean.FollowListExample;
import org.apache.ibatis.annotations.Param;

public interface FollowListMapper {
    long countByExample(FollowListExample example);

    int deleteByExample(FollowListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FollowList record);

    int insertSelective(FollowList record);

    List<FollowList> selectByExample(FollowListExample example);

    FollowList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FollowList record, @Param("example") FollowListExample example);

    int updateByExample(@Param("record") FollowList record, @Param("example") FollowListExample example);

    int updateByPrimaryKeySelective(FollowList record);

    int updateByPrimaryKey(FollowList record);
}