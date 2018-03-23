package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.UserReceivingAddress;
import net.zgysrc.www.bean.UserReceivingAddressExample;
import org.apache.ibatis.annotations.Param;

public interface UserReceivingAddressMapper {
    long countByExample(UserReceivingAddressExample example);

    int deleteByExample(UserReceivingAddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserReceivingAddress record);

    int insertSelective(UserReceivingAddress record);

    List<UserReceivingAddress> selectByExample(UserReceivingAddressExample example);

    UserReceivingAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserReceivingAddress record, @Param("example") UserReceivingAddressExample example);

    int updateByExample(@Param("record") UserReceivingAddress record, @Param("example") UserReceivingAddressExample example);

    int updateByPrimaryKeySelective(UserReceivingAddress record);

    int updateByPrimaryKey(UserReceivingAddress record);
}