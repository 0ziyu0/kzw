package com.kzw.common.util;

import java.util.Map;

public class testss {

	public static void main(String[] args) {
		fff s = new fff();
		s.setId(78L);
		s.setStoreDesc("刘文君");
		s.setStoreName("不撒法");;
		s.setStoreOther("sf");
		
		Map<String, String> ssss = BeanUtil.beanToMap(s);
		System.out.println(ssss);
		
		String doPost = HttpClientUtil.doPost("http://localhost:8081/rest/store/register", ssss);
		
		System.out.println(doPost);
	}
	
}

