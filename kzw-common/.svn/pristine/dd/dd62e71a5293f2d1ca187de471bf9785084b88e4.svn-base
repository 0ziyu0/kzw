package com.kzw.common.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataUtil {

	public static Date getDateByString(String str) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = null;
		
		try {
            date = (Date) simpleDateFormat.parse(str);//将这个字符型的时间转换成Date型的时间
        } catch (Exception e) {
        	e.printStackTrace();
//        	throw new RuntimeException();
        	return null;
        }
		return date;
	}
	
	/**
	 * 得到当前星期
	 * @param dt
	 * @return
	 */
	public static String getWeekOfDate() {
		Date dt = new Date();
        String[] weekDays = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        Calendar cal = Calendar.getInstance();
        cal.setTime(dt);
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0)
            w = 0;
        return weekDays[w];
    }
	
	public static Integer getCurrentHour() {
		
		long l = System.currentTimeMillis();
		Date date = new Date(l);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String now=dateFormat.format(date);
		
		String substring = now.substring(11, 13);
		return Integer.parseInt(substring);
	}
}
