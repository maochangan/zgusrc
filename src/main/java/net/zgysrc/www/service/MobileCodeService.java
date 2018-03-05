package net.zgysrc.www.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.zgysrc.www.bean.MobileCode;
import net.zgysrc.www.bean.MobileCodeExample;
import net.zgysrc.www.bean.MobileCodeExample.Criteria;
import net.zgysrc.www.dao.MobileCodeMapper;

/**
 * 手机验证码存放
 * @author Administrator
 *
 */

@Service
@Transactional
public class MobileCodeService {
	
	
	@Autowired
	private MobileCodeMapper mobileCodeMapper;

	public boolean insertInto(String cTelephoneNumber, StringBuffer code) {
		MobileCodeExample example = new MobileCodeExample();
		Criteria criteria = example.createCriteria();
		criteria.andMobileEqualTo(cTelephoneNumber);
		List<MobileCode> list = mobileCodeMapper.selectByExample(example);
		if(list.size() == 0){
			MobileCode m = new MobileCode();
			m.setMobile(cTelephoneNumber);
			m.setMobileCode(code.toString());
			mobileCodeMapper.insert(m);
			return true;
		}else{
			MobileCode m = list.get(0);
			m.setMobileCode(code.toString());
			mobileCodeMapper.updateByPrimaryKey(m);
			return true;
		}
		
	}

	public String findMobile(String cTelephoneNumber) {
		MobileCodeExample example = new MobileCodeExample();
		Criteria criteria = example.createCriteria();
		criteria.andMobileEqualTo(cTelephoneNumber);
		List<MobileCode> list = mobileCodeMapper.selectByExample(example);
		if(list.size() == 0){
			return null;
		}else{
			String code = list.get(0).getMobileCode();
			return code;
		}
	}


}
