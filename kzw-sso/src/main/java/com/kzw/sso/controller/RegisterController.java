package com.kzw.sso.controller;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kzw.common.pojo.KZWResult;
import com.kzw.common.util.ExceptionUtil;
import com.kzw.pojo.TbUser;
import com.kzw.sso.service.RegisterService;

@Controller
@RequestMapping("/user")
public class RegisterController {

	@Resource
	private RegisterService registerService;
	
	@RequestMapping("/check")
	@ResponseBody
	public Object checkData(String param, Integer type, String callback) {
		
		try {
			KZWResult result = registerService.checkData(param, type);
			if(StringUtils.isNotBlank(callback)) {
				// 需要支持jsonp调用
				MappingJacksonValue jsonp = new MappingJacksonValue(result);
				jsonp.setJsonpFunction(callback);
				return jsonp;
			}
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return KZWResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	@ResponseBody
	public KZWResult register(TbUser user) {
		
		try {
			return registerService.register(user);
		} catch (Exception e) {
			e.printStackTrace();
			return KZWResult.build(500, ExceptionUtil.getStackTrace(e));
		}
		
	} 
	 
	
}


























