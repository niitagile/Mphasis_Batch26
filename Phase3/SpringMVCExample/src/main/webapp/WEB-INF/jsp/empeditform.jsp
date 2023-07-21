<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Edit Employee Information </h1>
<form:form method="post" action="../editsave" modelAttribute="emp">
id: <form:hidden path="eid"/> <br>
name: <form:input path="name" /> <br>
designation: <form:input path="designation"/> <br>
salary: <form:input path="salary"/> <br>
<input type="submit" value="Save changes">
</form:form>
</body>
</html>