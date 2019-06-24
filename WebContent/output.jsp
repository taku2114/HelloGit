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
重要度：
<jsp:getProperty name="addBean" property="important" />
<br>
<br>
内容
<jsp:getProperty name="addBean" property="text" />
<br>
<br>
<%
out.println("セッションID: " + session.getId() + "");
out.println("<br>");
out.println("<br>");
out.println("<form action=\"S2A2GetServlet\" " + "method=\"post\">");
out.println("<input type=\"submit\" " + "value=\"もう一度取得\">");
out.println("</form>");
out.println("<br>");
out.println("<form action=\"S2A2RemoveServlet\" " + "method=\"post\">");
out.println("<input type=\"submit\" " + "value=\"セッション削除\">");
out.println("</form>");
out.println("<br>");
out.println("<a href =\"index.jsp\">" + "戻る</a>");
%>
</body>
</html>