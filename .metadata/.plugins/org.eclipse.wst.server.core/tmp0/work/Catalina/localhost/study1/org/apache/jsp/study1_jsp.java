/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.59
 * Generated at: 2020-11-05 09:32:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class study1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("java.sql.PreparedStatement");
    _jspx_imports_classes.add("java.sql.DriverManager");
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("\th4 {\r\n");
      out.write("\t\tdisplay: inline-block;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tname, gender, id, address, phoneNumber, email, hobby {\r\n");
      out.write("\t\tdisplay: inline-block;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");

	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	String passwordCheck = request.getParameter("passwordCheck");
	String address = request.getParameter("address");
	String phoneNumber = request.getParameter("phoneNumber");
	String email = request.getParameter("email");
	String[] hobby = request.getParameterValues("hobby");
	String hobbyArray = "";
	
	/* while(true) {
		if(!password.equals(passwordCheck)) {
		 out.print("<script>alert(\"비밀번호가 일치하지 않습니다.\");</script>");
		} else {
			break;
		}
		
		if(password.length() < 5) {
			out.print("<script>alert(\"비밀번호는 5글자 이상이어야 합니다.\");</script>");
			return;
		} else {
			break;
		}
	} */

	 
	out.println("<h1>작성하신 내용은 아래와 같습니다.</h1><hr>");
	out.println("<h4>이름 : </h4>" + name + "<hr>");
	out.println("<h4>성별 : </h4>" + gender + "<hr>");
	out.println("<h4>아이디 : </h4>" + id + "<hr>");
	out.println("<h4>주소 : </h4>" + address + "<hr>");
	out.println("<h4>전화번호 : </h4>" + phoneNumber + "<hr>");
	out.println("<h4>이메일주소 : </h4>" + email + "<hr>");
	if (hobby != null) {
		out.println("<table>");
		out.println("<h4>취미 : </h4>");
		for (int i = 0; i < hobby.length; i++) {
			out.println("<tr>");
			out.println("<td>");
			out.println(hobby[i]);
			out.println("</td>");
			out.println("</tr>");
		}
		out.println("</table>");
	} else {
		out.println("<h4>[선택한 취미가 없습니다.]</h4>");
	}
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.90:1521:xe", "scott", "1234");
		pstmt = conn.prepareStatement("insert into memberchap04gr2 values(?,?,?,?,?,?,?,?,sysdate)");
		pstmt.setString(1, name);
		pstmt.setString(2, gender);
		pstmt.setString(3, id);
		pstmt.setString(4, password);
		pstmt.setString(5, address);
		pstmt.setString(6, phoneNumber);
		pstmt.setString(7, email);
		for (int i = 0; i < hobby.length; i++) {
			hobbyArray += hobby[i] + " ";
		}
		pstmt.setString(8, hobbyArray);
		pstmt.executeUpdate();
	} catch(Exception e) {
		e.printStackTrace();
	} finally{
		pstmt.close();
		conn.close();
	}
	
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
