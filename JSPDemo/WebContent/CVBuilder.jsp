<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CV</title>
</head>
<body>
<h1>Your CV</h1>
<table border="1" bordercolor="RED">
<tr><th>Name</th><td><%= request.getParameter("name") %></td></tr>
<tr><th>Email</th><td><%= request.getParameter("email") %></td></tr>
<tr><th>Education</th><td><%= request.getParameter("education") %></td></tr>
<tr><th>Occupation</th><td><%= request.getParameter("occupation") %></td></tr>
<tr><th>Occupation</th><td><%= 2+2 %></td></tr>
</table>
</body>
</html>