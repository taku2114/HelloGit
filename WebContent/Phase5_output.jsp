<%@ page import="todo.S2A205Phase5RecordBean" import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>出力画面</title>
</head>
<body>

<h1>TODOアプリケーション</h1>
<h2>出力画面：JSPver.</h2>
<jsp:useBean id="InfoBean" class="todo.S2A205Phase5infoBean" scope="session" />
<table border="1">
<tr><th>重要度</th><th>内容</th></tr>
<%
ArrayList<S2A205Phase5RecordBean> RecordArray = InfoBean.getRecordArray();
for(S2A205Phase5RecordBean rcd : RecordArray) {
	out.println("<tr><td>" + rcd.getImportant() + "</td><td>" + rcd.getText() + "</td></tr>");
}
%>
</table>

<br>
<%
        out.println("<form action=\"S2A205Phase5RemoveServlet\" " + "method=\"post\">");
		out.println("<input type=\"submit\" " + "value=\"セッション削除\">");
		out.println("</form>");
		out.println("<br>");
		out.println("<form action=\"index.jsp\" " + "method=\"post\">");
		out.println("<input type=\"submit\" " + "value=\"戻る\">");
		out.println("</form>");
		%>
</body>
</html>