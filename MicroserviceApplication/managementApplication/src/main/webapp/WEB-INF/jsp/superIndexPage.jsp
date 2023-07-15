<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: LightBlue;
}

li {
  float: left;
}

li a {
  display: block;
  color: black;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover {
  background-color: Ivory;
}
.p1 {
  font-family: "Georgia", Times, serif;
}
 
</style>

<link href="/css/main.css"rel="stylesheet">
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="col-md-4">
          <img  src="/images/dlg.jpeg" class="img-circle" alt="Lights" style="width:40%">
    </div>
 <div align="center">
<h2 class="p1">

<ul>
	<li><a class="active" href="accomodation-display">View Accomodations</a></li>
	<li><a href="room-display">Rooms List</a></li>
	<li><a href="hotel-display">Hotel List</a></li>
	<li><a href="client-display">Client Services</a></li>
	<li><a href="bill-generation">Bill Generation</a></li>
	<li><a href="bookingPage">Customer page</a></li>
</ul>

</h2>
</div>
</body>
</html>