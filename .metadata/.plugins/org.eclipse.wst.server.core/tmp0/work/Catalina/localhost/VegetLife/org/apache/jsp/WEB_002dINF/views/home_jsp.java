/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.21
 * Generated at: 2019-07-12 08:20:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/include/include-footer.jspf", Long.valueOf(1562892878830L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/w3.css\">\r\n");
      out.write("<style>\r\n");
      out.write("* {\r\n");
      out.write("\tbox-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bz-wodth-20 {\r\n");
      out.write("\twidth: 20%\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bz-width-50 {\r\n");
      out.write("\twidth: 50%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bz-review {\r\n");
      out.write("\tdisplay: flex;\r\n");
      out.write("\tflex-flow: wrap;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".w3-card-4 {\r\n");
      out.write("\tmargin: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("search {\r\n");
      out.write("\tbackground-color: green;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("nav{\r\n");
      out.write("\tbackground-color: green;\r\n");
      out.write("\tcolor: black;\r\n");
      out.write("}\r\n");
      out.write("\tul.menu{\r\n");
      out.write("\tlist-style: none;\r\n");
      out.write("\tdisplay: flex;\r\n");
      out.write("}\r\n");
      out.write("\tul.menu a{\r\n");
      out.write("\t\tdisplay: block;\r\n");
      out.write("            color: inherit;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            padding: 14px 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("table {\r\n");
      out.write("\tborder: 1px solid #777777;\r\n");
      out.write("\twidth: 50%;\r\n");
      out.write("\tborder-collapse: collapse;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("th {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("th, td {\r\n");
      out.write("\tpadding: 20px;\r\n");
      out.write("}\r\n");
      out.write("table tr.tr_rows:nth-child(even) {\r\n");
      out.write("background-color: #888888;\r\n");
      out.write("color: white;\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("table tr.tr_rows:nth-child(odd){\r\n");
      out.write("background-color:  #444444;\r\n");
      out.write("color: white;\r\n");
      out.write("}\r\n");
      out.write("table tr.tr_rows:hover{\r\n");
      out.write("\tbackground-color: white;\r\n");
      out.write("\tcolor: black;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- 로고 검색 -->\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<form>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/image/vigunLifeLogo.png\"\r\n");
      out.write("\t\t\t\t\twidth=\"200px\">\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<div class=\"search\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"m_text\" id=\"m_texr\">\r\n");
      out.write("\t\t\t\t\t<button>\r\n");
      out.write("\t\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/image/vigunLifeft.png\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"img1\" width=\"20px\"></img>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<!-- 유저 인터페이스 -->\r\n");
      out.write("\t<nav>\r\n");
      out.write("\t<ul class=\"menu\">\r\n");
      out.write("\t\t<li><a href=\"#\">공지상황</a></li>\r\n");
      out.write("\t\t<li><a href=\"#\">맛집리뷰</a></li>\r\n");
      out.write("\t\t<li><a href=\"#\">커뮤니티</a></li>\r\n");
      out.write("\t\t<li><a href=\"#\">FQL</a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t<!-- 로그인 -->\r\n");
      out.write("\t<section>\r\n");
      out.write("\t<form>\r\n");
      out.write("\t\t<fieldset class=\"fi_login\">\r\n");
      out.write("\t\t\t<div class=\"login\">\r\n");
      out.write("\t\t\t\t<label for=\"m_userid\">회원아이디</label> \r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"m_userid\" id=\"m_userid\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"login\">\r\n");
      out.write("\t\t\t\t<label for=\"m_password\">비밀번호</label> <input type=\"password\"\r\n");
      out.write("\t\t\t\t\tname=\"password\" id=\"password\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"login\">\r\n");
      out.write("\t\t\t\t<a href=\"#\">회원가입</a> <a href=\"#\">아이디/비밀번호</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"btn-box\">\r\n");
      out.write("\t\t\t\t<button>로그인</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 리뷰 이미지 게시판 -->\r\n");
      out.write("\t\t<div class=\"bz-review\">\r\n");
      out.write("\t\t\t<div class=\"w3-card-4 bz-wodth-20\">\r\n");
      out.write("\t\t\t\t<a href=\"#\"> <img\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/image/food1.png\"\r\n");
      out.write("\t\t\t\t\twidth=\"100%\">\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<footer class=\"w3-container w3-center\">\r\n");
      out.write("\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t<p>설명</p>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</footer>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"w3-card-4 bz-wodth-20\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<a href=\"#\"><img\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/image/food2.png\"\r\n");
      out.write("\t\t\t\t\twidth=\"100%\"> </a>\r\n");
      out.write("\t\t\t\t<footer class=\"w3-container w3-center\">\r\n");
      out.write("\t\t\t<a href=\"#\">\t\r\n");
      out.write("\t\t\t\t\t<p>설명</p>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</footer>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"w3-card-4 bz-wodth-20\">\r\n");
      out.write("\t\t\t\t<a href=\"#\"><img\r\n");
      out.write("\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/image/food3.png\"\r\n");
      out.write("\t\t\t\t\twidth=\"100%\"> </a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<footer class=\"w3-container w3-center\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t<p>설명</p>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</footer>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- 이달의 추천 식당 -->\r\n");
      out.write("\t\t<div class=\"\">\r\n");
      out.write("\t\t\t<p>이달의 추천 식당</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"\">\r\n");
      out.write("\t\t\t<a href=\"#\"><img\r\n");
      out.write("\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/image/vigunba.png\"\r\n");
      out.write("\t\t\t\theight=\"100px\"></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t<!-- 메인 게시판 -->\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<h3>\r\n");
      out.write("\t\t\t<a href=\"#\">자유게시판</a>\r\n");
      out.write("\t\t</h3>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<table border=\"1\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>no</th>\r\n");
      out.write("\t\t\t<th>제목</th>\r\n");
      out.write("\t\t\t<th>작성자</th>\r\n");
      out.write("\t\t\t<th>조회수</th>\r\n");
      out.write("\t\t\t<th>날짜</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr class=\"tr_rows\">\r\n");
      out.write("\t\t\t<td></td>\r\n");
      out.write("\t\t\t<td></td>\r\n");
      out.write("\t\t\t<td></td>\r\n");
      out.write("\t\t\t<td></td>\r\n");
      out.write("\t\t\t<td></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr class=\"tr_rows\">\r\n");
      out.write("\t\t\t<td></td>\r\n");
      out.write("\t\t\t<td></td>\r\n");
      out.write("\t\t\t<td></td>\r\n");
      out.write("\t\t\t<td></td>\r\n");
      out.write("\t\t\t<td></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr class=\"tr_rows\">\r\n");
      out.write("\t\t\t<td></td>\r\n");
      out.write("\t\t\t<td></td>\r\n");
      out.write("\t\t\t<td></td>\r\n");
      out.write("\t\t\t<td></td>\r\n");
      out.write("\t\t\t<td></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr class=\"tr_rows\">\r\n");
      out.write("\t\t\t<td></td>\r\n");
      out.write("\t\t\t<td></td>\r\n");
      out.write("\t\t\t<td></td>\r\n");
      out.write("\t\t\t<td></td>\r\n");
      out.write("\t\t\t<td></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</table>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("footer{\r\n");
      out.write("padding: 0.5rem;\r\n");
      out.write("}\r\n");
      out.write("address{\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<footer class=\"w3-grey\">\r\n");
      out.write("<address>CopyRight &copy; 이동현 김종민 한상철 </address>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
