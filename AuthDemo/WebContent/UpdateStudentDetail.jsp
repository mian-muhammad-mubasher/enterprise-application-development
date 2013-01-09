<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UPDATE RECORD</title>
</head>
<h1>UPDATE RECORD</h1>
<body bgcolor="DarkSeaGreen4">
<sql:setDataSource var="sms"  
url="jdbc:odbc:JSTLDemo" 
user="root" password="root" />
<sql:query dataSource="${ sms}" var="student"
sql="SELECT * FROM student WHERE rollnumber = ?"
>
<sql:param value="${ param[\"r\"]}" />
</sql:query>
<form action="/UpdateRecord.jsp"  >
<table border="1" align="center">
<tr><td>Roll Number</td><td>${ student.rows[0].rollnumber}</td></tr>
<tr><td><input type="hidden" name="rollNumber" value=${ student.rows[0].rollnumber}></td></tr>
<tr><td>Name</td><td><input type="text" name="name" value=${ student.rows[0].name}></td></tr>
<tr><td>Session</td><td><input type="text" name="session" value=${ student.rows[0].session}></td></tr>
<tr><td>CGPA</td><td><input type="text" name="cgpa" value=${ student.rows[0].cgpa}></td></tr>
<tr><td>Is Passed Out</td><td><input type="text" name="isPassedOut" value=${ student.rows[0].ispassedout}></td></tr>
<tr><td><input type="submit" value="update"></td></tr>
</table>
</form>
</body>
</html>