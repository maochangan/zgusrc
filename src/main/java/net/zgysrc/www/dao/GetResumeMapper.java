package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.GetResume;
import net.zgysrc.www.bean.GetResumeExample;
import org.apache.ibatis.annotations.Param;

public interface GetResumeMapper {
    long countByExample(GetResumeExample example);

    int deleteByExample(GetResumeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GetResume record);

    int insertSelective(GetResume record);

    List<GetResume> selectByExample(GetResumeExample example);

    GetResume selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GetResume record, @Param("example") GetResumeExample example);

    int updateByExample(@Param("record") GetResume record, @Param("example") GetResumeExample example);

    int updateByPrimaryKeySelective(GetResume record);

    int updateByPrimaryKey(GetResume record);
}