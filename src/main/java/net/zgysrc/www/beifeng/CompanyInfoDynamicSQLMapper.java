package net.zgysrc.www.beifeng;

import java.util.List;
import java.util.Map;

import net.zgysrc.www.bean.CompanyInfo;

public interface CompanyInfoDynamicSQLMapper {

	List<Map<String , Object>> selectInfo(CompanyInfo record);
	
	Map<String , Object> selectInfoById(Integer id);
	
}
