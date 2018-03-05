package net.zgysrc.www.dao;

import java.util.List;
import net.zgysrc.www.bean.SimplePrice;
import net.zgysrc.www.bean.SimplePriceExample;
import org.apache.ibatis.annotations.Param;

public interface SimplePriceMapper {
    long countByExample(SimplePriceExample example);

    int deleteByExample(SimplePriceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SimplePrice record);

    int insertSelective(SimplePrice record);

    List<SimplePrice> selectByExample(SimplePriceExample example);

    SimplePrice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SimplePrice record, @Param("example") SimplePriceExample example);

    int updateByExample(@Param("record") SimplePrice record, @Param("example") SimplePriceExample example);

    int updateByPrimaryKeySelective(SimplePrice record);

    int updateByPrimaryKey(SimplePrice record);
}