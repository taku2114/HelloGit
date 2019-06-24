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
 * Servlet implementation class ResponceServlet
 */
@WebServlet("/ResponceServlet")
public class ResponceServlet extends HttpServlet {
	public int count = 0;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//セッションの使用準備
		count++;
		String important = request.getParameter("important");
		String text = request.getParameter("text1");
		HttpSession session = request.getSession();
		session.setAttribute("Important", important);
		session.setAttribute("Text", text);

		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>TODOアプリケーション</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>TODOアプリケーション</h1>");
		out.println("<h3>出力画面：あなたは、" + count + " 人目の訪問者です！</h3>");
		out.println("重要度：" + important);
		out.println("<br>");
		out.println("<br>");
		out.println("内容 ：" + text);
		out.println("<br>");
		out.println("<br>");
		out.println("セッションID: " + session.getId() + "");
		out.println("<br>");
		out.println("<br>");
		out.println("<form action=\"S2A2GetServlet\" " + "method=\"post\">");
		out.println("<input type=\"submit\" " + "value=\"もう一度取得\">");
		out.println("</form>");
		out.println("<br>");
		out.println("<br>");
		out.println("<form action=\"S2A2RemoveServlet\" " + "method=\"post\">");
		out.println("<input type=\"submit\" " + "value=\"セッション削除\">");
		out.println("</form>");
		out.println("<br>");
		out.println("<br>");
		out.println("<a href =\"index.jsp\">" + "戻る</a>");
		out.println("</body>");
		out.println("</html>");
		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
	}
}
