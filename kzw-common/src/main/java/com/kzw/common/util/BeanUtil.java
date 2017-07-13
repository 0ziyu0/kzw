package com.kzw.common.util;

import java.beans.PropertyDescriptor;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.PropertyUtilsBean;
import org.apache.commons.lang3.StringUtils;


public class BeanUtil {

	public static Map<String, String> beanToMap(Object obj) { 
        Map<String, String> params = new HashMap<String, String>(0); 
        try { 
            PropertyUtilsBean propertyUtilsBean = new PropertyUtilsBean(); 
            PropertyDescriptor[] descriptors = propertyUtilsBean.getPropertyDescriptors(obj); 
            for (int i = 0; i < descriptors.length; i++) { 
                String name = descriptors[i].getName(); 
                if (!"class".equals(name) && StringUtils.isNoneBlank(name)) {
                	try{
                		params.put(name, propertyUtilsBean.getNestedProperty(obj, name).toString()); 
                	} catch(Exception e) {
                		
                	}
                    
                } 
            } 
        } catch (Exception e) { 
            e.printStackTrace(); 
        } 
        return params; 
	}
}
