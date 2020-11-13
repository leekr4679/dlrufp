package aa.bb.cc;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grganzy2.www.DBManager;
import com.grganzy2.www.src.Member;


@WebServlet("/List")
public class List extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public List() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// ctrl + shift + o -> import 자동으로 가져옴
		DBManager dbm = new DBManager();
		// ctrl + 1 -> 오류보기
		ArrayList<Member> al = dbm.select();
		request.setAttribute("list", al);
		
		RequestDispatcher rd = request.getRequestDispatcher("list.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
