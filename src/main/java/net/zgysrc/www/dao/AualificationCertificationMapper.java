package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.AualificationCertification;
import net.zgysrc.www.bean.AualificationCertificationExample;
import org.apache.ibatis.annotations.Param;

public interface AualificationCertificationMapper {
    long countByExample(AualificationCertificationExample example);

    int deleteByExample(AualificationCertificationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AualificationCertification record);

    int insertSelective(AualificationCertification record);

    List<AualificationCertification> selectByExample(AualificationCertificationExample example);

    AualificationCertification selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AualificationCertification record, @Param("example") AualificationCertificationExample example);

    int updateByExample(@Param("record") AualificationCertification record, @Param("example") AualificationCertificationExample example);

    int updateByPrimaryKeySelective(AualificationCertification record);

    int updateByPrimaryKey(AualificationCertification record);
}