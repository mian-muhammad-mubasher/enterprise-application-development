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
<%--
<% 
	student.setName(request.getParameter("name"));
	student.setRollNumber(request.getParameter("rollNumber"));
	student.setCgpa(Float.parseFloat(request.getParameter("cgpa")));
	student.setPassedOut(Boolean.parseBoolean(request.getParameter("passedOut")));
%>
--%>
<%--
<jsp:setProperty name="student" property="name" value="<%= request.getParameter(\"name\")%>"/>
<jsp:setProperty name="student" property="rollNumber" value="<%= request.getParameter(\"rollNumber\")%>"/>
<jsp:setProperty name="student" property="cgpa" value="<%= Float.parseFloat(request.getParameter(\"cgpa\"))%>"/>
<jsp:setProperty name="student" property="passedOut" value="<%= Boolean.parseBoolean(request.getParameter(\"passedOut\"))%>" />
--%>
<%--
<jsp:setProperty name="student" property="name"/>
<jsp:setProperty name="student" property="rollNumber"/>
<jsp:setProperty name="student" property="cgpa"/>
<jsp:setProperty name="student" property="passedOut"/>
--%>

<jsp:setProperty name="student" property="*"/>

<h1>ARE YOUR SURE?</h1>
<h2><a href="/PersistAndPresent.jsp">Yes</a></h2>
</body>
</html>