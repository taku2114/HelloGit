package app;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class S2A205Servlet
 */
@WebServlet("/S2A205Servlet")
public class S2A205Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	String drvName = "oracle.jdbc.driver.OracleDriver";// OracleのJDBCﾄﾞﾗｲﾊﾞ名
	String url = "jdbc:oracle:thin:@"; // プロトコル名称，サブプロトコル名称，及びサブネーム
	String servername = "10.11.39.215"; // DBホスト名称
	String port = "1521"; // サーバが接続を監視する(リスナー)ポート番号
	String sid = "HCS1"; // インスタンス識別子
	String user = "h20183060"; // オラクル接続ユーザー（各自の設定値）
	String pass = "oraclemaster"; // オラクル接続ユーザーのパスワード

	public S2A205Servlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		S2A205infoBean InfoBean = (S2A205infoBean) session.getAttribute("InfoBean");
		if (InfoBean == null) {
			InfoBean = new S2A205infoBean();
		}

		String important;
		String text;
		String memo;
		String li;

		important = request.getParameter("important");
		text = request.getParameter("text");
		memo = request.getParameter("memo");
		li = request.getParameter("li");
		try {
			Class.forName(drvName);
			try (Connection conn = DriverManager.getConnection(url + servername + ":" + port + ":" + sid, user, pass);
					Statement stmt = conn.createStatement();) {
				stmt.executeUpdate("INSERT INTO TODOLIST VALUE (" + important + ",'" + text + "','" + memo + "','" + li + "')");
			}
			System.out.println("INSERT INTO TODOLIST VALUE (" + important + ",'" + text + "','" + memo + "','" + li + "')");
			try (Connection conn = DriverManager.getConnection(url + servername + ":" + port + ":" + sid, user, pass);
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(
							"SELECT * FROM TODOLIST")) {
				while (rs.next()) {
					S2A205RecordBean todoBean = new S2A205RecordBean();
					todoBean.setImportant(rs.getString("IMPORTANT"));
					todoBean.setText(rs.getString("TEXT"));
					todoBean.setMemo(rs.getString("MEMO"));
					todoBean.setLi(rs.getString("LI"));
					todoBean.addToBean(todoBean);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		S2A205RecordBean stdRecord = new S2A205RecordBean();
		stdRecord.setImportant(important);
		stdRecord.setText(text);
		stdRecord.setMemo(memo);
		stdRecord.setLi(li);
		InfoBean.addstudentRecord(stdRecord);

		session.setAttribute("InfoBean", InfoBean);
		getServletContext()
				.getRequestDispatcher("/output2.jsp").forward(request, response);
	}

}
