/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.8.v20150217
 * Generated at: 2018-11-29 01:19:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"css/login.css\" rel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write(".title{\r\n");
      out.write("background-image: url('img/login.png') ;\r\n");
      out.write(" background-repeat: no-repeat;\r\n");
      out.write("  \r\n");
      out.write("  font-size:30px;\r\n");
      out.write("   position: absolute;\r\n");
      out.write("    top: 10px;\r\n");
      out.write("    left: 30px;\r\n");
      out.write("    right: 20px;\r\n");
      out.write("    bottom: 340px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>学生管理系统登录</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"body\">学生管理系统\r\n");
      out.write(" \r\n");
      out.write("<div class=\"midbox\">\r\n");
      out.write("<h1 class=\"title\">登录</h1>\r\n");
      out.write("<div class=\"form\">\r\n");
      out.write("<form method=\"post\" action=\"/login\">\r\n");
      out.write(" \r\n");
      out.write("        <p><label class=\"label_input\">用户名</label><input type=\"text\" id=\"username\" name=\"username\"class=\"text_field\"/></p>\r\n");
      out.write("        <p><label class=\"label_input\">密码</label><input type=\"text\" id=\"password\"name=\"password\" class=\"text_field\"/></p>\r\n");
      out.write(" \r\n");
      out.write("        <div id=\"login_control\">\r\n");
      out.write("           \r\n");
      out.write("            <a id=\"forget_pwd\" href=\"forget_pwd.html\">忘记密码？</a>\r\n");
      out.write("        </div>\r\n");
      out.write("       <input type=\"submit\" id=\"btn_login\" value=\"登录\" />\r\n");
      out.write(" </form>\r\n");
      out.write("   <div>\r\n");
      out.write("        <p id=\"notice\"><img id=\"notice\" src=\"img/pass3.png\">学生初始密码是： 教师初始密码是：<p>\r\n");
      out.write("        </div>\r\n");
      out.write(" </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
