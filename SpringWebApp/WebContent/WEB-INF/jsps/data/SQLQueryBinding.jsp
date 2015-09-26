<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	
	
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<sql:query var="resultSet" dataSource="jdbc/learnSpringDB">
SELECT ACTOR_ID, FIRST_NAME, LAST_NAME FROM ACTOR
</sql:query>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SQL in JSP</title>
</head>
<body>

This page displays the DB table content directly in JSP using SQL JSTL tags..,

<br/><br/>
<h2>Result Set of Table Content</h2>

<table>
<c:forEach var="rowEntry" items="${resultSet.rows}">
	<tr>
    <td>Actor Id	: ${rowEntry.ACTOR_ID} ,</td> 
    <td>First Name	: ${rowEntry.FIRST_NAME} ,</td>
    <td>Last Name	: ${rowEntry.LAST_NAME} </td>
    </tr>
</c:forEach>
</table>

<br/><br/>

</body>
</html>