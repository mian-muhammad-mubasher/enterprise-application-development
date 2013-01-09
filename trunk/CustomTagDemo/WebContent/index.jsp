<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/WEB-INF/mitf11.tld" prefix="e"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="p"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<e:CustomSelect opt1="Mubasher" opt2="Atif" opt3="Fatima" opt4="Iram" opt5="Adil" />
<e:FragmentDemoTag count="10">
<jsp:attribute name="html">
<h3>Mian Muhammad Mubasher</h3>
</jsp:attribute>
</e:FragmentDemoTag>
<p:greeting by="Mubasher">Hello Every body</p:greeting>


<e:CustomOuterTag>
<e:CustomInnerTag>
Hi Guys!
</e:CustomInnerTag>
</e:CustomOuterTag>

</body>
</html>