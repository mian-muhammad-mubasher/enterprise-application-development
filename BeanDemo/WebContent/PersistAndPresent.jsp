<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Java Beans Demo</title>
</head>
<body>
<jsp:useBean id="student" class="pk.edu.pucit.beandemo.StudentBean" scope="session" />
<table border="1" background="BLUE">
<tr><th>Name</th><td><%= student.getName()%></td></tr>
<tr><th>Roll Number</th><td><%= student.getRollNumber()%></td></tr>
<tr><th>CGPA</th><td><%= student.getCgpa()%></td></tr>
<tr><th>Passed Out</th><td><%= student.isPassedOut()%></td></tr>
</table>
</body>
</html>