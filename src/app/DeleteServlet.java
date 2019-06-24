package app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class S2A205Servlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int index = Integer.parseInt(request.getParameter("index"));

		HttpSession session = request.getSession();
		S2A205infoBean InfoBean = (S2A205infoBean) session.getAttribute("InfoBean");
		if (InfoBean == null) {
			InfoBean = new S2A205infoBean();
		}

		//Beans作成不要

		String important;
		String text;
		String memo;
		String li;

		important = request.getParameter("important");
		text = request.getParameter("text");
		memo = request.getParameter("memo");
		li = request.getParameter("li");

		S2A205RecordBean stdRecord = new S2A205RecordBean();
		stdRecord.setImportant(important);
		stdRecord.setText(text);
		stdRecord.setMemo(memo);
		stdRecord.setLi(li);
		InfoBean.deletestudentRecord(index - 1);

		session.setAttribute("InfoBean", InfoBean);
		getServletContext()
				.getRequestDispatcher("/output2.jsp").forward(request, response);
	}

}
