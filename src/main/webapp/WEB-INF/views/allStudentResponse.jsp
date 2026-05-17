<%@page import="com.student.StudentManagement.Entity.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>/
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="Response.css">
</head>
<body>
<% List<Student> allStudents=(List<Student>)session.getAttribute("object"); %>
<% String nodata=(String)session.getAttribute("nodata"); %>
<div align="center">
<% if(nodata!=null){ %>
   <P align="center"><%=nodata %></P>
   <%session.removeAttribute("nodata");%>
   <%} else if(allStudents!=null) {%>
    
       <table border="1" cellpadding="10">
       <tr>
       <th>Id</th><th>Name</th><th>Phno</th>
       </tr>
       <% for(Student s:allStudents){%>
       <tr>
       <td><%=s.getId()%></td>
       <td><%=s.getName()%></td>
       <td><%=s.getPhno()%></td>
        </tr>
        <%} %>
       </table>
       </div>
       <%}   %>
       
</body>
</html>