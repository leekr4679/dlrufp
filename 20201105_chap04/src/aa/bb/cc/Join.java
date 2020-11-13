package aa.bb.cc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grganzy2.www.DBManager;
import com.grganzy2.www.src.Member;

@WebServlet("/Join")
public class Join extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Join() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		response.getWriter().append("Served at: ").append(request.getContextPath());

		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String passwordCheck = request.getParameter("passwordCheck");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String[] hobby = request.getParameterValues("hobby");
		String regdate = request.getParameter("regdate");
		String idx = request.getParameter("idx");
		
		String hobbyArray = "";
		for(String temp : hobby) {
			hobbyArray += temp;
		}
		
		DBManager dm = new DBManager();
		dm.insert(new Member(idx , name, gender, id, password, address, phone, email, hobbyArray, passwordCheck, regdate));
		RequestDispatcher rd = request.getRequestDispatcher("join.jsp");
		rd.forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}