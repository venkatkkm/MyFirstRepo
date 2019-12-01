<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Locations</title>
</head>
<body>
<table>
<tr>
<th>Id</th>
<th>code</th>
<th>name</th>
<th>type</th>
</tr>
<c:forEach items="${locations}" value="loc">
<tr>
<td>${loc.Id}</td>
<td>${loc.code}</td>
<td>${loc.name}</td>
<td>${loc.type}</td>
<td><a href="deleteLocation?id=${loc.Id}">delete</a></td>
<td><a href="showUpdate?id=${loc.Id}">update</a></td>
</tr>
</c:forEach>
</table>
<a href="create">Add records</a> 
</body>
</html>