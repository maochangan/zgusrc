package net.zgysrc.www.beifeng;

import java.util.List;
import java.util.Map;

import net.zgysrc.www.bean.BookInfo;

public interface BookInfoDynamicSQLMapper {
	
	List<Map<String,Object>> selectByBean(BookInfo bookInfo);
	
	
}
