/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-05-14 15:05:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class store_002dorder_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<table class=\"easyui-datagrid\" id=\"itemList\" title=\"店铺订单配送\" \r\n");
      out.write("       data-options=\"singleSelect:false,collapsible:true,pagination:true,url:'/store/order',method:'get',pageSize:30,toolbar:toolbar\">\r\n");
      out.write("    <thead>\r\n");
      out.write("        <tr>\r\n");
      out.write("        \t<th data-options=\"field:'ck',checkbox:true\"></th>\r\n");
      out.write("        \t<th data-options=\"field:'order_id',width:60\">订单编号</th>\r\n");
      out.write("            <th data-options=\"field:'title',width:120\">商品标题</th>\r\n");
      out.write("            <th data-options=\"field:'num',width:70\">购买数量</th>\r\n");
      out.write("            <th data-options=\"field:'price',width:70,align:'right',formatter:TAOTAO.formatPrice\">单价</th>\r\n");
      out.write("            <th data-options=\"field:'total_fee',width:70,align:'right',formatter:TAOTAO.formatPrice\">总价</th>\r\n");
      out.write("            <th data-options=\"field:'status',width:100,align:'center',formatter:TAOTAO.formatStoreOrder\">订单状态</th>\r\n");
      out.write("            <th data-options=\"field:'username',width:120,align:'center'\">买家名称</th>\r\n");
      out.write("            <th data-options=\"field:'address',width:140,align:'center'\">买家地址</th>\r\n");
      out.write("            <th data-options=\"field:'phone',width:100,align:'center'\">买家电话</th>\r\n");
      out.write("            <th data-options=\"field:'email',width:100,align:'center'\">买家邮箱</th>\r\n");
      out.write("            <th data-options=\"field:'payment_type',width:100,align:'center',formatter:TAOTAO.formatPayType\">支付类型</th>\r\n");
      out.write("            <th data-options=\"field:'create_time',width:130,align:'center',formatter:TAOTAO.formatDateTime\">创建时间</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\tvar flage = false;\r\n");
      out.write("\r\n");
      out.write("    function getSelectionsIds(){\r\n");
      out.write("    \tvar itemList = $(\"#itemList\");\r\n");
      out.write("    \tvar sels = itemList.datagrid(\"getSelections\");\r\n");
      out.write("    \tvar ids = [];\r\n");
      out.write("    \tfor(var i in sels){\r\n");
      out.write("    \t\tids.push(sels[i].order_id);\r\n");
      out.write("    \t\tif(sels[i].status != 1) {\r\n");
      out.write("    \t\t\tflage = true;\r\n");
      out.write("    \t\t}\r\n");
      out.write("    \t}\r\n");
      out.write("    \tids = ids.join(\",\");\r\n");
      out.write("    \treturn ids;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    var toolbar = [{\r\n");
      out.write("        text:'发货',\r\n");
      out.write("        iconCls:'icon-edit',\r\n");
      out.write("        handler:function(){\r\n");
      out.write("        \tvar ids = getSelectionsIds();\r\n");
      out.write("        \tif(ids.length == 0){\r\n");
      out.write("        \t\t$.messager.alert('提示','未选中商品!');\r\n");
      out.write("        \t\treturn ;\r\n");
      out.write("        \t}\r\n");
      out.write("        \tif(flage) {\r\n");
      out.write("        \t\tflage = false;\r\n");
      out.write("        \t\t$.messager.alert('提示','选中的商品中已有发货的!');\r\n");
      out.write("        \t\treturn ;\r\n");
      out.write("        \t}\r\n");
      out.write("        \t$.messager.confirm('确认','确定发货ID为 '+ids+' 的商品吗？',function(r){\r\n");
      out.write("        \t    if (r){\r\n");
      out.write("        \t    \tvar params = {\"ids\":ids};\r\n");
      out.write("                \t$.post(\"/store/delivery\",params, function(data){\r\n");
      out.write("            \t\t\tif(data.status == 200){\r\n");
      out.write("            \t\t\t\t$.messager.alert('提示','商品发货成功!',undefined,function(){\r\n");
      out.write("            \t\t\t\t\t$(\"#itemList\").datagrid(\"reload\");\r\n");
      out.write("            \t\t\t\t});\r\n");
      out.write("            \t\t\t}\r\n");
      out.write("            \t\t});\r\n");
      out.write("        \t    }\r\n");
      out.write("        \t});\r\n");
      out.write("        }\r\n");
      out.write("    }];\r\n");
      out.write("    \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
