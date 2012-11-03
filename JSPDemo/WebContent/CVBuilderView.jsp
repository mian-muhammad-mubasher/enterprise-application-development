<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CV Builder</title>
</head>
<body>
<form action="/CVBuilder.jsp" method="post">
<table border="1" bordercolor="BLUE">
<tr><th>Name</th><td><input type="text" name="name"></td></tr>
<tr><th>Email</th><td><input type="text" name="email"></td></tr>
<tr><th>Education</th><td><input type="text" name="education"></td></tr>
<tr><th>Occupation</th><td><input type="text" name="occupation"></td></tr>
<tr><th></th><td><input type="submit" name="Make CV"></td></tr>
</table>
</form>
</body>
</html>