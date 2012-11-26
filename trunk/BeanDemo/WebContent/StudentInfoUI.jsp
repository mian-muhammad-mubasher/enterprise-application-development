<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Java Beans Demo</title>
</head>
<body>
<h1>Insert Student</h1>
<form action="ConfirmationManager.jsp">
<table border="1" bgcolor="RED">
<tr><th>Name</th><td><input type="text" name="name"></td></tr>
<tr><th>Roll Number</th><td><input type="text" name="rollNumber"></td></tr>
<tr><th>CGPA</th><td><input type="text" name="cgpa"></td></tr>
<tr><th>Passed Out</th><td>
<select name="passedOut">
<option value="true" selected="selected">Yes</option>
<option value="false">No</option>
</select>
</td></tr>
<tr><th></th><td><input type="submit" value="next"></td></tr>
</table>
</form>
</body>
</html>