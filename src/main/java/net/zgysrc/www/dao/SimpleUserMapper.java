package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.SimpleUser;
import net.zgysrc.www.bean.SimpleUserExample;
import org.apache.ibatis.annotations.Param;

public interface SimpleUserMapper {
    long countByExample(SimpleUserExample example);

    int deleteByExample(SimpleUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SimpleUser record);

    int insertSelective(SimpleUser record);

    List<SimpleUser> selectByExample(SimpleUserExample example);

    SimpleUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SimpleUser record, @Param("example") SimpleUserExample example);

    int updateByExample(@Param("record") SimpleUser record, @Param("example") SimpleUserExample example);

    int updateByPrimaryKeySelective(SimpleUser record);

    int updateByPrimaryKey(SimpleUser record);
}