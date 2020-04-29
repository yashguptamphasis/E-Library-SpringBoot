<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hi Admin, have a great day :)</h1>
<h1 color="blue">${done} </h1>
<form action="addUser">
<h3>ADD USER</h3>
<input type="submit" value="ADD USER">
</form>


<form action="addBook">
<h3>ADD BOOK</h3>
<input type="submit" value="ADD BOOK">
</form>

</body>
</html>