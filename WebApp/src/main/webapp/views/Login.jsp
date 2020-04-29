<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Yahoo!!</title>
</head>
<body>
<h1 color="red">From Jsp ${Error}</h1>
<h1 color="Green"> ${login}</h1>
<br>
<h3>Admin Login</h3>
  <form action="AdminLogin" method="post" style="width:300px">
  <div class="form-group">
    <label for="email1">Email address</label>
    <input type="email" class="form-control" name="name" id="email1" placeholder="Email"/>
  </div>
  <div class="form-group">
    <label for="password1">Password</label>
    <input type="password" class="form-control" name="password" id="password1" placeholder="Password"/>
  </div>  
  <button type="submit" class="btn btn-primary">Login</button>
</form>



<h3>User Login</h3>
  <form action="UserLogin" style="width:300px">
  <div class="form-group">
    <label for="email1">Email address</label>
    <input type="email" class="form-control" name="name" id="email1" placeholder="Email"/>
  </div>
  <div class="form-group">
    <label for="password1">Password</label>
    <input type="password" class="form-control" name="password" id="password1" placeholder="Password"/>
  </div>  <button type="submit" >Login</button>
</form>
<br>
<br>
<form method="post" action="create">
	To Create Account<input type="submit">
	
</form>


</body>
</html>