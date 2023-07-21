<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="fm"%>  

<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add New Employee</h1>
       <fm:form method="post" action="save" modelAttribute="emp">  
      	<table >
      	<tr>  
          <td>eid : </td> 
          <td><fm:input path="eid"  /></td>
         </tr>  
         <tr>  
          <td>Name : </td> 
          <td><fm:input path="name"  /></td>
         </tr>  
         <tr>  
          <td>Salary :</td>  
          <td><fm:input path="salary" /></td>
         </tr> 
         <tr>  
          <td>Designation :</td>  
          <td><fm:input path="designation" /></td>
         </tr> 
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Save" /></td>  
         </tr>  
        </table>  
       </fm:form>  


</body>
</html>