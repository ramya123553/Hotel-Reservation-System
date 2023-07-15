<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link href="/css/background.css"rel="stylesheet">
<style>
table {
  border-collapse: collapse;
  width: 80%;
}

th, td {
  text-align: center;
  padding: 8px;
}

tr:nth-child(even) {
  background: DarkGrey;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center">
<div class="col-md-4">
          <img  src="/images/dlg.jpeg" class="img-circle" alt="Lights" style="width:10%">
          
    </div>
<h3>
<h1 style="color:DarkOliveGreen">
<u><i>Hotels List</i></u>
</h1>
<div>
<a href="/super/hotel-entry" style =
			  "background: DarkBlue;
			  color: white;
			  padding: 14px 25px;
			  margin-top:20px;
			  text-align: center;
			  text-decoration: none;
			  display: inline-block;">Add Hotel</a>
			   </div>
<br/>
 <table class="myTable" border="2">
 
 <tr>
    <th>Hotel Id</th>
    <th>Hotel Name</th>
    <th>Action</th>
    </tr>
    <c:forEach items="${hotelList}" var="hotel">
      <tr>
      <td>${hotel.hotelId}</td>
      <td>${hotel.hotelName}</td>
      
      <td><h3>
      
      &nbsp;&nbsp;<a href="hotel-delete/${hotel.hotelId}">Delete</a> 
      
      </h3></td>
       
      </tr>
     </c:forEach>
  </table>
</h2>
<a href="/super/index" style =
			  "background: DarkBlue;
			  color: white;
			  padding: 14px 14px;
			  margin-top:30px;
			  text-align: center;
			  text-decoration: none;
			  display: inline-block;">Home</a>
</div>
</body>
</html>