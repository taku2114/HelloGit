package todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class S2A205p
 */
@WebServlet("/S2A205Phase4Servlet")
public class S2A205Phase4Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public S2A205Phase4Servlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		HttpSession session = request.getSession();

		String important = request.getParameter("important");
		String text = request.getParameter("text");

		S2A205Phase4Bean addBean = new S2A205Phase4Bean();
		addBean.setImportant(important);
		addBean.setText(text);

		session.setAttribute("addBean", addBean);
		getServletContext().getRequestDispatcher("/output.jsp")
				.forward(request, response);
	}

}
