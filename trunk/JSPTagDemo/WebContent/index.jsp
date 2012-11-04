<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Tag Demo</title>
</head>
<body>
<%-- This page is a for JSP Tag Demonstration --%>
<%@page import="java.util.Date"%>
<%! 
private String info = "JSP Tag Demo"; 
private Date getCurrentDate(){
	return new Date();
}
%>
<h1><%= info%></h1>
<%
for(int i=0;i<10;i++){
	out.println(getCurrentDate());
	out.println("<br>");
}
%>
</body>
</html>