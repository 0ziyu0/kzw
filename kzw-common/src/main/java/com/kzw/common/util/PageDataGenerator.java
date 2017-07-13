package com.kzw.common.util;

import java.util.Enumeration;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;

public class PageDataGenerator {

	/**
     * 生成PageData对象
     * @param request
     * @param t 实体类
     * @param isPage 是否分页
     * @return
     */
    public static PageData newInstall(HttpServletRequest request, Class<?> t, boolean isPage) {
        PageData pageData = new PageData();
        initParama(pageData, request, t, isPage);
//        initOrder(pageData, request, t);
        return pageData;
    }

    /**
     * 初始化排序信息
     * @param pageData
     * @param request
     * @param t
     */
    /*private static void initOrder(PageData pageData, HttpServletRequest request, Class<?> t) {
        String sort = request.getParameter("sort");
        String order = request.getParameter("order");
        if (StringUtils.isNotBlank(sort)) {
            Method m;
            try {
                m = ClassUtils.getGetter(t.newInstance(), sort);
                if (m == null) {
                    m = ClassUtils.getGetter(t.getSuperclass(), sort);
                }
                if (m != null) {
                    Column column = m.getDeclaredAnnotation(Column.class);
                    if (column != null && StringUtils.isNotEmpty(column.name())) {
                        pageData.setOrderBy(column.name() + " " + order);
                    } else {
                        pageData.setOrderBy(sort + " " + order);
                    }
                }
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }*/
    /**
     * 初始化参数信息
     * @param pageData
     * @param request
     * @param t
     * @param isPage
     */
    private static void initParama(PageData pageData, HttpServletRequest request, Class<?> t,
            boolean isPage) {
        Map<String, Object> params = pageData.getParams();

        Enumeration<String> names = request.getParameterNames();
        while (names.hasMoreElements()) {
            String name = names.nextElement();
            String value = request.getParameter(name);
            if (StringUtils.isNotEmpty(value)) {
                params.put(name, value);
            }
        }
        Object _page = params.remove("page");
        Object _rows = params.remove("rows");
        if (_page != null && _page instanceof String) {
            pageData.setPageNum(Integer.parseInt((String) _page));
        } else if (_page != null && _page instanceof Integer) {
            pageData.setPageNum((Integer) _page);
        }
        if (_rows != null && _rows instanceof String) {
            pageData.setPageSize(Integer.parseInt((String) _rows));
        } else if (_rows != null && _rows instanceof Integer) {
            pageData.setPageSize((Integer) _rows);
        }
        pageData.setPage(isPage);
    }
    
}
