package net.zgysrc.www.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.zgysrc.www.bean.CarouselPic;
import net.zgysrc.www.bean.CarouselPicExample;
import net.zgysrc.www.bean.CompanyInfo;
import net.zgysrc.www.bean.CompanyInfoExample;
import net.zgysrc.www.bean.CompanyType;
import net.zgysrc.www.bean.CompanyTypeExample;
import net.zgysrc.www.bean.CompanyTypeExample.Criteria;
import net.zgysrc.www.bean.CompanyTypes;
import net.zgysrc.www.bean.CompanyVip;
import net.zgysrc.www.bean.HatArea;
import net.zgysrc.www.bean.HatAreaExample;
import net.zgysrc.www.bean.HatCity;
import net.zgysrc.www.bean.HatCityExample;
import net.zgysrc.www.bean.HatProvince;
import net.zgysrc.www.bean.IndustryCategory;
import net.zgysrc.www.bean.IndustryCategoryExample;
import net.zgysrc.www.bean.PositionName;
import net.zgysrc.www.bean.PositionNameExample;
import net.zgysrc.www.bean.PostRelease;
import net.zgysrc.www.bean.PostitonType;
import net.zgysrc.www.bean.PostitonTypeExample;
import net.zgysrc.www.dao.CarouselPicMapper;
import net.zgysrc.www.dao.CompanyInfoMapper;
import net.zgysrc.www.dao.CompanyTypeMapper;
import net.zgysrc.www.dao.CompanyTypesMapper;
import net.zgysrc.www.dao.CompanyVipMapper;
import net.zgysrc.www.dao.HatAreaMapper;
import net.zgysrc.www.dao.HatCityMapper;
import net.zgysrc.www.dao.HatProvinceMapper;
import net.zgysrc.www.dao.IndustryCategoryMapper;
import net.zgysrc.www.dao.PositionNameMapper;
import net.zgysrc.www.dao.PostReleaseMapper;
import net.zgysrc.www.dao.PostitonTypeMapper;

@Service
@Transactional
public class UtilsControllerService {

	@Autowired
	private CompanyTypeMapper companyTypeMapper;
	@Autowired
	private IndustryCategoryMapper industryCategoryMapper;
	@Autowired
	private PostitonTypeMapper postitonTypeMapper;
	@Autowired
	private PositionNameMapper positionNameMapper;
	@Autowired
	private PostReleaseMapper postReleaseMapper;
	@Autowired
	private HatProvinceMapper hatProvinceMapper;
	@Autowired
	private HatCityMapper hatCityMapper;
	@Autowired
	private HatAreaMapper hatAreaMapper;
	@Autowired
	private CompanyInfoMapper companyInfoMapper;
	@Autowired
	private CarouselPicMapper carouselPicMapper;
	@Autowired
	private CompanyTypesMapper companyTypesMapper;
	@Autowired
	private CompanyVipMapper companyVipMapper;
	
	

	public List<CompanyType> findAll() {
		List<CompanyType> list = companyTypeMapper.selectByExample(null);
		return list;
	}

	public boolean addCompanyType(CompanyType cType) {
		CompanyTypeExample example = new CompanyTypeExample();
		Criteria criteria = example.createCriteria();
		criteria.andConpanyTypeEqualTo(cType.getConpanyType());
		List<CompanyType> list = companyTypeMapper.selectByExample(example);

		if (list.size() == 0) {
			int state = companyTypeMapper.insert(cType);
			if (state == 1) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	public boolean dropType(Integer id) {
		int state = companyTypeMapper.deleteByPrimaryKey(id);
		if (state == 1) {
			return true;
		}
		return false;
	}

	public List<IndustryCategory> findIndustryAll() {
		List<IndustryCategory> list = industryCategoryMapper.selectByExample(null);
		return list;
	}

	public boolean industryCategoryDrop(Integer id) {
		int state = industryCategoryMapper.deleteByPrimaryKey(id);
		if (state == 1) {
			return true;
		}
		return false;
	}

	public boolean industryCategoryAdd(IndustryCategory industryCategory) {
		IndustryCategoryExample example = new IndustryCategoryExample();
		net.zgysrc.www.bean.IndustryCategoryExample.Criteria criteria = example.createCriteria();
		criteria.andIndustryCategoryEqualTo(industryCategory.getIndustryCategory());
		List<IndustryCategory> list = industryCategoryMapper.selectByExample(example);
		if (list.size() == 0) {
			int state = industryCategoryMapper.insert(industryCategory);
			if (state == 1) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	public List<PostitonType> findPositionAll() {
		List<PostitonType> list = postitonTypeMapper.selectByExample(null);
		return list;
	}

	public boolean postitonTypeAdd(PostitonType postitonType) {
		PostitonTypeExample example = new PostitonTypeExample();
		net.zgysrc.www.bean.PostitonTypeExample.Criteria criteria = example.createCriteria();
		criteria.andPositionTypeEqualTo(postitonType.getPositionType());
		List<PostitonType> list = postitonTypeMapper.selectByExample(example);
		if (list.size() == 0) {
			int state = postitonTypeMapper.insert(postitonType);
			if (state == 1) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public boolean postitonTypeDrop(Integer id) {
		int state = postitonTypeMapper.deleteByPrimaryKey(id);
		if (state == 1) {
			return true;
		}
		return false;
	}

	public List<PositionName> positionNameAll() {
		List<PositionName> list = positionNameMapper.selectByExample(null);
		return list;
	}

	public boolean positionNameAdd(PositionName positionName) {
		PositionNameExample example = new PositionNameExample();
		net.zgysrc.www.bean.PositionNameExample.Criteria criteria = example.createCriteria();
		criteria.andPositionNameEqualTo(positionName.getPositionName());
		List<PositionName> list = positionNameMapper.selectByExample(example);
		if (list.size() == 0) {
			int state = positionNameMapper.insert(positionName);
			if (state == 1) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public boolean positionNameDrop(Integer id) {
		int state = positionNameMapper.deleteByPrimaryKey(id);
		if (state == 1) {
			return true;
		}
		return false;
	}

	public List<HatProvince> getAllprovince() {
		List<HatProvince> list = hatProvinceMapper.selectByExample(null);
		if(list.size() == 0){
			return null;
		}else{
			return list;
		}
	}

	public List<HatCity> getCity(String id) {
		HatCityExample example = new HatCityExample();
		net.zgysrc.www.bean.HatCityExample.Criteria criteria = example.createCriteria();
		criteria.andFatherEqualTo(id);
		List<HatCity> list = hatCityMapper.selectByExample(example);
		if(list.size() == 0){
			return null;
		}else{
			return list;
		}
	}

	public List<HatArea> getArea(String id) {
		HatAreaExample example = new HatAreaExample();
		net.zgysrc.www.bean.HatAreaExample.Criteria criteria = example.createCriteria();
		criteria.andFatherEqualTo(id);
		List<HatArea> list = hatAreaMapper.selectByExample(example);
		if(list.size() == 0){
			return null;
		}else{
			return list;
		}
	}

	public List<PostitonType> postitonTypeOnindustry(Integer id) {
		PostitonTypeExample example = new PostitonTypeExample();
		net.zgysrc.www.bean.PostitonTypeExample.Criteria criteria = example.createCriteria();
		criteria.andFatherIdEqualTo(id);
		List<PostitonType> list = postitonTypeMapper.selectByExample(example);
		if(list.size() == 0){
			return null;
		}else{
			return list;
		}
	}

	public List<CompanyInfo> getHotCompany() {
		CompanyInfoExample example = new CompanyInfoExample();
		net.zgysrc.www.bean.CompanyInfoExample.Criteria criteria = example.createCriteria();
		criteria.andHotOrNotEqualTo("hot");
		List<CompanyInfo> list = companyInfoMapper.selectByExample(example);
		if(list.size() == 0){
			return null;
		}else{
			return list;
		}
	}

	public List<PositionName> getHotPostName() {
		PositionNameExample example = new PositionNameExample();
		net.zgysrc.www.bean.PositionNameExample.Criteria criteria = example.createCriteria();
		criteria.andHotOrNotEqualTo("hot");
		List<PositionName> list = positionNameMapper.selectByExample(example);
		if(list.size() == 0){
			return null;
		}else{
			return list;
		}
	}

	public List<CarouselPic> carouselPic() {
		CarouselPicExample example = new CarouselPicExample();
		net.zgysrc.www.bean.CarouselPicExample.Criteria criteria = example.createCriteria();
		criteria.andTypesEqualTo("1");
		List<CarouselPic> list = carouselPicMapper.selectByExample(example);
		if(list.size() == 0){
			return null;
		}else{
			return list;
		}
	}

	public List<CarouselPic> carouselPicScl() {
		CarouselPicExample example = new CarouselPicExample();
		net.zgysrc.www.bean.CarouselPicExample.Criteria criteria = example.createCriteria();
		criteria.andTypesEqualTo("2");
		List<CarouselPic> list = carouselPicMapper.selectByExample(example);
		if(list.size() == 0){
			return null;
		}else{
			return list;
		}
	}

	public void addPost(PostRelease post) {
		postReleaseMapper.insert(post);
	}

	public List<CompanyTypes> getCompanyTypes() {
		List<CompanyTypes> list = companyTypesMapper.selectByExample(null);
		if(list.size() == 0){
			return null;
		}else{
			return list;
		}
	}
}
