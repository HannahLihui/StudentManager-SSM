/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.8.v20150217
 * Generated at: 2018-11-29 01:27:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>首页</title>\r\n");
      out.write("<link href=\"http://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write(" <script src=\"js/jquery/2.0.0/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"http://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("<link href=\"menu/main_nav.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      out.write("<div class=\"navbar navbar-duomi navbar-static-top\" role=\"navigation\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("     <div class=\"navbar-header\">\r\n");
      out.write("       <a class=\"navbar-brand\" href=\"/Admin/index.html\" id=\"logo\">学籍管理系统</a>\r\n");
      out.write("     </div>\r\n");
      out.write("  </div>\r\n");
      out.write(" </div>\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("       <div class=\"row\">\r\n");
      out.write("         <div class=\"col-md-2\">\r\n");
      out.write("         <ul id=\"main-nav\" class=\"nav nav-tabs nav-stacked\" style=\"\">\r\n");
      out.write("             <li class=\"active\">\r\n");
      out.write("               <a href=\"#\">\r\n");
      out.write("                <i class=\"glyphicon glyphicon-th-large\"></i>\r\n");
      out.write("                              首页 \r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("             <li id=\"ul_menu\">\r\n");
      out.write("              <a href=\"#systemSetting\" class=\"nav-header collapsed\" data-toggle=\"collapse\">\r\n");
      out.write("               <i class=\"glyphicon glyphicon-cog\"></i>\r\n");
      out.write("         学籍信息管理\r\n");
      out.write("                <span class=\"pull-right glyphicon glyphicon-chevron-down\"></span>\r\n");
      out.write("             </a>\r\n");
      out.write("          <ul id=\"systemSetting\" class=\"nav nav-list collapse secondmenu\" style=\"height: 0px;\">\r\n");
      out.write("            <li><a href=\"/listStudentInfo\"><i class=\"glyphicon glyphicon-user\"></i>学籍列表显示和添加</a></li>\r\n");
      out.write("            <li><a href=\"search.jsp\"><i class=\"glyphicon glyphicon-th-list\"></i>学生信息查询</a></li>\r\n");
      out.write("            <li><a href=\"/printStudentInfo\"><i class=\"glyphicon glyphicon-th-list\"></i>打印学生信息</a></li>\r\n");
      out.write("            <li><a href=\"/groupStat\"><i class=\"glyphicon glyphicon-asterisk\"></i>统计学生页面</a></li>\r\n");
      out.write("             <li><a href=\"/exportExcel\"><i class=\"glyphicon glyphicon-edit\"></i>导出excel</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li id=\"ul_menu\">\r\n");
      out.write("             <a href=\"#systemSetting1\" class=\"nav-header collapsed\" data-toggle=\"collapse\">\r\n");
      out.write("             <i class=\"glyphicon glyphicon-cog\" ></i>班级信息管理\r\n");
      out.write("              <span class=\"pull-right glyphicon glyphicon-chevron-down\"></span></a>\r\n");
      out.write("               <ul id=\"systemSetting1\" class=\"nav nav-list collapse secondmenu\" style=\"height: 0px;\">\r\n");
      out.write("            <li><a href=\"#\"><i class=\"glyphicon glyphicon-user\"></i>班级信息显示</a></li>\r\n");
      out.write("            <li><a href=\"#\"><i class=\"glyphicon glyphicon-th-list\"></i>查询班级</a></li>\r\n");
      out.write("            <li><a href=\"#\"><i class=\"glyphicon glyphicon-asterisk\"></i>导出班级名单</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("              \r\n");
      out.write("         </li>\r\n");
      out.write("         <li id=\"ul_menu\">\r\n");
      out.write("             <a href=\"#systemSetting2\" class=\"nav-header collapsed\" data-toggle=\"collapse\">\r\n");
      out.write("             <i class=\"glyphicon glyphicon-globe\"></i>课程管理模块<span class=\"label label-warning pull-right\">5</span></a>\r\n");
      out.write("               <ul id=\"systemSetting2\" class=\"nav nav-list collapse secondmenu\" style=\"height: 0px;\">\r\n");
      out.write("            <li><a href=\"#\"><i class=\"glyphicon glyphicon-user\"></i>课程信息显示</a></li>\r\n");
      out.write("            <li><a href=\"#\"><i class=\"glyphicon glyphicon-th-list\"></i>查询课程</a></li>\r\n");
      out.write("            <li><a href=\"#\"><i class=\"glyphicon glyphicon-asterisk\"></i>导打印学生成绩</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li >\r\n");
      out.write("         <li id=\"ul_menu\">\r\n");
      out.write("             <a href=\"./charts.html\"><i class=\"glyphicon glyphicon-calendar\"></i>修改密码</a></li>\r\n");
      out.write("        <li>\r\n");
      out.write("              <a href=\"#\"><i class=\"glyphicon glyphicon-fire\"></i>关于系统</a>\r\n");
      out.write("        </li>\r\n");
      out.write("     </ul>\r\n");
      out.write("</div>\r\n");
      out.write("     <div class=\"col-md-10\">\r\n");
      out.write("主窗口\r\n");
      out.write("     </div>\r\n");
      out.write("</div>\r\n");
      out.write("</div> \r\n");
      out.write("</body>\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction initPage(){\r\n");
      out.write("\t\t$.post(\"menu/menu.jsp\",function(data){\r\n");
      out.write("\t\talert(data);\r\n");
      out.write("\t\tvar html=\"\";\r\n");
      out.write("\t\tvar json=eval(\"(\"+data+\")\");\r\n");
      out.write("\t\tvar list=json.aaData;\r\n");
      out.write("\t\t//alert(list.length);\r\n");
      out.write("\t\tfor(var i=0;i<list.length;i++){\r\n");
      out.write("\t\t\tvar menuName=list[i][1];\r\n");
      out.write("\t\t\tvar href=list[i][3]+list[i][2];\r\n");
      out.write("       html=html+\"\t<li >\";\r\n");
      out.write("       html=html+\"<a  href=\\\"\"+href+\"\\\"><i class=\\\"icon_house_alt\\\"></i>\"\r\n");
      out.write("       html=html+\"                       <span>\"+menuName+\"</span>\"\r\n");
      out.write("       html=html+\"              </a>\"\r\n");
      out.write("       html=html+\"     </li>\"\r\n");
      out.write("\t\t\t//html=html+\"\t<ul>\";\r\n");
      out.write("\t\t\t//html=html+\"\t\t<li><h1><a href=\\\"\"+href+\"\\\">\"+menuName+\"</a></h1></li>\";\r\n");
      out.write("\t\t\t//html=html+\"\t</ul>\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tdocument.getElementById(\"ul_menu\").innerHTML=html;\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\t</script>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
