package todo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class S2A2RemoveServlet
 */
@WebServlet("/S2A2RemoveServlet")
public class S2A2RemoveServlet extends HttpServlet {

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		HttpSession session = request.getSession();
		session.invalidate();

		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>TODOアプリケーション</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<hr><h2>出力画面：削除</h2>");
		out.println("セッション情報を削除しました。");
		out.println("<br>");
		out.println("<br>");
		out.println("<hr>");

		out.println("<form action=\"S2A2GetServlet\" " + "method=\"post\">");
		out.println("<input type=\"submit\" " + "value=\"もう一度取得\">");
		out.println("</form>");
		out.println("<br>");
		out.println("<br>");
		out.println("<a href =\"index.jsp\">" + "戻る</a>");
		out.println("</body>");
		out.println("</html>");
	}

}
