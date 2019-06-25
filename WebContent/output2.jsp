<%@ page import="app.S2A205RecordBean" import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="js/jquery-3.2.0.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<link rel=stylesheet href="css/bootstrap.min.css">
	<link rel=stylesheet href="css/style.css">
	<link rel="shortcut icon" href="images/favicon.ico">
<meta charset="UTF-8">
<title>TODOアプリケーション</title>
</head>
<body>

<h1>TODOアプリケーション</h1>
<jsp:useBean id="InfoBean" class="app.S2A205infoBean" scope="session" />
<table border="1" align="center">
<tr><th>重要度</th><th>内容</th><th>メモ</th><th>締め切り</th></tr>
<%
ArrayList<S2A205RecordBean> RecordArray = InfoBean.getRecordArray();
for(S2A205RecordBean rcd : RecordArray) {
	out.println("<tr><td>" + rcd.getImportant() + "</td><td>" + rcd.getText() + "</td><td>" + rcd.getMemo() + "</td><td>" +rcd.getLi() +"</td></tr>");
}
%>
</table>

<br>
	<form action="DeleteServlet" method="GET">
            削除情報
<br>
		<input type="text" name="index" size="20" value="" />
        <input type="SUBMIT" value="送信">
	</form>
<br>
<%
        out.println("<form action=\"S2A205RemoveServlet\" " + "method=\"post\">");
		out.println("<input type=\"submit\" " + "value=\"セッション削除\">");
		out.println("</form>");
		out.println("<br>");
		out.println("<form action=\"index2.jsp\" " + "method=\"post\">");
		out.println("<input type=\"submit\" " + "value=\"戻る\">");
		out.println("</form>");
		%>
</body>
</html>