package net.zgysrc.www.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.zgysrc.www.bean.CompanyInfo;
import net.zgysrc.www.bean.CompanyInfoExample;
import net.zgysrc.www.bean.GetResume;
import net.zgysrc.www.bean.GetResumeExample;
import net.zgysrc.www.bean.PostRelease;
import net.zgysrc.www.bean.PostReleaseExample;
import net.zgysrc.www.bean.PostReleaseExample.Criteria;
import net.zgysrc.www.dao.CompanyInfoMapper;
import net.zgysrc.www.dao.GetResumeMapper;
import net.zgysrc.www.dao.PostReleaseDynamicSQL;
import net.zgysrc.www.dao.PostReleaseMapper;

@Service
@Transactional
public class PostReleaseService {

	@Autowired
	private PostReleaseMapper postReleaseMapper;
	@Autowired
	private CompanyInfoMapper companyInfoMapper;
	@Autowired
	private PostReleaseDynamicSQL postReleaseDynamicSQL;
	@Autowired
	private GetResumeMapper getResumeMapper;

	public List<PostRelease> findAll(String string) {
		PostReleaseExample example = new PostReleaseExample();
		Criteria criteria = example.createCriteria();
		criteria.andCCompanyNameEqualTo(string);
		List<PostRelease> list = postReleaseMapper.selectByExample(example);
		return list;
	}

	public boolean postReleaseAdd(PostRelease postRelease) {
		int state = postReleaseMapper.insert(postRelease);
		if (state == 1) {
			return true;
		}
		return false;
	}

	public boolean postReleaseUpdate(PostRelease postRelease) {
		int state = postReleaseMapper.updateByPrimaryKeySelective(postRelease);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

	public PostRelease findOne(Integer id) {
		PostRelease p = postReleaseMapper.selectByPrimaryKey(id);
		if (p != null) {
			return p;
		} else {
			return null;
		}
	}

	public List<PostRelease> postReleaseSearchByUser(String string) {
		PostReleaseExample example = new PostReleaseExample();
		Criteria criteria = example.createCriteria();
		criteria.andCUserNameEqualTo(string);
		List<PostRelease> list = postReleaseMapper.selectByExample(example);

		return list;
	}

	public CompanyInfo findCompany(String getcName) {
		CompanyInfoExample example = new CompanyInfoExample();
		net.zgysrc.www.bean.CompanyInfoExample.Criteria criteria = example.createCriteria();
		criteria.andCCompanyNameEqualTo(getcName);
		List<CompanyInfo> list = companyInfoMapper.selectByExample(example);
		return list.get(0);
	}

	public void updateClick(PostRelease post) {
		postReleaseMapper.updateByPrimaryKey(post);
	}

	public List<Map<String, Object>> getAllPostRelease(PostRelease postRelease) {
		List<Map<String, Object>> list = postReleaseDynamicSQL.selectInfo(postRelease);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public PostRelease findPostById(Integer id) {
		PostRelease post = postReleaseMapper.selectByPrimaryKey(id);
		if (post == null) {
			return null;
		} else {
			return post;
		}
	}

	public List<GetResume> getResume(String getcUserName) {
		GetResumeExample example = new GetResumeExample();
		net.zgysrc.www.bean.GetResumeExample.Criteria criteria = example.createCriteria();
		criteria.andPostUserNameEqualTo(getcUserName);
		List<GetResume> list = getResumeMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public List<GetResume> getResumeByPostUserId(Integer id) {
		GetResumeExample example = new GetResumeExample();
		net.zgysrc.www.bean.GetResumeExample.Criteria criteria = example.createCriteria();
		criteria.andPostIdEqualTo(id);
		List<GetResume> list = getResumeMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public List<Map<String, Object>> theFirstPostRelease() {
		PostRelease example = new PostRelease();
		example.setGetResumeId(1);
		List<Map<String, Object>> list = postReleaseDynamicSQL.selectInfo(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public List<Map<String, Object>> getPostListByCompanyName(Object object) {
		PostRelease record = new PostRelease();
		record.setcCompanyName(object.toString());
		List<Map<String, Object>> list = postReleaseDynamicSQL.selectInfo(record);
		List<Map<String, Object>> list2 = new ArrayList<Map<String, Object>>();
		if (list.size() == 0) {
			return null;
		} else {
			if (list.size() == 1) {
				list2.add(list.get(0));
				return list2;
			} else {
				list2.add(list.get(0));
				list2.add(list.get(1));
				return list2;
			}
		}
	}

	public List<Map<String, Object>> getAllPostListByCompanyName(Object object) {
		PostRelease record = new PostRelease();
		record.setcCompanyName(object.toString());
		List<Map<String, Object>> list = postReleaseDynamicSQL.selectInfo(record);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public List<Map<String, Object>> getPostListByCompanyNameHot(Object object) {
		PostRelease record = new PostRelease();
		record.setcCompanyName(object.toString());
		List<Map<String, Object>> list = postReleaseDynamicSQL.selectInfo(record);
		List<Map<String, Object>> list2 = new ArrayList<Map<String, Object>>();
		if (list.size() == 0) {
			return null;
		} else {
			for(int i = 0 ; i < 4 ; i++){
				if(list.size() == i){
					break;
				}
				list2.add(list.get(i));
			}
			return list2;
		}
	}

	public List<GetResume> getResumeByPostUserIds(Integer id) {
		GetResumeExample example = new GetResumeExample();
		net.zgysrc.www.bean.GetResumeExample.Criteria criteria = example.createCriteria();
		criteria.andPostUserIdsEqualTo(id);
		List<GetResume> list = getResumeMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

}
