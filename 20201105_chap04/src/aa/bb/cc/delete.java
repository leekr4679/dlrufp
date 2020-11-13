package aa.bb.cc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.grganzy2.www.DBManager;

@WebServlet("/delete")
public class delete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public delete() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String idx = request.getParameter("idx");
		System.out.println("idx : " + idx);
		
		DBManager dbm = new DBManager();
		dbm.delete(idx);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
