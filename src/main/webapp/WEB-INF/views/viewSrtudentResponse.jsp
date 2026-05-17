<%@page import="com.student.StudentManagement.Entity.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>viewStudentStatus</title>
<link rel="stylesheet" href="Response.css">
</head>
<body>
 <% Student details=(Student)session.getAttribute("object"); %>
 <% String ermsg=(String)session.getAttribute("ermsg"); %>
 <div align="center">
 <% if(ermsg!=null){ %>
 <p><h3><%=ermsg %></h3></p>
  <%} else if(details!=null){ %>
     <table border="1" cellpadding="10">
     <tr>
     <th>Id</th><th>Name</th><th>Phno</th>
     </tr>
     <tr>
     <td><%=details.getId() %></td>
     <td><%=details.getName() %></td>
     <td><%=details.getPhno()%></td>
     </tr>
     </table>
     </div>
     <%} %>
     
</body>
</html>