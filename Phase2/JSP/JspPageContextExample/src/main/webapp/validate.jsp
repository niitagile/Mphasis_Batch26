<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import ="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! boolean validate(String uname, String pword){
	if(uname.equalsIgnoreCase("Java")&& pword.equals("eclipse@123"))
			return true;
	else
		return false;

}	
	%>

<%
String uname=request.getParameter("txtName");
String pword=request.getParameter("txtPword");
if(validate(uname,pword)){
	pageContext.setAttribute("username", uname,PageContext.SESSION_SCOPE);//SESSION_SCOPE,APPLICATION_SCOPE,PAGE_SCOPE,REQUEST_SCOPE

	getServletContext().getRequestDispatcher("/validate2.jsp").forward(request, response);
}else
{
		out.println("Wrong user or password");
	getServletContext().getRequestDispatcher("/Login.jsp").include(request, response);
}

%>
</body>
</html>