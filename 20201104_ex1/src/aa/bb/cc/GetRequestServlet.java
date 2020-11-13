package aa.bb.cc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetRequestServlet")
public class GetRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GetRequestServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		RequestDispatcher re = request.getRequestDispatcher("GetRequestServlet.jsp");
		re.forward(request,response);
		
//		PrintWriter out = response.getWriter();
//		String[] name = request.getParameterValues("name");
		
//		String pname = request.getParameter("name");
//		System.out.println("name : " + pname);
		
//		out.println("이 요청은 doPost에서 처리되었습니다." + "<br>");
//		
//		out.println("<h1>name : [" + pname + "]</h1>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
