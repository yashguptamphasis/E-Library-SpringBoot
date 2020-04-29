<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello</h1> ${name},<h1>how are you doing today?</h1>

<h1>${done} </h1> 
<form action="issueBook">
<h3>Issue Book</h3>
<input type="submit" value="Issue Book">
</form>


<form action="returnBook">
<h3>Return BOOK</h3>
<input type="submit" value="Return BOOK">
</form>

<form action="viewBook">
<h3>View BOOK</h3>
<input type="submit" value="View BOOK">
</form>

</body>
</html>