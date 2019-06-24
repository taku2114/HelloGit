package todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class S2A205Phase5Servlet
 */
@WebServlet("/S2A205Phase5Servlet")
public class S2A205Phase5Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public S2A205Phase5Servlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		S2A205Phase5infoBean InfoBean = (S2A205Phase5infoBean) session.getAttribute("InfoBean");
		if (InfoBean == null) {
			InfoBean = new S2A205Phase5infoBean();
		}

		String important;
		String text;

		important = request.getParameter("important");
		text = request.getParameter("text");

		S2A205Phase5RecordBean stdRecord = new S2A205Phase5RecordBean();
		stdRecord.setImportant(important);
		stdRecord.setText(text);
		InfoBean.addstudentRecord(stdRecord);

		session.setAttribute("InfoBean", InfoBean);
		getServletContext()
				.getRequestDispatcher("/Phase5_output.jsp").forward(request, response);
	}

}
