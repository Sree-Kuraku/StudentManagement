<%@page import="com.student.StudentManagement.Entity.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Details</title>
<link rel="stylesheet" href="Response.css">
</head>
<body>
<% Student e=(Student)session.getAttribute("object"); 
 String ss=(String)session.getAttribute("alrdy"); %>
<div align="center">
<% if(ss!=null){ %>
 <p ><h3><%=ss %></h3></p>
 <%} else if(e!=null){ %>
<table border="1">
<tr>
<th>ID</th><th>Name</th><th>Phno</th>
</tr>
<tr>
<td><%=e.getId() %></td>
<td><%=e.getName() %></td>
<td><%=e.getPhno() %></td>
</tr>

<%-- <b>Id:</b><%=e.getId()%> --%>
<%-- <p><b>name:</b><%=e.getName()%></p> --%>
<%-- <p><b>phno:</b><%=e.getPhno() %></p> --%>
<h4>successfully registered</h4>
</table>
</div>
<% } %>



<%-- <p><b>id:</b><%=session.getAttribute("id") %> --%>
<%-- <p><b>id:</b><%=session.getAttribute("name") %> --%>
<%-- <p><b>id:</b><%=session.getAttribute("phno") %> --%>
</body>
</html>