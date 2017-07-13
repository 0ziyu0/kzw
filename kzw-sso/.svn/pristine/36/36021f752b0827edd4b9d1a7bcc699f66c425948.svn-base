package com.kzw.sso.service;

import com.kzw.common.pojo.KZWResult;
import com.kzw.pojo.TbUser;

public interface RegisterService {

	/**
	 * 校验数据接口
	 * @param param 1、2、3分别代表对username、phone、email进行检查
	 * @param type  1、2、3分别代表对username、phone、email进行检查
	 * @return
	 */
	KZWResult checkData(String param, Integer type);
	
	/**
	 * 用户注册接口
	 * @param user
	 * @return
	 */
	KZWResult register(TbUser user);
	
}
