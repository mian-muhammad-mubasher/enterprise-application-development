<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Record Deletion</title>
</head>
<h1>Record Deletion</h1>
<body bgcolor="DarkSeaGreen4">
<sql:setDataSource var="sms"  
url="jdbc:odbc:JSTLDemo" 
user="root" password="root" />
<sql:update dataSource="${ sms}" var="student"
sql="Delete FROM student WHERE rollnumber = ?"
>
<sql:param value="${ param[\"r\"]}" />
</sql:update>
<h1>Record has been deleted</h1>
</body>
</html>