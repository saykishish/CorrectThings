<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
String[] movieNames = (String[])request.getAttribute("movieNames");
request.getAttribute("marry");
request.getAttribute("yourName");
String[] theImg = (String[])request.getAttribute("theImg");

%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

${movieNames }<br>
${marry }<br>
${yourName }<br>

<c:forEach var="x" items="${ movieNames }">${x }<br /> </c:forEach>
<c:forEach var="x" items="${ theImg }">${x }<br /> </c:forEach>

</body>
</html>