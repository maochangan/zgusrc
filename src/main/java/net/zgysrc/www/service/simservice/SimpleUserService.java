package net.zgysrc.www.service.simservice;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.zgysrc.www.bean.ArtGallery;
import net.zgysrc.www.bean.ArtGalleryExample;
import net.zgysrc.www.bean.ArtPicInfo;
import net.zgysrc.www.bean.ArtPicInfoExample;
import net.zgysrc.www.bean.Article;
import net.zgysrc.www.bean.ArticleList;
import net.zgysrc.www.bean.ArticleListExample;
import net.zgysrc.www.bean.CollectionPost;
import net.zgysrc.www.bean.CollectionPostExample;
import net.zgysrc.www.bean.CompanyInfo;
import net.zgysrc.www.bean.CompanyInfoExample;
import net.zgysrc.www.bean.CompanyUser;
import net.zgysrc.www.bean.CompanyUserExample;
import net.zgysrc.www.bean.FollowList;
import net.zgysrc.www.bean.FollowListExample;
import net.zgysrc.www.bean.GetResume;
import net.zgysrc.www.bean.GetResumeExample;
import net.zgysrc.www.bean.ImageInfo;
import net.zgysrc.www.bean.MobileCode;
import net.zgysrc.www.bean.MobileCodeExample;
import net.zgysrc.www.bean.PicPayInfo;
import net.zgysrc.www.bean.PicPayInfoExample;
import net.zgysrc.www.bean.PostRelease;
import net.zgysrc.www.bean.PostReleaseExample;
import net.zgysrc.www.bean.Resume;
import net.zgysrc.www.bean.ResumeExample;
import net.zgysrc.www.bean.SimpleUser;
import net.zgysrc.www.bean.SimpleUserExample;
import net.zgysrc.www.bean.SimpleUserExample.Criteria;
import net.zgysrc.www.bean.UserReceivingAddress;
import net.zgysrc.www.dao.ArtGalleryMapper;
import net.zgysrc.www.dao.ArtPicInfoMapper;
import net.zgysrc.www.dao.ArticleDynamicSQLMapper;
import net.zgysrc.www.dao.ArticleListDynamicSQLMapper;
import net.zgysrc.www.dao.ArticleListMapper;
import net.zgysrc.www.dao.ArticleMapper;
import net.zgysrc.www.dao.CollectionPostMapper;
import net.zgysrc.www.dao.CompanyInfoDynamicSQLMapper;
import net.zgysrc.www.dao.CompanyInfoMapper;
import net.zgysrc.www.dao.CompanyUserMapper;
import net.zgysrc.www.dao.FollowListMapper;
import net.zgysrc.www.dao.GetResumeMapper;
import net.zgysrc.www.dao.ImageInfoMapper;
import net.zgysrc.www.dao.MobileCodeMapper;
import net.zgysrc.www.dao.PicPayInfoMapper;
import net.zgysrc.www.dao.PostReleaseDynamicSQL;
import net.zgysrc.www.dao.PostReleaseMapper;
import net.zgysrc.www.dao.ResumeMapper;
import net.zgysrc.www.dao.SimpleUserMapper;
import net.zgysrc.www.dao.UserReceivingAddressMapper;
import net.zgysrc.www.utils.UtilStringBufferToString;
import net.zgysrc.www.utils.UtilsMD5;

@Service
@Transactional
public class SimpleUserService {

	@Autowired
	private SimpleUserMapper simpleUserMapper;
	@Autowired
	private ImageInfoMapper imageInfoMapper;
	@Autowired
	private PostReleaseMapper postReleaseMapper;
	@Autowired
	private CompanyInfoMapper companyInfoMapper;
	@Autowired
	private PostReleaseDynamicSQL postReleaseDynamicSQL;
	@Autowired
	private ResumeMapper resumeMapper;
	@Autowired
	private GetResumeMapper getResumeMapper;
	@Autowired
	private CompanyInfoDynamicSQLMapper companyInfoDynamicSQLMapper;
	@Autowired
	private FollowListMapper followListMapper;
	@Autowired
	private ArticleDynamicSQLMapper articleDynamicSQLMapper;
	@Autowired
	private ArticleListDynamicSQLMapper articleListDynamicSQLMapper;
	@Autowired
	private ArticleListMapper articleListMapper;
	@Autowired
	private ArticleMapper articleMapper;
	@Autowired
	private ArtPicInfoMapper artPicInfoMapper;
	@Autowired
	private CompanyUserMapper companyUserMapper;
	@Autowired
	private MobileCodeMapper mobileCodeMapper;
	@Autowired
	private CollectionPostMapper collectionPostMapper;
	@Autowired
	private PicPayInfoMapper picPayInfoMapper;
	@Autowired
	private UserReceivingAddressMapper userReceivingAddressMapper;
	@Autowired
	private ArtGalleryMapper artGalleryMapper;

	public boolean checkMobile(String mobile) {
		SimpleUserExample example = new SimpleUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andMobileEqualTo(mobile);
		List<SimpleUser> list = simpleUserMapper.selectByExample(example);
		if (list.size() == 0) {
			return true;
		} else {
			return false;
		}

	}

	public boolean reviseByMobile(SimpleUser simpleUser) {
		int state = simpleUserMapper.insert(simpleUser);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean checkUserName(String simpleName) {
		SimpleUserExample example = new SimpleUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andSimpleNameEqualTo(simpleName);
		long state = simpleUserMapper.countByExample(example);
		return state == 0;
	}

	public SimpleUser loginByMobile(String mobile, String sPassword) throws Exception {
		SimpleUserExample example = new SimpleUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andMobileEqualTo(mobile);
		criteria.andSimplePasswordEqualTo(UtilsMD5.md5(sPassword));
		List<SimpleUser> list = simpleUserMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list.get(0);
		}
	}

	public SimpleUser loginByMobileCode(String mobile) {
		SimpleUserExample example = new SimpleUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andMobileEqualTo(mobile);
		List<SimpleUser> list = simpleUserMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list.get(0);
		}
	}

	public SimpleUser getUser(SimpleUser simpleUser) throws Exception {
		SimpleUserExample example = new SimpleUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andMobileEqualTo(simpleUser.getMobile());
		criteria.andSimplePasswordEqualTo(simpleUser.getSimplePassword());
		List<SimpleUser> list = simpleUserMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list.get(0);
		}
	}

	public List<ImageInfo> getImagePath() {
		List<ImageInfo> list = imageInfoMapper.selectByExample(null);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public List<PostRelease> findPostByName(String name) {
		PostReleaseExample example = new PostReleaseExample();
		net.zgysrc.www.bean.PostReleaseExample.Criteria criteria = example.createCriteria();
		criteria.andPNameEqualTo(name);
		List<PostRelease> list = postReleaseMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public List<PostRelease> findPostByPostitonType(String name) {
		PostReleaseExample example = new PostReleaseExample();
		net.zgysrc.www.bean.PostReleaseExample.Criteria criteria = example.createCriteria();
		criteria.andPTypeOneEqualTo(name);
		List<PostRelease> list = postReleaseMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public List<PostRelease> findPostByPostitonName(String name) {
		PostReleaseExample example = new PostReleaseExample();
		net.zgysrc.www.bean.PostReleaseExample.Criteria criteria = example.createCriteria();
		criteria.andPTyoeTwoEqualTo(name);
		List<PostRelease> list = postReleaseMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public List<PostRelease> findPostByCompany(String name) {
		PostReleaseExample example = new PostReleaseExample();
		net.zgysrc.www.bean.PostReleaseExample.Criteria criteria = example.createCriteria();
		criteria.andCCompanyNameEqualTo(name);
		List<PostRelease> list = postReleaseMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public CompanyInfo getCompanyInfo(String name) {
		CompanyInfoExample example = new CompanyInfoExample();
		net.zgysrc.www.bean.CompanyInfoExample.Criteria criteria = example.createCriteria();
		criteria.andCCompanyNameEqualTo(name);
		List<CompanyInfo> list = companyInfoMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list.get(0);
		}

	}

	public List<CompanyInfo> findAllCompany() {
		List<CompanyInfo> list = companyInfoMapper.selectByExample(null);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public List<PostRelease> findAllPost() {
		List<PostRelease> list = postReleaseMapper.selectByExample(null);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public CompanyInfo companyInfoMsg(Integer id) {
		CompanyInfo info = companyInfoMapper.selectByPrimaryKey(id);
		if (info == null) {
			return null;
		} else {
			return info;
		}
	}

	public List<CompanyInfo> topCompany() {
		CompanyInfoExample example = new CompanyInfoExample();
		net.zgysrc.www.bean.CompanyInfoExample.Criteria criteria = example.createCriteria();
		criteria.andTopEqualTo("top");
		List<CompanyInfo> list = companyInfoMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public List<PostRelease> findPostByAnything(String others) {
		PostReleaseExample example = new PostReleaseExample();
		net.zgysrc.www.bean.PostReleaseExample.Criteria criteria = example.createCriteria();
		criteria.andPNameLike(others);
		List<PostRelease> list = postReleaseMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public PostRelease backOnePost(Integer id) {
		PostRelease post = postReleaseMapper.selectByPrimaryKey(id);
		if (post == null) {
			return null;
		} else {
			return post;
		}
	}

	public List<PostRelease> findPostByMoreCondition(String city, String industryName, String positionName) {
		PostReleaseExample example = new PostReleaseExample();
		net.zgysrc.www.bean.PostReleaseExample.Criteria criteria = example.createCriteria();
		criteria.andPCityEqualTo(city);
		criteria.andPNameEqualTo(industryName);
		criteria.andPTyoeTwoEqualTo(positionName);
		List<PostRelease> list = postReleaseMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public List<PostRelease> findPostByMoreConditionsBycom(String city, String industryName, String positionName,
			String name) {
		if (city != null && industryName != null && positionName != null) {
			PostReleaseExample example = new PostReleaseExample();
			net.zgysrc.www.bean.PostReleaseExample.Criteria criteria = example.createCriteria();
			criteria.andCCompanyNameEqualTo(name);
			criteria.andPCityLike("%" + city + "%");
			criteria.andPNameLike("%" + industryName + "%");
			criteria.andPTyoeTwoLike("%" + positionName + "%");
			List<PostRelease> list = postReleaseMapper.selectByExample(example);
			if (list.size() == 0) {
				return null;
			} else {
				return list;
			}
		} else if (city != null && industryName != null) {
			PostReleaseExample example = new PostReleaseExample();
			net.zgysrc.www.bean.PostReleaseExample.Criteria criteria = example.createCriteria();
			criteria.andCCompanyNameEqualTo(name);
			criteria.andPCityLike("%" + city + "%");
			criteria.andPNameLike("%" + industryName + "%");
			List<PostRelease> list = postReleaseMapper.selectByExample(example);
			if (list.size() == 0) {
				return null;
			} else {
				return list;
			}
		} else if (city != null && positionName != null) {
			PostReleaseExample example = new PostReleaseExample();
			net.zgysrc.www.bean.PostReleaseExample.Criteria criteria = example.createCriteria();
			criteria.andCCompanyNameEqualTo(name);
			criteria.andPCityLike("%" + city + "%");
			criteria.andPTyoeTwoLike("%" + positionName + "%");
			List<PostRelease> list = postReleaseMapper.selectByExample(example);
			if (list.size() == 0) {
				return null;
			} else {
				return list;
			}
		} else if (industryName != null && positionName != null) {
			PostReleaseExample example = new PostReleaseExample();
			net.zgysrc.www.bean.PostReleaseExample.Criteria criteria = example.createCriteria();
			criteria.andCCompanyNameEqualTo(name);
			criteria.andPTyoeTwoLike("%" + positionName + "%");
			criteria.andPNameLike("%" + industryName + "%");
			List<PostRelease> list = postReleaseMapper.selectByExample(example);
			if (list.size() == 0) {
				return null;
			} else {
				return list;
			}
		} else if (city != null) {
			PostReleaseExample example = new PostReleaseExample();
			net.zgysrc.www.bean.PostReleaseExample.Criteria criteria = example.createCriteria();
			criteria.andCCompanyNameEqualTo(name);
			criteria.andPCityLike("%" + city + "%");
			List<PostRelease> list = postReleaseMapper.selectByExample(example);
			if (list.size() == 0) {
				return null;
			} else {
				return list;
			}
		} else if (industryName != null) {
			PostReleaseExample example = new PostReleaseExample();
			net.zgysrc.www.bean.PostReleaseExample.Criteria criteria = example.createCriteria();
			criteria.andCCompanyNameEqualTo(name);
			criteria.andPNameLike("%" + industryName + "%");
			List<PostRelease> list = postReleaseMapper.selectByExample(example);
			if (list.size() == 0) {
				return null;
			} else {
				return list;
			}
		} else if (positionName != null) {
			PostReleaseExample example = new PostReleaseExample();
			net.zgysrc.www.bean.PostReleaseExample.Criteria criteria = example.createCriteria();
			criteria.andCCompanyNameEqualTo(name);
			criteria.andPTyoeTwoLike("%" + positionName + "%");
			List<PostRelease> list = postReleaseMapper.selectByExample(example);
			if (list.size() == 0) {
				return null;
			} else {
				return list;
			}
		} else {
			PostReleaseExample example = new PostReleaseExample();
			net.zgysrc.www.bean.PostReleaseExample.Criteria criteria = example.createCriteria();
			criteria.andCCompanyNameEqualTo(name);
			List<PostRelease> list = postReleaseMapper.selectByExample(example);
			if (list.size() == 0) {
				return null;
			} else {
				return list;
			}
		}
	}

	public List<CompanyInfo> recommendCompany() {
		CompanyInfoExample example = new CompanyInfoExample();
		net.zgysrc.www.bean.CompanyInfoExample.Criteria criteria = example.createCriteria();
		criteria.andCCompanyTypeTwoEqualTo("topindex");
		List<CompanyInfo> list = companyInfoMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public List<PostRelease> findByConditionIf(PostRelease postRelease) {
		List<PostRelease> list = postReleaseDynamicSQL.getPostReleaseByConditionIf(postRelease);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public List<CompanyInfo> topCompanyFind() {
		CompanyInfoExample example = new CompanyInfoExample();
		net.zgysrc.www.bean.CompanyInfoExample.Criteria criteria = example.createCriteria();
		criteria.andCCompanyTypeTwoEqualTo("topfind");
		List<CompanyInfo> list = companyInfoMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public List<PostRelease> findByConditionOr(PostRelease postRelease) {
		List<PostRelease> list = postReleaseDynamicSQL.getPostReleaseByConditionOr(postRelease);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public SimpleUser loginByUserName(SimpleUser simpleUsers) throws Exception {
		SimpleUserExample example = new SimpleUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andSimpleNameEqualTo(simpleUsers.getSimpleName());
		criteria.andSimplePasswordEqualTo(UtilsMD5.md5(simpleUsers.getSimplePassword()));
		List<SimpleUser> list = simpleUserMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list.get(0);
		}
	}

	public Resume getAllSimpleUserInfo(String simpleName) {
		ResumeExample example = new ResumeExample();
		net.zgysrc.www.bean.ResumeExample.Criteria criteria = example.createCriteria();
		criteria.andRealNameEqualTo(simpleName);
		List<Resume> list = resumeMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list.get(0);
		}

	}

	public boolean setResume(Resume resume) {
		int state = resumeMapper.insert(resume);
		if (state == 1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean updateSimpleUserInfo(SimpleUser simpleUsers) throws Exception {
		String pass = simpleUsers.getSimplePassword();
		String md5pass = UtilsMD5.md5(pass);
		simpleUsers.setSimplePassword(md5pass);
		int state = simpleUserMapper.updateByPrimaryKeySelective(simpleUsers);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean updateSimpleUserResume(Resume resume) {
		int state = resumeMapper.updateByPrimaryKeySelective(resume);
		if (state == 1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean sendResume(GetResume getResume) {
		int state = getResumeMapper.insertSelective(getResume);
		if (state == 1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkPassword(SimpleUser u) throws Exception {
		SimpleUserExample example = new SimpleUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andSimpleNameEqualTo(u.getSimpleName());
		criteria.andSimplePasswordEqualTo(UtilsMD5.md5(u.getSimplePassword()));
		List<SimpleUser> list = simpleUserMapper.selectByExample(example);
		if (list.size() == 0) {
			return false;
		} else {
			return true;
		}
	}

	public Integer getClick(Integer id) {
		CompanyInfo c = companyInfoMapper.selectByPrimaryKey(id);
		return c.getClicks();
	}

	public void updateCompanyClick(CompanyInfo info) {
		companyInfoMapper.updateByPrimaryKeySelective(info);
	}

	public List<Map<String, Object>> testSend(CompanyInfo record) {
		List<Map<String, Object>> map = companyInfoDynamicSQLMapper.selectInfo(record);
		return map;
	}

	public boolean checkFollowCompany(Integer id, Integer id2) {
		FollowListExample example = new FollowListExample();
		net.zgysrc.www.bean.FollowListExample.Criteria criteria = example.createCriteria();
		criteria.andFollowUserIdEqualTo(id);
		criteria.andFollowCompanyIdEqualTo(id2);
		List<FollowList> list = followListMapper.selectByExample(example);
		if (list.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean followCompany(Integer id, Integer id2) {
		FollowList fl = new FollowList();
		fl.setFollowUserId(id);
		fl.setFollowCompanyId(id2);
		int state = followListMapper.insert(fl);
		if (state == 1) {
			return true;
		} else {
			return false;
		}
	}

	public List<Map<String, Object>> showFollowCompany(Integer id) {
		FollowListExample example = new FollowListExample();
		net.zgysrc.www.bean.FollowListExample.Criteria criteria = example.createCriteria();
		criteria.andFollowUserIdEqualTo(id);
		List<FollowList> list = followListMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			List<Map<String, Object>> lists = new ArrayList<Map<String, Object>>();
			for (FollowList followList : list) {
				Map<String, Object> map = companyInfoDynamicSQLMapper.selectInfoById(followList.getFollowCompanyId());
				lists.add(map);
			}
			return lists;
		}
	}

	public List<Map<String, Object>> theHotCompanyInfo() {
		CompanyInfo record = new CompanyInfo();
		record.setHotOrNot("hots");
		List<Map<String, Object>> list = companyInfoDynamicSQLMapper.selectInfo(record);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public List<Map<String, Object>> indexScrollBarCompanyInfo() {
		CompanyInfo record = new CompanyInfo();
		record.setHotOrNot("indexScrollBarCompanyInfo");
		List<Map<String, Object>> list = companyInfoDynamicSQLMapper.selectInfo(record);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public List<Map<String, Object>> theHotCompanyInfoZhaoping() {
		CompanyInfoExample example = new CompanyInfoExample();
		net.zgysrc.www.bean.CompanyInfoExample.Criteria criteria = example.createCriteria();
		criteria.andCChaopingEqualTo("test");
		List<CompanyInfo> lists = companyInfoMapper.selectByExample(example);
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		if (lists.size() == 0) {
			return null;
		} else {
			for (int i = 0; i < lists.size(); i++) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("cCompanyName", lists.get(i).getcCompanyName());
				map.put("id", lists.get(i).getId());
				map.put("cCompanyLogo", lists.get(i).getcCompanyLogo());
				list.add(map);
			}
			return list;
		}
	}

	public List<Map<String, Object>> theHotCompanyInfoSchool() {
		CompanyInfoExample example = new CompanyInfoExample();
		net.zgysrc.www.bean.CompanyInfoExample.Criteria criteria = example.createCriteria();
		criteria.andCSchoolEqualTo("校园招聘");
		List<CompanyInfo> lists = companyInfoMapper.selectByExample(example);
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		if (lists.size() == 0) {
			return null;
		} else {
			for (CompanyInfo companyInfo : lists) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("cCompanyName", companyInfo.getcCompanyName());
				map.put("id", companyInfo.getId());
				map.put("cCompanyLogo", companyInfo.getcCompanyLogo());
				list.add(map);
			}
			return list;
		}
	}

	public List<Map<String, Object>> indexArticle() {
		List<Map<String, Object>> list = articleDynamicSQLMapper.selectBy(null);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public List<Map<String, Object>> getallArticleListByFatherId(Object object) {
		ArticleList articleList = new ArticleList();
		articleList.setArticleListFatherId((Integer) object);
		List<Map<String, Object>> list = articleListDynamicSQLMapper.selectBy(articleList);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public ArticleList getArticleListById(Integer id) {
		ArticleList articleList = articleListMapper.selectByPrimaryKey(id);
		if (articleList == null) {
			return null;
		} else {
			return articleList;
		}
	}

	public Article indexMoreArticle(Integer id) {
		Article article = articleMapper.selectByPrimaryKey(id);
		if (article == null) {
			return null;
		} else {
			return article;
		}
	}

	public List<ArticleList> getRankingList() {
		ArticleListExample example = new ArticleListExample();
		example.setOrderByClause("article_list_click_num desc");
		List<ArticleList> list = articleListMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			List<ArticleList> lists = new ArrayList<ArticleList>();
			for (int i = 0; i < 10; i++) {
				lists.add(list.get(i));
			}
			return lists;
		}
	}

	public GetResume msgResume(Integer id, Integer id2) {
		GetResumeExample example = new GetResumeExample();
		net.zgysrc.www.bean.GetResumeExample.Criteria criteria = example.createCriteria();
		criteria.andPostIdEqualTo(id);
		criteria.andSimpleUserIdEqualTo(id2);
		List<GetResume> list = getResumeMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list.get(0);
		}
	}

	public Resume seeUserStyle(Integer id) {
		Resume resume = resumeMapper.selectByPrimaryKey(id);
		if (resume == null) {
			return null;
		} else {
			return resume;
		}
	}

	public CompanyUser findPsotNameId(String getcUserName) {
		CompanyUserExample example = new CompanyUserExample();
		net.zgysrc.www.bean.CompanyUserExample.Criteria criteria = example.createCriteria();
		criteria.andCUserNameEqualTo(getcUserName);
		List<CompanyUser> list = companyUserMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list.get(0);
		}
	}

	public void updateSimpleUserVip(Integer userId) {
		SimpleUser simpleUser = new SimpleUser();
		simpleUser.setId(userId);
		simpleUser.setVipType("vip");
		Calendar c = Calendar.getInstance();
		Date date = new Date();
		c.setTime(date);
		c.add(Calendar.MONTH, 1); // 将当前日期加一个月
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String endTime = sdf.format(date);
		simpleUser.setVipEndTime(endTime);
	}

	public CompanyInfo getCompanyInfoById(Integer id) {
		CompanyInfo companyInfo = companyInfoMapper.selectByPrimaryKey(id);
		return companyInfo;
	}

	public SimpleUser getSimpleUser(String mobile) {
		SimpleUserExample example = new SimpleUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andMobileEqualTo(mobile);
		List<SimpleUser> list = simpleUserMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list.get(0);
		}
	}

	public boolean checkCode(String mobile) {
		MobileCodeExample example = new MobileCodeExample();
		net.zgysrc.www.bean.MobileCodeExample.Criteria criteria = example.createCriteria();
		criteria.andMobileEqualTo(mobile);
		List<MobileCode> list = mobileCodeMapper.selectByExample(example);
		if (list.size() == 0) {
			return false;
		} else {
			return true;
		}
	}

	public Resume getResume(SimpleUser simpleUser) {
		ResumeExample example = new ResumeExample();
		net.zgysrc.www.bean.ResumeExample.Criteria criteria = example.createCriteria();
		criteria.andRealNameEqualTo(simpleUser.getMobile());
		List<Resume> list = resumeMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list.get(0);
		}
	}

	public List<PostRelease> getCandidatePositionsList(String postName) {
		PostReleaseExample example = new PostReleaseExample();
		net.zgysrc.www.bean.PostReleaseExample.Criteria criteria = example.createCriteria();
		if (postName == null) {
			List<PostRelease> list = postReleaseMapper.selectByExample(null);
			List<PostRelease> lists = new ArrayList<PostRelease>();
			for (int i = 0; i < 5; i++) {
				lists.add(list.get(i));
			}
			return lists;
		}
		criteria.andPTyoeTwoEqualTo(UtilStringBufferToString.stringBufferToString(postName));
		List<PostRelease> list = postReleaseMapper.selectByExample(example);
		List<PostRelease> lists = new ArrayList<PostRelease>();
		for (int i = 0; i < 5; i++) {
			lists.add(list.get(i));
		}
		return lists;
	}

	public List<ArticleList> getArticleList() {
		ArticleListExample example = new ArticleListExample();
		example.setOrderByClause("article_list_click_num desc");
		net.zgysrc.www.bean.ArticleListExample.Criteria criteria = example.createCriteria();
		criteria.andArticleListFatherIdEqualTo(2);
		List<ArticleList> list = articleListMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			List<ArticleList> lists = new ArrayList<ArticleList>();
			for (int i = 0; i < 5; i++) {
				lists.add(list.get(i));
			}
			return lists;
		}
	}

	public List<ArticleList> getArticleDynamicList() {
		ArticleListExample example = new ArticleListExample();
		example.setOrderByClause("article_list_click_num desc");
		net.zgysrc.www.bean.ArticleListExample.Criteria criteria = example.createCriteria();
		criteria.andArticleListFatherIdEqualTo(4);
		List<ArticleList> list = articleListMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			List<ArticleList> lists = new ArrayList<ArticleList>();
			for (int i = 0; i < 5; i++) {
				lists.add(list.get(i));
			}
			return lists;
		}
	}

	public List<Map<String, Object>> getSendCompanyList(Integer id, Integer pn) {
		GetResumeExample example = new GetResumeExample();
		net.zgysrc.www.bean.GetResumeExample.Criteria criteria = example.createCriteria();
		example.setOrderByClause("id desc");
		criteria.andSimpleUserIdEqualTo(id);
		List<GetResume> list = getResumeMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			List<Map<String, Object>> lists = new ArrayList<Map<String, Object>>();
			for (int i = 0; i < list.size(); i++) {
				Map<String, Object> map = new HashMap<String, Object>();
				PostRelease postRelease = postReleaseMapper.selectByPrimaryKey(list.get(i).getPostId());
				criteria.andPostIdEqualTo(list.get(i).getPostId());
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String nowDate = sdf.format(date);
				Calendar calendar = Calendar.getInstance();
				calendar.add(Calendar.MONTH, -2);
				Date alDate = calendar.getTime();
				String alDateStr = sdf.format(alDate);
				criteria.andSendTimeBetween(alDateStr, nowDate);
				long num = getResumeMapper.countByExample(example) + 1;
				postRelease.setDept(list.get(i).getSendTime());
				map.put("postRelease", postRelease);
				map.put("viewState", list.get(i).getViewState());
				map.put("ResumeMatching", list.get(i).getResumeMatching());
				map.put("num", num);
				lists.add(map);
			}
			return lists;
		}
	}

	public List<Map<String, Object>> gerAllCollectionPostList(Integer id) {
		CollectionPostExample example = new CollectionPostExample();
		example.setOrderByClause("id desc");
		net.zgysrc.www.bean.CollectionPostExample.Criteria criteria = example.createCriteria();
		criteria.andUerIdEqualTo(id);
		List<CollectionPost> list = collectionPostMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			List<Map<String, Object>> lists = new ArrayList<Map<String, Object>>();
			for (int i = 0; i < list.size(); i++) {
				Map<String, Object> map = new HashMap<String, Object>();
				PostRelease postRelease = postReleaseMapper.selectByPrimaryKey(list.get(i).getPostId());
				map.put("postRelease", postRelease);
				map.put("collectId", list.get(i).getId());
				lists.add(map);
			}
			return lists;
		}
	}

	public boolean deleteCollectionPost(List<Integer> ida) {
		CollectionPostExample example = new CollectionPostExample();
		net.zgysrc.www.bean.CollectionPostExample.Criteria criteria = example.createCriteria();
		criteria.andIdIn(ida);
		int state = collectionPostMapper.deleteByExample(example);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean sendResumeToCollectionPost(List<Integer> ids, SimpleUser simpleUser) {
		CollectionPostExample example = new CollectionPostExample();
		net.zgysrc.www.bean.CollectionPostExample.Criteria criteria = example.createCriteria();
		criteria.andIdIn(ids);
		List<CollectionPost> list = collectionPostMapper.selectByExample(example);
		int a = 0;
		for (int i = 0; i < list.size(); i++) {
			PostRelease postRelease = postReleaseMapper.selectByPrimaryKey(list.get(i).getPostId());
			GetResume getResume = new GetResume();
			Resume resume = getAllSimpleUserInfo(simpleUser.getMobile());
			getResume.setPostSimpleResumeId(resume.getId());
			getResume.setPostId(postRelease.getId());
			getResume.setPostCompanyId(postRelease.getcId());
			getResume.setSimpleUserId(simpleUser.getId());
			getResume.setPostUserName(postRelease.getcUserName());
			getResume.setViewState("未查看");
			getResume.setResumeMatching("未审批");
			CompanyUser companyUser = findPsotNameId(postRelease.getcUserName());
			if (companyUser == null) {
				a++;
				continue;
			}
			getResume.setPostUserIds(companyUser.getId());
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String time = sdf.format(date);
			getResume.setSendTime(time.toString());
			sendResume(getResume);
		}
		if (a != 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean updateUserName(SimpleUser simpleUser) {
		int state = simpleUserMapper.updateByPrimaryKey(simpleUser);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean updateUserMobile(SimpleUser simpleUser, Resume resume) throws Exception {
		int updateUserInfo = simpleUserMapper.updateByPrimaryKey(simpleUser);
		int updateResume = resumeMapper.updateByPrimaryKey(resume);
		if ((updateUserInfo != 0) || (updateResume != 0)) {
			return true;
		} else {
			throw new Exception("强制回滚！");
		}
	}

	public MobileCode getMobileCode(String mobile) {
		MobileCodeExample example = new MobileCodeExample();
		net.zgysrc.www.bean.MobileCodeExample.Criteria criteria = example.createCriteria();
		criteria.andMobileEqualTo(mobile);
		List<MobileCode> list = mobileCodeMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list.get(0);
		}
	}

	public CollectionPost getCollectPostById(Integer id) {
		CollectionPost collectionPost = collectionPostMapper.selectByPrimaryKey(id);
		return collectionPost;
	}

	public List<PostRelease> getInterestedPost(Integer id) {
		PostRelease postRelease = postReleaseMapper.selectByPrimaryKey(id);
		PostReleaseExample example = new PostReleaseExample();
		example.setOrderByClause("id desc");
		net.zgysrc.www.bean.PostReleaseExample.Criteria criteria = example.createCriteria();
		criteria.andPNameLike(UtilStringBufferToString.stringBufferToString(postRelease.getpName()));
		List<PostRelease> list = postReleaseMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			list.remove(postRelease);
			return list;
		}
	}

	public List<Map<String, Object>> getHotPost() {
		PostReleaseExample example = new PostReleaseExample();
		example.setOrderByClause("clicks desc");
		List<PostRelease> list = postReleaseMapper.selectByExample(example);
		List<Map<String, Object>> listFinall = new ArrayList<Map<String, Object>>();
		for (int i = 0; i < 15; i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("id", list.get(i).getId());
			map.put("postName", list.get(i).getpTyoeTwo());
			listFinall.add(map);
		}
		return listFinall;
	}

	public List<Map<String, Object>> getHotCity() {
		PostReleaseExample example = new PostReleaseExample();
		example.setOrderByClause("clicks desc");
		List<PostRelease> list = postReleaseMapper.selectByExample(example);
		List<Map<String, Object>> listFinall = new ArrayList<Map<String, Object>>();
		for (int i = 0; i < 15; i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("City", list.get(i).getpCity());
			listFinall.add(map);
		}
		return listFinall;
	}

	public List<Map<String , Object>> getPicPayList(Integer integer) {
		PicPayInfoExample example = new PicPayInfoExample();
		example.setOrderByClause("id desc");
		net.zgysrc.www.bean.PicPayInfoExample.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(integer);
		List<PicPayInfo> list = picPayInfoMapper.selectByExample(example);
		if (0 == list.size()) {
			return null;
		} else {
			List<Map<String , Object>> list2 = new ArrayList<Map<String,Object>>();
			for(int i = 0 ; i < list.size() ; i ++){
				Map<String , Object> map = new HashMap<String, Object>();
				ArtPicInfo artPicInfo = artPicInfoMapper.selectByPrimaryKey(list.get(i).getGoodsId());
				map.put("artPicInfo", artPicInfo.getPicName());
				map.put("picPayInfo", list.get(i));
				list2.add(map);
			}
			return list2;
		}
	}

	public void addUserReceivingAddress(UserReceivingAddress userReceivingAddress) {
		userReceivingAddressMapper.insert(userReceivingAddress);
	}

	public boolean changePicPayList(PicPayInfo picPayInfo) {
		int state = picPayInfoMapper.updateByPrimaryKeySelective(picPayInfo);
		if(0 == state){
			return false;
		}else{
			return true;
		}
	}

	public List<ArtGallery> getArtGalleryByUser(Integer id) {
		ArtGalleryExample example = new ArtGalleryExample();
		net.zgysrc.www.bean.ArtGalleryExample.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(id);
		List<ArtGallery> list = artGalleryMapper.selectByExample(example);
		if(0 == list.size()){
			return null;
		}else{
			return list;
		}
	}

	public ArtGallery getArtGalleryByUserById(Integer id) {
		ArtGallery artGallery = artGalleryMapper.selectByPrimaryKey(id);
		return artGallery;
	}

	public boolean deleteArtGalleryByUser(Integer id) {
		int state = artGalleryMapper.deleteByPrimaryKey(id);
		ArtPicInfoExample example = new ArtPicInfoExample();
		net.zgysrc.www.bean.ArtPicInfoExample.Criteria criteria = example.createCriteria();
		criteria.andFatherIdEqualTo(id);
		artPicInfoMapper.deleteByExample(example);
		if(state == 0){
			return false;
		}else{
			return true;
		}
	}

	public boolean deleteArtImgInfoByUser(Integer id) {
		return artPicInfoMapper.deleteByPrimaryKey(id) != 0;
	}

}
