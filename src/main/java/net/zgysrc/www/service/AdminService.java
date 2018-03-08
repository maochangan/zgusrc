package net.zgysrc.www.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.zgysrc.www.bean.AdminUser;
import net.zgysrc.www.bean.AdminUserExample;
import net.zgysrc.www.bean.Article;
import net.zgysrc.www.bean.ArticleExample;
import net.zgysrc.www.bean.ArticleList;
import net.zgysrc.www.bean.ArticleListExample;
import net.zgysrc.www.bean.AualificationCertification;
import net.zgysrc.www.bean.AualificationCertificationExample;
import net.zgysrc.www.bean.BookTypes;
import net.zgysrc.www.bean.CarouselPic;
import net.zgysrc.www.bean.CollectionPost;
import net.zgysrc.www.bean.CollectionPostExample;
import net.zgysrc.www.bean.CompanyInfo;
import net.zgysrc.www.bean.CompanyInfoExample;
import net.zgysrc.www.bean.CompanyUser;
import net.zgysrc.www.bean.CompanyUserExample;
import net.zgysrc.www.bean.CompanyVip;
import net.zgysrc.www.bean.CompanyVipExample;
import net.zgysrc.www.bean.CompanyUserExample.Criteria;
import net.zgysrc.www.bean.ImageInfo;
import net.zgysrc.www.bean.PostRelease;
import net.zgysrc.www.bean.PostReleaseExample;
import net.zgysrc.www.bean.Resume;
import net.zgysrc.www.bean.ResumeExample;
import net.zgysrc.www.bean.SimplePrice;
import net.zgysrc.www.bean.SimpleUser;
import net.zgysrc.www.bean.SimpleUserExample;
import net.zgysrc.www.dao.AdminUserMapper;
import net.zgysrc.www.dao.ArticleListMapper;
import net.zgysrc.www.dao.ArticleMapper;
import net.zgysrc.www.dao.AualificationCertificationMapper;
import net.zgysrc.www.dao.BookTypesMapper;
import net.zgysrc.www.dao.CarouselPicMapper;
import net.zgysrc.www.dao.CollectionPostMapper;
import net.zgysrc.www.dao.CompanyInfoMapper;
import net.zgysrc.www.dao.CompanyUserMapper;
import net.zgysrc.www.dao.CompanyVipMapper;
import net.zgysrc.www.dao.ImageInfoMapper;
import net.zgysrc.www.dao.PostReleaseDynamicSQL;
import net.zgysrc.www.dao.PostReleaseMapper;
import net.zgysrc.www.dao.ResumeDynamicSQLMapper;
import net.zgysrc.www.dao.ResumeMapper;
import net.zgysrc.www.dao.SimplePriceMapper;
import net.zgysrc.www.dao.SimpleUserMapper;
import net.zgysrc.www.utils.UtilStringBufferToString;

@Service
@Transactional
public class AdminService {

	@Autowired
	private CompanyInfoMapper companyInfoMapper;
	@Autowired
	private CompanyUserMapper companyUserMapper;
	@Autowired
	private PostReleaseMapper postReleaseMapper;
	@Autowired
	private PostReleaseDynamicSQL postReleaseDynamicSQL;
	@Autowired
	private ArticleListMapper articleListMapper;
	@Autowired
	private ArticleMapper articleMapper;
	@Autowired
	private SimpleUserMapper simpleUserMapper;
	@Autowired
	private CollectionPostMapper collectionPostMapper;
	@Autowired
	private AdminUserMapper adminUserMapper;
	@Autowired
	private AualificationCertificationMapper aualificationCertificationMapper;
	@Autowired
	private ResumeDynamicSQLMapper dynamicSQLMapper;
	@Autowired
	private ResumeMapper resumeMapper;
	@Autowired
	private BookTypesMapper bookTypesMapper;
	@Autowired
	private ImageInfoMapper imageInfoMapper;
	@Autowired
	private CarouselPicMapper carouselPicMapper;
	@Autowired
	private SimplePriceMapper simplePriceMapper;
	@Autowired
	private CompanyVipMapper companyVipMapper;

	public List<CompanyInfo> companyFindAll() {
		CompanyInfoExample example = new CompanyInfoExample();
		example.setOrderByClause("id desc");
		List<CompanyInfo> list = companyInfoMapper.selectByExample(example);
		return list;
	}

	/**
	 * 根据企业名查询
	 * 
	 * @param cCompanyName
	 * @return
	 */
	public List<CompanyUser> companyFindCompanyUser(String cCompanyName) {
		CompanyUserExample example = new CompanyUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andCNameEqualTo(cCompanyName);
		List<CompanyUser> list = companyUserMapper.selectByExample(example);
		return list;
	}

	public boolean addCompany(CompanyInfo companyInfo) {
		CompanyInfoExample example = new CompanyInfoExample();
		net.zgysrc.www.bean.CompanyInfoExample.Criteria criteria = example.createCriteria();
		criteria.andCCompanyNameEqualTo(companyInfo.getcCompanyName());
		List<CompanyInfo> list = companyInfoMapper.selectByExample(example);

		if (list.size() != 0) {
			return false;
		} else {
			companyInfoMapper.insert(companyInfo);
			return true;
		}

	}

	/**
	 * 用户名查询
	 * 
	 * @param companyUser
	 * @return
	 */
	public boolean findByName(CompanyUser companyUser) {
		CompanyUserExample example = new CompanyUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andCUserNameEqualTo(companyUser.getcUserName());
		List<CompanyUser> list = companyUserMapper.selectByExample(example);
		if (list.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean findByTel(CompanyUser companyUser) {
		CompanyUserExample example = new CompanyUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andCTelephoneNumberEqualTo(companyUser.getcTelephoneNumber());
		List<CompanyUser> list = companyUserMapper.selectByExample(example);
		if (list.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean findByEmial(CompanyUser companyUser) {
		CompanyUserExample example = new CompanyUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andEmailAcEqualTo(companyUser.getcEmail());
		List<CompanyUser> list = companyUserMapper.selectByExample(example);
		if (list.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean addCompanyUser(CompanyUser companyUser) {
		int state = companyUserMapper.insert(companyUser);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

	public List<CompanyUser> companyAllUser() {
		List<CompanyUser> list = companyUserMapper.selectByExample(null);
		return list;
	}

	public List<PostRelease> positionList() {
		List<PostRelease> list = postReleaseMapper.selectByExample(null);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public boolean addPosition(PostRelease postRelease) {
		int state = postReleaseMapper.insert(postRelease);
		if (state == 1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean dropCompany(Integer id) {
		int state = companyInfoMapper.deleteByPrimaryKey(id);
		if (state == 1) {
			return true;
		} else {
			return false;
		}
	}

	public CompanyInfo checkCompanyInfo(Integer id) {
		CompanyInfo companyInfo = companyInfoMapper.selectByPrimaryKey(id);
		return companyInfo;
	}

	public boolean reviewCompany(CompanyInfo companyInfo) {
		int state = companyInfoMapper.updateByPrimaryKeySelective(companyInfo);
		if (state == 1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean getTopCompanyIndex() {
		CompanyInfoExample example = new CompanyInfoExample();
		net.zgysrc.www.bean.CompanyInfoExample.Criteria criteria = example.createCriteria();
		criteria.andTopEqualTo("top");
		List<CompanyInfo> list = companyInfoMapper.selectByExample(example);
		if (list.size() < 6) {
			return true;
		} else {
			return false;
		}
	}

	public boolean setTopCompanyIndex(CompanyInfo companyInfo) {
		if (companyInfo.getTop().equals("top")) {
			int state = companyInfoMapper.updateByPrimaryKeySelective(companyInfo);
			if (state == 1) {
				return true;
			} else {
				return false;
			}
		} else {
			int state = companyInfoMapper.updateByPrimaryKeySelective(companyInfo);
			if (state == 1) {
				return true;
			} else {
				return false;
			}
		}
	}

	public boolean getTopCompanyPostRelease() {
		CompanyInfoExample example = new CompanyInfoExample();
		net.zgysrc.www.bean.CompanyInfoExample.Criteria criteria = example.createCriteria();
		criteria.andCCompanyTypeTwoEqualTo("topfind");
		List<CompanyInfo> list = companyInfoMapper.selectByExample(example);
		if (list.size() < 9) {
			return true;
		} else {
			return false;
		}
	}

	public boolean setTopCompanyPostRelease(CompanyInfo companyInfo) {
		if (companyInfo.getcCompanyTypeTwo().equals("topfind")) {
			int state = companyInfoMapper.updateByPrimaryKeySelective(companyInfo);
			if (state == 1) {
				return true;
			} else {
				return false;
			}
		} else {
			int state = companyInfoMapper.updateByPrimaryKeySelective(companyInfo);
			if (state == 1) {
				return true;
			} else {
				return false;
			}
		}
	}

	public CompanyInfo findCompanyInfoByName(String getcCompanyName) {
		CompanyInfoExample example = new CompanyInfoExample();
		net.zgysrc.www.bean.CompanyInfoExample.Criteria criteria = example.createCriteria();
		criteria.andCCompanyNameEqualTo(getcCompanyName);
		List<CompanyInfo> list = companyInfoMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list.get(0);
		}
	}

	public List<CompanyUser> getCompanyUserName(String cCompanyName) {
		CompanyUserExample example = new CompanyUserExample();
		net.zgysrc.www.bean.CompanyUserExample.Criteria criteria = example.createCriteria();
		criteria.andCNameEqualTo(cCompanyName);
		List<CompanyUser> list = companyUserMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public boolean addArticleList(ArticleList articleList) {
		int state = articleListMapper.insert(articleList);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean updateArticleList(ArticleList articleList) {
		int state = articleListMapper.updateByPrimaryKeySelective(articleList);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean deleteArticleList(Integer id) {
		int state = articleListMapper.deleteByPrimaryKey(id);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean updateArticle(Article article) {
		int state = articleMapper.updateByPrimaryKeySelective(article);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

	public CompanyUser getCompanyUserInfo(Integer id) {
		CompanyUser companyUser = companyUserMapper.selectByPrimaryKey(id);
		if (companyUser == null) {
			return null;
		} else {
			return companyUser;
		}
	}

	public List<Map<String, Object>> getPostReleaseByUserId(Integer id) {
		CompanyUser companyUser = getCompanyUserInfo(id);
		if (companyUser == null) {
			return null;
		} else {
			PostRelease postRelease = new PostRelease();
			postRelease.setcUserName(companyUser.getcUserName());
			List<Map<String, Object>> list = postReleaseDynamicSQL.selectInfo(postRelease);
			if (list.size() == 0) {
				return null;
			} else {
				return list;
			}
		}
	}

	public List<PostRelease> getPostReleaseByCompanyId(Integer id) {
		PostReleaseExample example = new PostReleaseExample();
		net.zgysrc.www.bean.PostReleaseExample.Criteria criteria = example.createCriteria();
		criteria.andCIdEqualTo(id);
		List<PostRelease> list = postReleaseMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public boolean deletePostReleaseById(Integer id) {
		int state = postReleaseMapper.deleteByPrimaryKey(id);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

	public PostRelease getPostById(Integer id) {
		PostRelease postRelease = postReleaseMapper.selectByPrimaryKey(id);
		if (postRelease == null) {
			return null;
		} else {
			return postRelease;
		}
	}

	public int getAllSimpleUsrNum() {
		List<SimpleUser> list = simpleUserMapper.selectByExample(null);
		return list.size();
	}

	public boolean checkCollection(Integer id, Integer id2) {
		CollectionPostExample example = new CollectionPostExample();
		net.zgysrc.www.bean.CollectionPostExample.Criteria criteria = example.createCriteria();
		criteria.andPostIdEqualTo(id);
		criteria.andUerIdEqualTo(id2);
		List<CollectionPost> list = collectionPostMapper.selectByExample(example);
		if (list.size() == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean collectionPost(Integer id, Integer id2) {
		CollectionPost record = new CollectionPost();
		record.setPostId(id);
		record.setUerId(id2);
		int state = collectionPostMapper.insert(record);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean adminUserLogoin(AdminUser adminUser) {
		AdminUserExample example = new AdminUserExample();
		net.zgysrc.www.bean.AdminUserExample.Criteria criteria = example.createCriteria();
		criteria.andAdminEqualTo(adminUser.getAdmin());
		criteria.andPasswordEqualTo(adminUser.getPassword());
		List<AdminUser> list = adminUserMapper.selectByExample(example);
		if (list.size() == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean checkScrollBar() {
		CompanyInfoExample example = new CompanyInfoExample();
		net.zgysrc.www.bean.CompanyInfoExample.Criteria criteria = example.createCriteria();
		criteria.andHotOrNotEqualTo("indexScrollBarCompanyInfo");
		List<CompanyInfo> list = companyInfoMapper.selectByExample(example);
		if (list.size() > 5) {
			return false;
		} else {
			return true;
		}
	}

	public boolean setScrollBar(Integer id) {
		CompanyInfo companyInfo = new CompanyInfo();
		companyInfo.setId(id);
		companyInfo.setHotOrNot("indexScrollBarCompanyInfo");
		int state = companyInfoMapper.updateByPrimaryKeySelective(companyInfo);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean checkScrollBar(Integer id) {
		CompanyInfo companyInfo = companyInfoMapper.selectByPrimaryKey(id);
		if (companyInfo.getHotOrNot().equals("indexScrollBarCompanyInfo")) {
			return true;
		} else {
			return false;
		}
	}

	public boolean removeScrollBar(Integer id) {
		CompanyInfo companyInfo = companyInfoMapper.selectByPrimaryKey(id);
		companyInfo.setHotOrNot("null");
		int state = companyInfoMapper.updateByPrimaryKeySelective(companyInfo);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

	public AualificationCertification checkQualifications(AualificationCertification aualificationCertification) {
		AualificationCertificationExample example = new AualificationCertificationExample();
		net.zgysrc.www.bean.AualificationCertificationExample.Criteria criteria = example.createCriteria();
		criteria.andIdCardNumEqualTo(aualificationCertification.getIdCardNum());
		List<AualificationCertification> list = aualificationCertificationMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list.get(0);
		}

	}

	public boolean addAualificationCertification(AualificationCertification aualificationCertification) {
		int state = aualificationCertificationMapper.insert(aualificationCertification);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

	public List<Map<String, String>> getUserStyle() {
		Resume resume = new Resume();
		resume.setUserStyle("实习");
		List<Map<String, String>> list = dynamicSQLMapper.selectByLessInfo(resume);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public List<CompanyInfo> getAllNeedReview() {
		CompanyInfoExample example = new CompanyInfoExample();
		example.setOrderByClause("id desc");
		net.zgysrc.www.bean.CompanyInfoExample.Criteria criteria = example.createCriteria();
		criteria.andCAcEqualTo("正在审核");
		List<CompanyInfo> list = companyInfoMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public List<CompanyInfo> getAllNotReviewCompany() {
		CompanyInfoExample example = new CompanyInfoExample();
		net.zgysrc.www.bean.CompanyInfoExample.Criteria criteria = example.createCriteria();
		criteria.andCAcEqualTo("审核不通过");
		List<CompanyInfo> list = companyInfoMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public ArticleList getArticleLists(Integer id) {
		ArticleList articleList = articleListMapper.selectByPrimaryKey(id);
		return articleList;
	}

	public List<SimpleUser> getSimpleUserList() {
		List<SimpleUser> list = simpleUserMapper.selectByExample(null);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public SimpleUser getSimpleUserInfo(Integer id) {
		SimpleUser simpleUser = simpleUserMapper.selectByPrimaryKey(id);
		if (simpleUser == null) {
			return null;
		} else {
			return simpleUser;
		}
	}

	public Resume getResumeByUserMobile(String mobile) {
		ResumeExample example = new ResumeExample();
		net.zgysrc.www.bean.ResumeExample.Criteria criteria = example.createCriteria();
		criteria.andMobileEqualTo(mobile);
		List<Resume> list = resumeMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list.get(0);
		}
	}

	public List<BookTypes> getBookType() {
		List<BookTypes> list = bookTypesMapper.selectByExample(null);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public boolean addBookTypes(BookTypes bookTypes) {
		int state = bookTypesMapper.insert(bookTypes);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean updateBookType(BookTypes bookTypes) {
		int state = bookTypesMapper.updateByPrimaryKeySelective(bookTypes);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

	public int getCompanySize() {
		List<CompanyInfo> list = companyInfoMapper.selectByExample(null);
		return list.size();
	}

	public int getPostSize() {
		List<PostRelease> list = postReleaseMapper.selectByExample(null);
		return list.size();
	}

	public List<SimpleUser> getAllSimpleUsrList() {
		List<SimpleUser> list = simpleUserMapper.selectByExample(null);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public boolean deleteSimpleUserById(Integer id) {
		SimpleUser simpleUser = simpleUserMapper.selectByPrimaryKey(id);
		if (simpleUser == null) {
			return false;
		} else {
			ResumeExample example = new ResumeExample();
			net.zgysrc.www.bean.ResumeExample.Criteria criteria = example.createCriteria();
			criteria.andMobileEqualTo(simpleUser.getMobile());
			List<Resume> list = resumeMapper.selectByExample(example);
			resumeMapper.deleteByPrimaryKey(list.get(0).getId());
			simpleUserMapper.deleteByPrimaryKey(id);
			return true;
		}
	}

	public List<CompanyInfo> getAddByAdminCompany() {
		CompanyInfoExample example = new CompanyInfoExample();
		net.zgysrc.www.bean.CompanyInfoExample.Criteria criteria = example.createCriteria();
		criteria.andCAcIsNull();
		List<CompanyInfo> list = companyInfoMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public List<CompanyInfo> getAllCompanyListWithExamine(String examine, String companyName) {
		CompanyInfoExample example = new CompanyInfoExample();
		net.zgysrc.www.bean.CompanyInfoExample.Criteria criteria = example.createCriteria();
		if (examine.equals("")) {
			criteria.andCAcIsNull();
			criteria.andCCompanyNameLike(UtilStringBufferToString.stringBufferToString(companyName));
			List<CompanyInfo> list = companyInfoMapper.selectByExample(example);
			if (list.size() == 0) {
				return null;
			} else {
				return list;
			}
		} else {
			criteria.andCAcEqualTo(examine);
			criteria.andCCompanyNameLike(UtilStringBufferToString.stringBufferToString(companyName));
			List<CompanyInfo> list = companyInfoMapper.selectByExample(example);
			if (list.size() == 0) {
				return null;
			} else {
				return list;
			}
		}
	}

	public boolean test() {
		int i = 1;
		if (i == 1) {
			return true;
		} else {
			return false;
		}
	}

	public List<ArticleList> getAllArticleList(String articleListName, String articleFatherName) {
		ArticleListExample example = new ArticleListExample();
		example.setOrderByClause("id desc");
		net.zgysrc.www.bean.ArticleListExample.Criteria criteria = example.createCriteria();
		criteria.andArticleListNameLike(UtilStringBufferToString.stringBufferToString(articleListName));
		if (articleFatherName != "") {
			criteria.andArticleFatherNameEqualTo(articleFatherName);
			List<ArticleList> list = articleListMapper.selectByExample(example);
			if (list.size() == 0) {
				return null;
			} else {
				return list;
			}
		} else {
			List<ArticleList> list = articleListMapper.selectByExample(example);
			if (list.size() == 0) {
				return null;
			} else {
				return list;
			}
		}

	}

	public Article getArticle(String articleFatherName) {
		ArticleExample example = new ArticleExample();
		net.zgysrc.www.bean.ArticleExample.Criteria criteria = example.createCriteria();
		criteria.andArticleNameEqualTo(articleFatherName);
		List<Article> list = articleMapper.selectByExample(example);
		return list.get(0);
	}

	public List<SimpleUser> getAllSimpleUsrListAll(String mobile) {
		SimpleUserExample example = new SimpleUserExample();
		example.setOrderByClause("id desc");
		net.zgysrc.www.bean.SimpleUserExample.Criteria criteria = example.createCriteria();
		if (mobile == "") {
			List<SimpleUser> list = simpleUserMapper.selectByExample(example);
			if (list.size() == 0) {
				return null;
			} else {
				return list;
			}
		} else {
			criteria.andMobileEqualTo(mobile);
			List<SimpleUser> list = simpleUserMapper.selectByExample(example);
			if (list.size() == 0) {
				return null;
			} else {
				return list;
			}
		}
	}

	public List<ImageInfo> getIndexPicList() {
		List<ImageInfo> list = imageInfoMapper.selectByExample(null);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public List<CarouselPic> getAnotherPicList() {
		List<CarouselPic> list = carouselPicMapper.selectByExample(null);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public boolean updateImageInfo(ImageInfo imageInfo) {
		int state = imageInfoMapper.updateByPrimaryKeySelective(imageInfo);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean updateCarouselPic(CarouselPic carouselPic) {
		int state = carouselPicMapper.updateByPrimaryKeySelective(carouselPic);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

	public List<SimplePrice> getSimpelVipInfo() {
		List<SimplePrice> list = simplePriceMapper.selectByExample(null);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public boolean updateSimpelVipInfo(SimplePrice simplePrice) {
		int state = simplePriceMapper.updateByPrimaryKeySelective(simplePrice);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

	public List<CompanyVip> getCompanyPriceList() {
		List<CompanyVip> list = companyVipMapper.selectByExample(null);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public boolean updateCompanyPriceList(CompanyVip companyVip) {
		int state = companyVipMapper.updateByPrimaryKeySelective(companyVip);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

	public CompanyVip getCompanyPriceType(String companyVipType) {
		CompanyVipExample example = new CompanyVipExample();
		net.zgysrc.www.bean.CompanyVipExample.Criteria criteria = example.createCriteria();
		criteria.andCompanyVipTypeEqualTo(companyVipType);
		List<CompanyVip> list = companyVipMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list.get(0);
		}
	}

	public CompanyVip getCompanyPricePrice(String vipPrice) {
		CompanyVipExample example = new CompanyVipExample();
		net.zgysrc.www.bean.CompanyVipExample.Criteria criteria = example.createCriteria();
		criteria.andCompanyVipPriceEqualTo(vipPrice);
		List<CompanyVip> list = companyVipMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list.get(0);
		}
	}

	public List<AualificationCertification> getAualificationCertificationList(String name) {
		AualificationCertificationExample example = new AualificationCertificationExample();
		example.setOrderByClause("id desc");
		net.zgysrc.www.bean.AualificationCertificationExample.Criteria criteria = example.createCriteria();
		if (name == "") {
			List<AualificationCertification> list = aualificationCertificationMapper.selectByExample(null);
			if (list.size() == 0) {
				return null;
			} else {
				return list;
			}
		} else {
			criteria.andCertificationNameLike(UtilStringBufferToString.stringBufferToString(name));
			List<AualificationCertification> list = aualificationCertificationMapper.selectByExample(example);
			if (list.size() == 0) {
				return null;
			} else {
				return list;
			}
		}
	}

	public boolean deleteAcF(Integer id) {
		int state = aualificationCertificationMapper.deleteByPrimaryKey(id);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

}
