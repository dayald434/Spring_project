<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>jQuery UI Datepicker - Default functionality</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#datepicker" ).datepicker();
  } );
  </script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
h1{
	
}

</script>
<body bgcolor="cyan">
<form action="attendance.do" method="post">
										<h1 align="center">Satsang Attendance</h1>
										<h2 align="center">${dto}</h2>

<pre>
		First Name:	<input type="text" name="fname" al>									Last Name:	<input type="text" name="lname"><br></br>
		SK/SR:		<input type="text" name="sksr">									Pathi:		<input type="text" name="pathi"><br></br>
		Shabad:		<input type="text" name="shabad">									Saint:		<input type="text" name="saint"><br></br>
		Book:		<input type="text" name="book">									Date:		<input type="text" id="datepicker" name="date"><br></br>
		Gents:		<input type="text" name="gents">									Ladies:		<input type="text" name="ladies"><br></br>											
		Children:	<input type="text" name="children"><br></br>
		Two_Wheeler:	<input type="text" name="two_wheeler">									Four_wheeler:	<input type="text" name="four_wheeler"><br></br>
		<input type="submit" value="submit">
 																	<%=new java.util.Date()%><br></br>
</pre>
 

</form>
</body>
</html>