<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Count Visitor</h1>
<form>
<%
Integer hitCount=(Integer)application.getAttribute("hitCounter");
if(hitCount==null || hitCount==0){
	//FirstVisit
	hitCount=1;
}
else
	hitCount+=1;


application.setAttribute("hitCounter",hitCount);
%>
</form>

You are Visitor number :<%=hitCount %>
</body>
</html>