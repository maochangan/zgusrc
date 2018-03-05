package net.zgysrc.www.dao;

import java.util.List;
import java.util.Map;

import net.zgysrc.www.bean.Resume;

public interface ResumeDynamicSQLMapper {

	List<Map<String,String>> selectByLessInfo(Resume resume);
	
	
}
