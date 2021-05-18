<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%> //자바에서 사용하는 한글 인코딩
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %> //jsp문자열 <>+%@ -> 자바문법 
<html>
<head>
	<title>Home</title>
	<meta charset = "utf-8" /> //html 내부에서 한글 인코딩 
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P> //$표시 -> 자바문자열, 이거 외의 나머지는 다 html문법!
</body>
</html>
