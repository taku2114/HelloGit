<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<script src="js/jquery-3.2.0.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<link rel=stylesheet href="css/bootstrap.min.css">
	<link rel="shortcut icon" href="images/favicon.ico">
	<link rel=stylesheet href="css/style.css">
<meta charset="UTF-8">
<title>S2A205</title>
</head>
<body>
<%! int cnt = 0;
String kigu;
%>
<h1>ToDoアプリケーション</h1>

<form action="S2A205Servlet"method="get">
<h3>登録情報</h3>
重要度
<select name="important">
					<option value="5">5</option>
					<option value="4">4</option>
					<option value="3">3</option>
					<option value="2">2</option>
					<option value="1">1</option>
				</select>
				<br>
				<br>
				内容
				<input type="text" name="text" size=20>
				<br>
				<br>
				メモ
				<input type="text" name="memo" size=20>
				<br>
				<br>
締め切り
<input type="date" name="li"><br>
<br>
<input type="submit" value="送信">
</form>
</body>
</html>