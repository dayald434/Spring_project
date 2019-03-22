<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body bgcolor="yellow">
<form action="login.do" method="post">
<h1 align="center">Login Page</h1>
<H2 align="center">${nmsg}</H2>
<pre>









					User_Name:	<input type="text" name="username" align="middle"><br></br>
					Password:	<input type="text" name="pwd" align="middle"><br></br>
							<input type="submit" value="Login"align="middle">
</pre></form></body>
</html>