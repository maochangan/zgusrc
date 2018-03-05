package net.zgysrc.www.beifeng;

import java.util.List;
import java.util.Map;

import net.zgysrc.www.bean.Resume;

public interface ResumeDynamicSQLMapper {

	List<Map<String,String>> selectByLessInfo(Resume resume);
	
	
}
