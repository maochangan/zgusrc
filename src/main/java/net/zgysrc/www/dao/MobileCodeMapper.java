package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.MobileCode;
import net.zgysrc.www.bean.MobileCodeExample;
import org.apache.ibatis.annotations.Param;

public interface MobileCodeMapper {
    long countByExample(MobileCodeExample example);

    int deleteByExample(MobileCodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MobileCode record);

    int insertSelective(MobileCode record);

    List<MobileCode> selectByExample(MobileCodeExample example);

    MobileCode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MobileCode record, @Param("example") MobileCodeExample example);

    int updateByExample(@Param("record") MobileCode record, @Param("example") MobileCodeExample example);

    int updateByPrimaryKeySelective(MobileCode record);

    int updateByPrimaryKey(MobileCode record);
}