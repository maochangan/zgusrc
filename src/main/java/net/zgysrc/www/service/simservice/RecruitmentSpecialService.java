package net.zgysrc.www.service.simservice;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.zgysrc.www.bean.DeanInfo;
import net.zgysrc.www.bean.PostRelease;
import net.zgysrc.www.dao.DeanInfoMapper;
import net.zgysrc.www.dao.PostReleaseDynamicSQL;

@Service
@Transactional
public class RecruitmentSpecialService {

	@Autowired
	private PostReleaseDynamicSQL postReleaseDynamicSQL;
	@Autowired
	private DeanInfoMapper deanInfoMapper;
	
	
	
	public List<Map<String,Object>> getAllListRecruitmentSpecial(PostRelease postRelease) {
		
		List<Map<String, Object>> list = postReleaseDynamicSQL.selectInfo(postRelease);
		if(list.size() == 0){
			return null;
		}else{
			return list;
		}
	}

	public List<DeanInfo> deanInfoAll() {
		List<DeanInfo> list = deanInfoMapper.selectByExample(null);
		if(list.size() == 0){
			return null;
		}else{
			return list;
		}
	}

	public DeanInfo getDeanInfo(Integer id) {
		DeanInfo deanInfo = deanInfoMapper.selectByPrimaryKey(id);
		return deanInfo;
	}

	public void updateDeanInfo(DeanInfo deanInfo) {
		deanInfoMapper.updateByPrimaryKeySelective(deanInfo);
	}

	
	
}
