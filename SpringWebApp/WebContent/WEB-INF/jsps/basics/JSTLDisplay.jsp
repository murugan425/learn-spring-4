<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTL Usage</title>
</head>
<body>

This page displays the name being passed from server via Model Object and displayed using JSTL tag..,
<br/> <b> Check the difference between EL &amp; JSTL </b>
<br/> The JSTL tag will display the HTML tags as it is, whereas in EL HTML tags are rendered in the browser.., 

<br/><br/>
Request (using Expression Language EL): Name = ${userName}

<br/><br/>
Request (using JSTL Tag): Name = <c:out value="${userName}"></c:out>

</body>
</html>