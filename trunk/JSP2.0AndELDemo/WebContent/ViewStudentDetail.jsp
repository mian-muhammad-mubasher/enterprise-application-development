<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Details</title>
</head>
<body>
<sql:setDataSource var="sms"  
url="jdbc:odbc:JSTLDemo" 
user="root" password="root" />
<sql:query dataSource="${ sms}" var="student"
sql="SELECT * FROM student WHERE rollnumber = ?"
>
<sql:param value="${ param[\"r\"]}" />
</sql:query>
<table border="1">
<tr><td>Roll Number</td><td>${ student.rows[0].rollnumber}</td></tr>
<tr><td>Name</td><td>${ student.rows[0].name}</td></tr>
<tr><td>Session</td><td>${ student.rows[0].session}</td></tr>
<tr><td>CGPA</td><td>${ student.rows[0].cgpa}</td></tr>
<tr><td>Is Passed Out</td><td>${ student.rows[0].ispassedout}</td></tr>
</table>
</body>
</html>