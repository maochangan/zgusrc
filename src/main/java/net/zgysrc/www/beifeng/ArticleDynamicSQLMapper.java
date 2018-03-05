package net.zgysrc.www.beifeng;

import java.util.List;
import java.util.Map;

import net.zgysrc.www.bean.Article;

public interface ArticleDynamicSQLMapper {

	List<Map<String,Object>> selectBy(Article article);
	
}
