package net.zgysrc.www.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.zgysrc.www.bean.ArtCarousel;
import net.zgysrc.www.bean.ArtCarouselExample;
import net.zgysrc.www.bean.ArtComment;
import net.zgysrc.www.bean.ArtCommentExample;
import net.zgysrc.www.bean.ArtGallery;
import net.zgysrc.www.bean.ArtGalleryExample;
import net.zgysrc.www.bean.ArtGalleryExample.Criteria;
import net.zgysrc.www.bean.ArtPicClassify;
import net.zgysrc.www.bean.ArtPicInfo;
import net.zgysrc.www.bean.ArtPicInfoExample;
import net.zgysrc.www.bean.PicType;
import net.zgysrc.www.dao.ArtCarouselMapper;
import net.zgysrc.www.dao.ArtCommentMapper;
import net.zgysrc.www.dao.ArtGalleryMapper;
import net.zgysrc.www.dao.ArtPicClassifyMapper;
import net.zgysrc.www.dao.ArtPicInfoMapper;
import net.zgysrc.www.dao.PicTypeMapper;
import net.zgysrc.www.utils.UtilStringBufferToString;

@Service
@Transactional
public class ArtGalleryService {

	@Autowired
	private ArtGalleryMapper artGalleryMapper;
	@Autowired
	private ArtPicInfoMapper artPicInfoMapper;
	@Autowired
	private ArtCommentMapper artCommentMapper;
	@Autowired
	private ArtPicClassifyMapper artPicClassifyMapper;
	@Autowired
	private ArtCarouselMapper artCarouselMapper;
	@Autowired
	private PicTypeMapper picTypeMapper;

	public List<ArtGallery> getAllArtGallery() {
		List<ArtGallery> list = artGalleryMapper.selectByExample(null);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public ArtGallery addArtGallery(ArtGallery artGallery) {
		ArtGalleryExample example = new ArtGalleryExample();
		Criteria criteria = example.createCriteria();
		criteria.andArtGalleryNameEqualTo(artGallery.getArtGalleryName());
		criteria.andStudioNameEqualTo(artGallery.getStudioName());
		long a = artGalleryMapper.countByExample(example);
		if (a == 1) {
			return null;
		} else {
			int state = artGalleryMapper.insert(artGallery);
			if (state == 1) {
				criteria.andArtGalleryNameEqualTo(artGallery.getArtGalleryName());
				criteria.andStudioNameEqualTo(artGallery.getStudioName());
				List<ArtGallery> list = artGalleryMapper.selectByExample(example);
				if (list.size() == 0) {
					return null;
				} else {
					return list.get(0);
				}
			} else {
				return null;
			}
		}
	}

	public ArtGallery getArtGalleryById(Integer id) {
		ArtGallery artGallery = artGalleryMapper.selectByPrimaryKey(id);
		if (artGallery == null) {
			return null;
		} else {
			return artGallery;
		}
	}

	public ArtPicInfo addArtImgInfo(ArtPicInfo artImgInfo) {
		int state = artPicInfoMapper.insert(artImgInfo);
		if (state == 0) {
			return null;
		} else {
			ArtPicInfoExample example = new ArtPicInfoExample();
			net.zgysrc.www.bean.ArtPicInfoExample.Criteria criteria = example.createCriteria();
			criteria.andPicNameEqualTo(artImgInfo.getPicName());
			criteria.andPicUploadTimeEqualTo(artImgInfo.getPicUploadTime());
			List<ArtPicInfo> list = artPicInfoMapper.selectByExample(example);
			if (list.size() == 0) {
				return null;
			} else {
				return list.get(0);
			}
		}

	}

	public List<ArtPicInfo> getAllArtImgInfoByFatherId(Integer id) {
		ArtPicInfoExample example = new ArtPicInfoExample();
		net.zgysrc.www.bean.ArtPicInfoExample.Criteria criteria = example.createCriteria();
		criteria.andFatherIdEqualTo(id);
		List<ArtPicInfo> list = artPicInfoMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public ArtPicInfo getArtImgInfoById(Integer id) {
		ArtPicInfo artImgInfo = artPicInfoMapper.selectByPrimaryKey(id);
		if (artImgInfo == null) {
			return null;
		} else {
			return artImgInfo;
		}
	}

	public ArtGallery updateArtGalleryById(ArtGallery artGallery) {
		int state = artGalleryMapper.updateByPrimaryKeySelective(artGallery);
		if (state == 0) {
			return null;
		} else {
			ArtGallery artGallery2 = artGalleryMapper.selectByPrimaryKey(artGallery.getId());
			if (artGallery2 == null) {
				return null;
			} else {
				return artGallery2;
			}
		}
	}

	public ArtPicInfo updateArtImgInfo(ArtPicInfo artImgInfo) {
		int state = artPicInfoMapper.updateByPrimaryKeySelective(artImgInfo);
		if (state == 0) {
			return null;
		} else {
			ArtPicInfo artImgInfo2 = artPicInfoMapper.selectByPrimaryKey(artImgInfo.getId());
			if (artImgInfo2 == null) {
				return null;
			} else {
				return artImgInfo2;
			}
		}
	}

	public boolean addCommentInfo(ArtComment artComment) {
		int state = artCommentMapper.insert(artComment);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

	public List<ArtComment> getAllCommentInfo(Integer id) {
		ArtCommentExample example = new ArtCommentExample();
		net.zgysrc.www.bean.ArtCommentExample.Criteria criteria = example.createCriteria();
		example.setOrderByClause("create_time desc");
		criteria.andFatherIdEqualTo(id);
		List<ArtComment> list = artCommentMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public boolean deleteArtImgInfo(Integer id) {
		int state = artPicInfoMapper.deleteByPrimaryKey(id);
		if (state == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean deleteArtGallery(Integer id) {
		ArtPicInfoExample example = new ArtPicInfoExample();
		net.zgysrc.www.bean.ArtPicInfoExample.Criteria criteria = example.createCriteria();
		criteria.andFatherIdEqualTo(id);
		List<ArtPicInfo> list = artPicInfoMapper.selectByExample(example);
		if (list.size() == 0) {
			int state = artGalleryMapper.deleteByPrimaryKey(id);
			if (state == 0) {
				return false;
			} else {
				return true;
			}
		} else {
			for (ArtPicInfo artImgInfo : list) {
				artPicInfoMapper.deleteByPrimaryKey(artImgInfo.getId());
			}
			int state = artGalleryMapper.deleteByPrimaryKey(id);
			if (state == 0) {
				return false;
			} else {
				return true;
			}
		}
	}

	public List<ArtGallery> getTopArtGallery() {
		ArtGalleryExample example = new ArtGalleryExample();
		Criteria criteria = example.createCriteria();
		criteria.andIndexInfoEqualTo("1");
		List<ArtGallery> list = artGalleryMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public List<ArtGallery> getTopTwoArtGallery() {
		ArtGalleryExample example = new ArtGalleryExample();
		Criteria criteria = example.createCriteria();
		criteria.andIndexInfoEqualTo("2");
		List<ArtGallery> list = artGalleryMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public boolean deleteCommentInfo(Integer id) {
		int state = artCommentMapper.deleteByPrimaryKey(id);
		if (state == 0) {
			return false;
		} else {
			return true;
		}

	}

	public List<ArtPicInfo> artRankingList() {
		ArtPicInfoExample example = new ArtPicInfoExample();
		example.setOrderByClause("pic_click_num desc");
		List<ArtPicInfo> list = artPicInfoMapper.selectByExample(example);
		List<ArtPicInfo> lists = new ArrayList<ArtPicInfo>();
		if (list.size() == 0) {
			return null;
		} else {
			for (int i = 0; i < list.size(); i++) {
				if (i == 9) {
					break;
				}
				lists.add(list.get(i));
			}
		}
		return lists;
	}

	public Integer getCommentSize(Integer id) {
		ArtCommentExample example = new ArtCommentExample();
		net.zgysrc.www.bean.ArtCommentExample.Criteria criteria = example.createCriteria();
		criteria.andFatherIdEqualTo(id);
		List<ArtComment> list = artCommentMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list.size();
		}
	}

	public Integer getArtPicLikeSize(Integer id) {
		ArtPicInfo artPicInfo = artPicInfoMapper.selectByPrimaryKey(id);
		Integer size = artPicInfo.getPicLikeNum();
		return size;
	}

	public List<Map<String, Object>> getTenList() {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		ArtPicInfoExample example = new ArtPicInfoExample();
		example.setOrderByClause("pic_click_num desc");
		List<ArtPicInfo> lists = artPicInfoMapper.selectByExample(example);
		if (lists.size() == 0) {
			return null;
		}
		for (int i = 0; i < lists.size(); i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			if (i == 9) {
				break;
			}
			map.put("id", lists.get(i).getId());
			map.put("picName", lists.get(i).getPicName());
			list.add(map);
		}
		return list;
	}

	public List<ArtGallery> getAllArtGalleryListAdmin(String artGalleryName) {
		ArtGalleryExample example = new ArtGalleryExample();
		example.setOrderByClause("id desc");
		Criteria criteria = example.createCriteria();
		criteria.andArtGalleryNameLike(UtilStringBufferToString.stringBufferToString(artGalleryName));
		List<ArtGallery> list = artGalleryMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public List<ArtPicInfo> getAllArtImgInfoListAdmin(Integer id, String picName) {
		ArtPicInfoExample example = new ArtPicInfoExample();
		example.setOrderByClause("id desc");
		net.zgysrc.www.bean.ArtPicInfoExample.Criteria criteria = example.createCriteria();
		criteria.andFatherIdEqualTo(id);
		criteria.andPicNameLike(UtilStringBufferToString.stringBufferToString(picName));
		List<ArtPicInfo> list = artPicInfoMapper.selectByExample(example);
		if (list.size() == 0) {
			return null;
		} else {
			return list;
		}
	}

	public List<ArtPicClassify> getArtPicClassify() {
		List<ArtPicClassify> list = artPicClassifyMapper.selectByExample(null);
		if (0 == list.size()) {
			return null;
		} else {
			return list;
		}
	}

	public List<ArtCarousel> getArtCarouselImg(Integer type) {
		ArtCarouselExample example = new ArtCarouselExample();
		net.zgysrc.www.bean.ArtCarouselExample.Criteria criteria = example.createCriteria();
		criteria.andArtCarouselTypeEqualTo(type);
		List<ArtCarousel> list = artCarouselMapper.selectByExample(example);
		if (0 == list.size()) {
			return null;
		} else {
			return list;
		}
	}

	public boolean addArtCarouselImg(ArtCarousel artCarousel) {
		int state = artCarouselMapper.insert(artCarousel);
		if (0 == state) {
			return false;
		} else {
			return true;
		}
	}

	public List<PicType> getArtPicType() {
		List<PicType> list = picTypeMapper.selectByExample(null);
		if (0 == list.size()) {
			return null;
		} else {
			return list;
		}
	}

	public List<ArtGallery> getArtGalleryListByClassify(String picClassify) {
		ArtGalleryExample example = new ArtGalleryExample();
		example.setOrderByClause("id desc");
		Criteria criteria = example.createCriteria();
		criteria.andPicClassifyEqualTo(picClassify);
		List<ArtGallery> list = artGalleryMapper.selectByExample(example);
		if (0 == list.size()) {
			return null;
		} else {
			if (list.size() < 8) {
				return list;
			} else {
				List<ArtGallery> list2 = new ArrayList<ArtGallery>();
				for (int i = 0; i < 8; i++) {
					list2.add(list.get(i));
				}
				return list2;
			}
		}
	}

	public List<ArtGallery> getArtGalleryListByCondition(String artSell, String picClassify, String picTypeAnother) {
		ArtGalleryExample example = new ArtGalleryExample();
		example.setOrderByClause("id desc");
		Criteria criteria = example.createCriteria();
		criteria.andPicClassifyLike(UtilStringBufferToString.stringBufferToString(picClassify));
		criteria.andArtSellLike(UtilStringBufferToString.stringBufferToString(artSell));
		criteria.andPicTypeAnotherLike(UtilStringBufferToString.stringBufferToString(picTypeAnother));
		List<ArtGallery> list = artGalleryMapper.selectByExample(example);
		if (0 == list.size()) {
			return null;
		} else {
			return list;
		}
	}

	public List<ArtGallery> getArtGalleryListByRecommend() {
		ArtGalleryExample example = new ArtGalleryExample();
		example.setOrderByClause("id desc");
		Criteria criteria = example.createCriteria();
		criteria.andIndexInfoEqualTo("1");
		List<ArtGallery> list = artGalleryMapper.selectByExample(example);
		return list;

	}

}
