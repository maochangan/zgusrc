package net.zgysrc.www.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.zgysrc.www.bean.CollectionPost;
import net.zgysrc.www.bean.CollectionPostExample;
import net.zgysrc.www.bean.CompanyInfo;
import net.zgysrc.www.bean.CompanyInfoExample;
import net.zgysrc.www.bean.CompanyUser;
import net.zgysrc.www.bean.CompanyUserExample;
import net.zgysrc.www.bean.CompanyUserExample.Criteria;
import net.zgysrc.www.bean.CompanyVip;
import net.zgysrc.www.bean.GetResume;
import net.zgysrc.www.bean.GetResumeExample;
import net.zgysrc.www.bean.MobileCode;
import net.zgysrc.www.bean.MobileCodeExample;
import net.zgysrc.www.bean.PostRelease;
import net.zgysrc.www.bean.Resume;
import net.zgysrc.www.bean.ResumeExample;
import net.zgysrc.www.dao.CollectionPostMapper;
import net.zgysrc.www.dao.CompanyInfoMapper;
import net.zgysrc.www.dao.CompanyUserMapper;
import net.zgysrc.www.dao.GetResumeMapper;
import net.zgysrc.www.dao.MobileCodeMapper;
import net.zgysrc.www.dao.PostReleaseDynamicSQL;
import net.zgysrc.www.dao.PostReleaseMapper;
import net.zgysrc.www.dao.ResumeMapper;

@Service
@Transactional
public class CompanyUserService {

	@Autowired
	private CompanyUserMapper companyUserMapper;
	@Autowired
	private CompanyInfoMapper companyInfoMapper;
	@Autowired
	private ResumeMapper resumeMapper;
	@Autowired
	private PostReleaseDynamicSQL postReleaseDynamicSQL;
	@Autowired
	private GetResumeMapper getResumeMapper;
	@Autowired
	private CollectionPostMapper collectionPostMapper;
	@Autowired
	private PostReleaseMapper postReleaseMapper;
	@Autowired
	private MobileCodeMapper mobileCodeMapper;

	/**
	 * 
	 * @param cUserName
	 * @return
	 */
	public boolean checkRegister(String cUserName) {
		CompanyUserExample example = new CompanyUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andCUserNameEqualTo(cUserName);
		List<CompanyUser> find = companyUserMapper.selectByExample(example);
		int i = 0;

		for (@SuppressWarnings("unused")
		CompanyUser companyUser : find) {
			i++;
		}
		if (i == 0) {
			return true;
		}
		return false;

	}

	public boolean save(CompanyUser companyUser) {
		boolean check = checkRegister(companyUser.getcUserName());
		if (check) {
			int state = companyUserMapper.insert(companyUser);
			if (state == 0) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	public CompanyUser checkLogin(CompanyUser companyUser) {
		CompanyUserExample example = new CompanyUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andCUserNameEqualTo(companyUser.getcUserName());
		criteria.andCPasswordEqualTo(companyUser.getcPassword());
		List<CompanyUser> find = companyUserMapper.selectByExample(example);
		if (find.size() != 0) {
			CompanyUser u = find.get(0);
			return u;
		} else {
			CompanyUser u = null;
			return u;
		}
	}

	public CompanyUser updateById(CompanyUser companyUser) {
		int state = companyUserMapper.updateByPrimaryKey(companyUser);
		if (state != 1) {
			CompanyUser u = new CompanyUser();
			return u;
		} else {
			CompanyUser u = companyUser;
			return u;
		}
	}

	public boolean checkEmail(String cEmail) {
		CompanyUserExample example = new CompanyUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andCEmailEqualTo(cEmail);
		List<CompanyUser> find = companyUserMapper.selectByExample(example);

		if (find.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public CompanyUser loadByEmail(String email) {
		CompanyUserExample example = new CompanyUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andCEmailEqualTo(email);
		List<CompanyUser> find = companyUserMapper.selectByExample(example);
		return find.get(0);
	}

	public boolean checkMobileNum(String cTelephoneNumber) {
		CompanyUserExample example = new CompanyUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andCTelephoneNumberEqualTo(cTelephoneNumber);
		List<CompanyUser> list = companyUserMapper.selectByExample(example);
		if (list.size() == 0) {
			return true;
		} else {
			return false;
		}

	}

	public CompanyUser loginByMobileCheck(String cTelephoneNumber) {
		CompanyUserExample example = new CompanyUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andCTelephoneNumberEqualTo(cTelephoneNumber);
		List<CompanyUser> list = companyUserMapper.selectByExample(example);
		return list.get(0);
	}

	public CompanyUser modifyCompanyUserInfo(CompanyUser companyUser) {
		int state = companyUserMapper.updateByPrimaryKeySelective(companyUser);
		if (state == 1) {
			CompanyUser user = companyUserMapper.selectByPrimaryKey(companyUser.getId());
			return user;
		} else {
			return null;
		}
	}

	public boolean submitCompanyAuthenticate(String getcName) {
		CompanyInfoExample example = new CompanyInfoExample();
		net.zgysrc.www.bean.CompanyInfoExample.Criteria criteria = example.createCriteria();
		criteria.andCCompanyNameEqualTo(getcName);
		List<CompanyInfo> list = companyInfoMapper.selectByExample(example);
		if (list.size() == 0) {
			return false;
		} else {
			CompanyInfo info = list.get(0);
			CompanyInfo c = new CompanyInfo();
			c.setId(info.getId());
			c.setcAc("申请认证");
			int state = companyInfoMapper.updateByPrimaryKeySelective(c);
			if (state == 1) {
				return true;
			} else {
				return false;
			}
		}
	}

	public Resume getResumeById(Integer id) {
		Resume resume = resumeMapper.selectByPrimaryKey(id);
		if (resume == null) {
			return null;
		} else {
			return resume;
		}
	}

	public CompanyInfo getCompany(String getcName) {
		CompanyInfoExample example = new CompanyInfoExample();
		net.zgysrc.www.bean.CompanyInfoExample.Criteria criteria = example.createCriteria();
		criteria.andCCompanyNameEqualTo(getcName);
		List<CompanyInfo> list = companyInfoMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list.get(0);
		}
	}

	public boolean uploadLicense(CompanyInfo companyInfo) {
		int state = companyInfoMapper.updateByPrimaryKeySelective(companyInfo);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

	public List<Map<String, Object>> getPosetRestSize(Integer id) {
		PostRelease postRelease = new PostRelease();
		postRelease.setcId(id);
		List<Map<String, Object>> list = postReleaseDynamicSQL.selectInfo(postRelease);
		return list;
	}

	public CompanyUser getCompanyUserByTelephoneNum(String getcTelephoneNumber) {
		CompanyUserExample example = new CompanyUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andCTelephoneNumberEqualTo(getcTelephoneNumber);
		List<CompanyUser> list = companyUserMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list.get(0);
		}
	}

	public boolean checkCompanyName(String getcName) {
		CompanyInfoExample example = new CompanyInfoExample();
		net.zgysrc.www.bean.CompanyInfoExample.Criteria criteria = example.createCriteria();
		criteria.andCCompanyNameEqualTo(getcName);
		List<CompanyInfo> list = companyInfoMapper.selectByExample(example);
		if (list.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void addCompany(CompanyInfo companyInfo) {
		companyInfoMapper.insert(companyInfo);
	}

	public boolean register(CompanyUser companyUser) {
		int state = companyUserMapper.insert(companyUser);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

	public List<GetResume> getGetResumeNum(String getcUserName) {
		GetResumeExample example = new GetResumeExample();
		net.zgysrc.www.bean.GetResumeExample.Criteria criteria = example.createCriteria();
		criteria.andPostUserNameEqualTo(getcUserName);
		List<GetResume> list = getResumeMapper.selectByExample(example);
		return list;
	}

	public List<CollectionPost> getCollectPostNum(Integer id) {
		CollectionPostExample example = new CollectionPostExample();
		net.zgysrc.www.bean.CollectionPostExample.Criteria criteria = example.createCriteria();
		criteria.andCompanyIdEqualTo(id);
		List<CollectionPost> list = collectionPostMapper.selectByExample(example);
		return list;
	}

	public boolean dropPostById(Integer id) {
		int state = postReleaseMapper.deleteByPrimaryKey(id);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

	public List<PostRelease> getPostReleaseWithResume(String getcUserName) {
		GetResumeExample example = new GetResumeExample();
		net.zgysrc.www.bean.GetResumeExample.Criteria criteria = example.createCriteria();
		criteria.andPostUserNameEqualTo(getcUserName);
		List<GetResume> list = getResumeMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		}
		List<PostRelease> lists = new ArrayList<PostRelease>();
		for (GetResume getResume : list) {
			lists.add(postReleaseMapper.selectByPrimaryKey(getResume.getPostId()));
		}
		for (int i = 0; i < lists.size(); i++) {
			for (int j = i + 1; j < lists.size(); j++) {
				if (lists.get(i).getId().equals(lists.get(j).getId())) {
					lists.remove(j);
				}
			}
		}
		return lists;
	}

	public PostRelease getPostReleaseInfo(Integer id) {
		PostRelease postRelease = postReleaseMapper.selectByPrimaryKey(id);
		if (postRelease == null) {
			return null;
		} else {
			return postRelease;
		}
	}

	public List<Map<String, Object>> getPostReleaseWithResumeTest(String getcUserName) {
		GetResumeExample example = new GetResumeExample();
		net.zgysrc.www.bean.GetResumeExample.Criteria criteria = example.createCriteria();
		criteria.andPostUserNameEqualTo(getcUserName);
		List<GetResume> list = getResumeMapper.selectByExample(example);
		List<Map<String, Object>> listFinal = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String, Object>();
		if (list.size() == 0) {
			return null;
		} else {
			for (int i = 0; i < list.size(); i++) {
				int num = 0;
				for (int j = i + 1; j < list.size(); j++) {
					if (list.get(i).getPostId().equals(list.get(j).getPostId())) {
						num++;
						list.remove(j);
					}
				}
				PostRelease postRelease = postReleaseMapper.selectByPrimaryKey(list.get(i).getPostId());
				map.put("id", postRelease.getId());
				map.put("pTyoeTwo", postRelease.getpTyoeTwo());
				map.put("resumeNum", num);
				map.put("pStartTime", postRelease.getpStartTime());
				map.put("cCompanyName", postRelease.getcCompanyName());
				map.put("pCity", postRelease.getpCity());
				map.put("pAddress", postRelease.getpAddress());
				listFinal.add(map);
			}
			return listFinal;
		}
	}

	@SuppressWarnings("deprecation")
	public List<Map<String, Object>> getresumes(List<GetResume> list) {
		List<Map<String, Object>> lists = new ArrayList<Map<String,Object>>();
		Map<String , Object> map = new HashMap<String, Object>();
		for (GetResume getResume : list) {
			if(getResume.getPostCompanyId().equals(2)){
				continue;
			}
			Resume resume = resumeMapper.selectByPrimaryKey(getResume.getPostSimpleResumeId());
			map.put("gid", getResume.getId());
			map.put("id", resume.getId());
			map.put("name", resume.getUserName());
			map.put("postName", resume.getPostName());
			map.put("sex", resume.getSex());
			Date date = new Date();
			int age = date.getYear()+1900 - Integer.valueOf(resume.getBirthYear()) ;
			map.put("age", age);
			Date sl = new Date();
			int sll = sl.getYear()+1900 - Integer.valueOf(resume.getOldStartTime());
			map.put("serverLong", sll);
			map.put("edu", resume.getEducation());
			map.put("sendTime",getResume.getSendTime());
			lists.add(map);
		}
		return lists;
	}

	public List<Resume> getAllResume(List<GetResume> list) {
		if(list == null){
			return null;
		}else{
			List<Integer> values = new ArrayList<Integer>();
			for (GetResume getResume : list) {
				values.add(getResume.getPostSimpleResumeId());
			}
			ResumeExample example = new ResumeExample();
			net.zgysrc.www.bean.ResumeExample.Criteria criteria = example.createCriteria();
			criteria.andIdIn(values);
			List<Resume> lists = resumeMapper.selectByExample(example);
			return lists;
		}
	}

	public boolean deleteGetResume(Integer gid) {
		GetResume getResume = new GetResume();
		getResume.setId(gid);;
		getResume.setPostCompanyId(2);
		int state = getResumeMapper.updateByPrimaryKeySelective(getResume);
		if(state == 0){
			return false;
		}else{
			return true;
		}
	}

	public void updateCompanyInfo(Integer userId, CompanyVip companyVip) {
		CompanyUser companyUser = companyUserMapper.selectByPrimaryKey(userId);
		CompanyInfo companyInfo = getCompany(companyUser.getcName());
		companyInfo.setVipType(companyVip.getCompanyVipType());
		companyInfoMapper.updateByPrimaryKey(companyInfo);
	}

	public boolean updateCompanyUserSelective(CompanyUser companyUser) {
		int state = companyUserMapper.updateByPrimaryKeySelective(companyUser);
		if(state == 0){
			return false;
		}else{
			return true;
		}
	}

	public boolean getMobileCodeByMobile(String cTelephoneNumber, String code) {
		MobileCodeExample example = new MobileCodeExample();
		net.zgysrc.www.bean.MobileCodeExample.Criteria criteria = example.createCriteria();
		criteria.andMobileEqualTo(cTelephoneNumber);
		criteria.andMobileCodeEqualTo(code);
		List<MobileCode> list = mobileCodeMapper.selectByExample(example);
		if(list.size() != 1){
			return false;
		}else{
			return true;
		}
	}

	public boolean checkUserName(String cUserName, String cTelephoneNumber) {
		CompanyUserExample example = new CompanyUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andCUserNameEqualTo(cUserName);
		criteria.andCTelephoneNumberEqualTo(cTelephoneNumber);
		List<CompanyUser> list = companyUserMapper.selectByExample(example);
		if(list.size() != 1){
			return false;
		}else{
			return true;
		}
	}

}
