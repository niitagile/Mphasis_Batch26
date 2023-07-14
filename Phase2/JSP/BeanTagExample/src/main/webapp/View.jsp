<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="studentbeans.Student" scope="session"/>
<table border="2">
<tr><td>
<jsp:getProperty property="sname" name="obj"/>
</td><td>
<jsp:getProperty property="address" name="obj"/>
</td></tr>
</table>
</body>
</html>