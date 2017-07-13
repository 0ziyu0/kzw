package com.kzw.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	public Date  NowTime(String format){
		SimpleDateFormat df = new SimpleDateFormat(format);//设置日期格式
		 Date date =null;
		try {
			date = df.parse(df.format(new Date()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		return date;// new Date()为获取当前系统时间
	}

	public static  Date  YYMM(Date date,String format){
		SimpleDateFormat df = new SimpleDateFormat(format);//设置日期格式
		try {
			date = df.parse(df.format(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		return date;// new Date()为获取当前系统时间
	}
	
}
