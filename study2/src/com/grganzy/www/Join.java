package com.grganzy.www;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grganzy.www.DBManager.DBManager;
import com.grganzy.www.Member.Member;

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
		for (String temp : hobby) {
			hobbyArray += temp + " ";
		}

		DBManager dbm = new DBManager();
		dbm.insert(new Member(name, gender, id, password, passwordCheck, address, phone, email, hobbyArray,
				regdate, idx));
		
		RequestDispatcher rd = request.getRequestDispatcher("join.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
