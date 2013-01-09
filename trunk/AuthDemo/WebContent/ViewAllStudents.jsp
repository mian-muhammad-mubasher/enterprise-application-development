<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<sql:setDataSource var="sms"  
url="jdbc:odbc:JSTLDemo" 
user="root" password="root" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>/View All Students</title>
</head>
<h1>THERE EXIST FOLLOWING RECORDS</h1>
<body bgcolor="DarkSeaGreen4">
<sql:query dataSource="${ sms}" var="rollNumbers">
SELECT rollnumber FROM student
</sql:query>
<table border="1" align="center">
<c:forEach var="r" items="${ rollNumbers.rows}">
<tr><td>${ r.rollnumber}</td><td><a href="/ViewStudentDetail.jsp?r=${ r.rollnumber}">details</a></td><td><a href="/UpdateStudentDetail.jsp?r=${ r.rollnumber}">update</a></td><td><a href="/DeleteStudentDetail.jsp?r=${ r.rollnumber}">delete</a></td></tr>
</c:forEach>
</table>
</body>
</html>