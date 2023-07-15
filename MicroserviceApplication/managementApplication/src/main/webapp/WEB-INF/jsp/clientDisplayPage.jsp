<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
     <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
table {
 border-collapse: collapse;
 width: 100%;
}
th, td {
 text-align: left;
 padding: 8px;
}
tr:nth-child(even) {
 background-color: #D6EEEE;
}
</style>

<title>ClientDisplayPage</title>
<link href="/css/background.css"rel="stylesheet">
</head>
<body>
 
<div align="center">
<h3>
<h1 style="color:  DarkOliveGreen">
<u><i>All Accomodations</i></u>
</h1>
<br/>
 <table border="2">
 <tr>
     <th>CNR</th>
    <th>Name</th>
    <th>Address</th>
    <th>ContactNo</th>
    <th>Gender</th>
    <th>BookingDate</th>
    <th>CheckinDate</th>
    <th>CheckoutDate</th>
    <th>RoomNo</th>
    <th>Paystatus</th>
    </tr>
    <c:forEach items="${roomList}" var="roomBooking">
      <tr>
      <td>${roomBooking.cnr}</td>
      <td>${roomBooking.name}</td>
      <td>${roomBooking.address}</td>
      <td>${roomBooking.contactNumber}</td>
      <td>${roomBooking.gender}</td>
      <td>${roomBooking.bookingDate}</td>
      <td>${roomBooking.checkInDate}</td>
      <td>${roomBooking.checkOutDate}</td>
      <td>${roomBooking.roomNumber}</td>
      <td>${roomBooking.payStatus}</td>
      </tr>
     </c:forEach>
  </table>
</h2>
<div>
<a href="/client/index" style =
   "background-color:Brown;
   border-radius:10%;
   color: white;
   padding: 14px 25px;
   margin-top:30px;
   text-align: center;
   text-decoration: none;
   display: inline-block;">Home</a>
</div>

</body>
</html>