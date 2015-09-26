<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Actors List</title>
</head>
<body>

This page displays the DB table content of required table via DAO - SERVICE - CONTROLLER layer in JSP using JSTL tags..,

<br/><br/>
<h2>Result Set of Table Content</h2>

<table>
<c:forEach var="actor" items="${actors}">
	<tr>
    <td>Actor Id	: ${actor.actorId} ,</td> 
    <td>First Name	: ${actor.firstName} ,</td>
    <td>Last Name	: ${actor.lastName} </td>
    <td>Update Time	: ${actor.lastUpdatedTime} </td>
    </tr>
</c:forEach>
</table>

<br/><br/>

</body>
</html>