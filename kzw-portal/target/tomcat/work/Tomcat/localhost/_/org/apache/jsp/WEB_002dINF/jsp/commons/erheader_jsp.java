/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-05-15 04:03:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.commons;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class erheader_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\t<div class=\"w\" id=\"header-2013\">\r\n");
      out.write("\t\t<div id=\"logo-2013\" class=\"ld\">\r\n");
      out.write("\t\t\t<a href=\"/\" hidefocus=\"true\" clstag=\"homepage|keycount|home2013|02a\"><b></b><img\r\n");
      out.write("\t\t\t\tsrc=\"/images/taotao-logo.gif\" width=\"270\" height=\"60\" alt=\"开张网\"></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--logo end-->\r\n");
      out.write("\t\t<div id=\"search-2013\">\r\n");
      out.write("\t\t\t<div class=\"i-search ld\">\r\n");
      out.write("\t\t\t\t<ul id=\"shelper\" class=\"hide\">\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<div class=\"form\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"text\" accesskey=\"s\" id=\"key\"\r\n");
      out.write("\t\t\t\t\t\tautocomplete=\"off\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" value=\"搜索\" class=\"button\"\r\n");
      out.write("\t\t\t\t\t\tonclick=\"search();return false;\"\r\n");
      out.write("\t\t\t\t\t\tclstag=\"homepage|keycount|home2013|03a\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"settleup-2013\" clstag=\"homepage|keycount|home2013|05a\">\r\n");
      out.write("\t\t\t<dl>\r\n");
      out.write("\t\t\t\t<dt class=\"ld\">\r\n");
      out.write("\t\t\t\t\t<s></s><span class=\"shopping\"><span id=\"shopping-amount\"></span></span><a\r\n");
      out.write("\t\t\t\t\t\thref=\"/cart/cart.html\" target=\"_Blank\" id=\"settleup-url\">我的购物车</a>\r\n");
      out.write("\t\t\t\t\t<b></b>\r\n");
      out.write("\t\t\t\t</dt>\r\n");
      out.write("\t\t\t</dl>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--settleup end-->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--header end-->\r\n");
      out.write("\t<div class=\"w\">\r\n");
      out.write("\t\t<div id=\"nav-2013\">\r\n");
      out.write("\t\t\t<div id=\"categorys-2013\" class=\"categorys-2014\">\r\n");
      out.write("\t\t\t\t<div class=\"mt ld\">\r\n");
      out.write("\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t<a clstag=\"homepage|keycount|home2013|06a\">全部商品分类<b></b></a>\r\n");
      out.write("\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"_JD_ALLSORT\" class=\"mc\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"extra\">\r\n");
      out.write("\t\t\t\t\t\t<a {if=\"\"\r\n");
      out.write("\t\t\t\t\t\t\tpageconfig.ishome}clstag=\"homepage|keycount|home2013|0614a\"\r\n");
      out.write("\t\t\t\t\t\t\t{=\"\" if}=\"\">全部商品分类</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"treasure\" clstag=\"homepage|keycount|home2013|08a\"></div>\r\n");
      out.write("\t\t\t<ul id=\"navitems-2013\">\r\n");
      out.write("\t\t\t\t<li class=\"fore1\" id=\"nav-home\"\r\n");
      out.write("\t\t\t\t\tclstag=\"homepage|keycount|home2013|07a\"><a href=\"/\">首页</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"fore2\" id=\"nav-fashion\"\r\n");
      out.write("\t\t\t\t\tclstag=\"homepage|keycount|home2013|07b\"><a\r\n");
      out.write("\t\t\t\t\thref=\"http://localhost:8080/store/shop.html\">校园小店</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"fore3\" id=\"nav-chaoshi\"\r\n");
      out.write("\t\t\t\t\tclstag=\"homepage|keycount|home2013|07c\"><a\r\n");
      out.write("\t\t\t\t\thref=\"http://localhost:8080/secondItem/SecondItemList.html\">校园二手</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
