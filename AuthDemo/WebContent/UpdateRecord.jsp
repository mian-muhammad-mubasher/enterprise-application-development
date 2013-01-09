<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<sql:setDataSource var="sms"  
url="jdbc:odbc:JSTLDemo" 
user="root" password="root" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>update title here</title>
</head>
<body bgcolor="DarkSeaGreen4">

<sql:update
dataSource="${ sms}" 
sql="UPDATE student SET name=?,session=?,cgpa=?,ispassedout=? where rollNumber=?"
>

<sql:param value="${ param[\"name\"]}" />
<sql:param value="${ param[\"session\"]}" />
<sql:param value="${ param[\"cgpa\"]}" />
<sql:param value="${ param[\"isPassedOut\"]}" />
<sql:param value="${param[\"rollNumber\"]}" />
</sql:update>

<h1>Student data has been updated in database.</h1>
</body>
</html>