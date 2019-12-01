<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Location</title>
</head>
<body>
	<form action="updateloc" method="post">
	<pre>
		Id: <input type="text" name="Id" value="${editLocations.id}" readonly="true" /> 
		Code: <input type="text" name="code" value="${editLocations.code}" />
		Name: <input type="text" name="name" value="${editLocations.name}" /> 
		Type: urban<input type="radio"
			name="type" value="URBAN" ${editLocations.type=='URBAN'?'checked':''}/> 
			Rural<input type="radio" name="type" value="RURAL" ${editLocations.type=='RURAL'?'checked':''}/>
			<input type="submit" value="save"/>
			</pre>
	</form>
</body>
</html>