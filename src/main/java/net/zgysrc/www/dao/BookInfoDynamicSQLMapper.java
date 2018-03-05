package net.zgysrc.www.dao;

import java.util.List;
import java.util.Map;

import net.zgysrc.www.bean.BookInfo;

public interface BookInfoDynamicSQLMapper {
	
	List<Map<String,Object>> selectByBean(BookInfo bookInfo);
	
	
}
