package net.zgysrc.www.beifeng;

import java.util.List;
import java.util.Map;

import net.zgysrc.www.bean.ArticleList;

public interface ArticleListDynamicSQLMapper {

	List<Map<String,Object>> selectBy(ArticleList articleList);
	
}
