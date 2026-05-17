<%@page import="com.student.StudentManagement.Entity.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>updatestatus</title>
<link rel="stylesheet" href="Response.css">
</head>
<body>
<% Student st=(Student)session.getAttribute("object"); %>
<% String erromsg=(String)session.getAttribute("errormsg");%>
<div align="center">
<% if(erromsg!=null){ %>
 <p><h3><%=erromsg %></h3></p>
<% } else if(st!=null){ %>
<table border="1">
<tr>
<th>ID</th><th>update_name</th><th>updated_phno</th>
</tr>
<tr>
<td><%=st.getId() %></td>
<td><%=st.getName()%></td>
<td><%=st.getPhno()%></td>
</tr>
<h4>successfully updated</h4>
</table>
</div>
<% } %>
</body>
</html>