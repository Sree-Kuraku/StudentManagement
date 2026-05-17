<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>deleteStatus</title>
<link rel="stylesheet" href="Response.css">
</head>
<body>
<div>
 <% Integer ids=(Integer)session.getAttribute("id"); %>
 <% String errormsg=(String)session.getAttribute("errormsg"); %>
  <% if(errormsg!=null) { %>
   <p align="center"><%=errormsg %></p>
   <% session.removeAttribute("errormsg"); %>
  <%} else if(ids!=null){%>
  <P align="center"><%=ids %>deleted sucessfully</P>
  <% session.removeAttribute("id"); %>
  </div>
  <%} %>
</body>
</html>