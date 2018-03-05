package net.zgysrc.www.beifeng;

import java.util.List;
import java.util.Map;

import net.zgysrc.www.bean.BookList;

public interface BookListDynamicSQLMapper {
	
	List<Map<String,Object>> selectByBean(BookList bookList);
	
}
