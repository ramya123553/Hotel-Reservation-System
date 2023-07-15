<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1" isELIgnored="false"%>
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
  <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<link href="/css/entry.css"rel="stylesheet">
<meta charset="ISO-8859-1">
<title>client_entry</title>
</head>
<body>
<div align="left">
<h1 style="color:brown">
<u><i>ENTER YOUR DETAILS</i></u>
</h1>
<br/><br/>
<form:form method="post" action="room-booking" modelAttribute="bookingRecord">
<h2>
<!--  
Select hotel location: 
<input type="radio" name="hotelId" value="H1"/>Bangalore(H1)
&nbsp;&nbsp;
<input type="radio" name="hotelId" value="H2"/>Chennai(H2)
&nbsp;&nbsp;
<input type="radio" name="hotelId" value="H3"/>Hyderabad(H3)
<br/><br/>
Select Room Type: 
<input type="radio" name="roomType" value="SB"/>SingleBedded
&nbsp;&nbsp;
<input type="radio" name="roomType" value="DB"/>DoubleBedded
&nbsp;&nbsp;
<input type="radio" name="roomType" value="ST"/>Suite
<br/><br/>   -->

Select Location:
<c:forEach  items="${hotelList}" var="hotel"> 
      <input type="radio" name="hotelId" value="${hotel.hotelId}"/>${hotel.hotelId}-${hotel.hotelName}
      &nbsp;&nbsp;
      </c:forEach>
<br/><br/>
Select RoomType:
<c:forEach  items="${accList}" var="acc">
      <input type="radio" name="roomType" value="${acc.accomId}"/>${acc.accomId}
      &nbsp;&nbsp;
     </c:forEach>
<br/><br/>
Enter Name:<form:input type="text" path="name" required="true"/>
<br/><br/>
Enter Address :<form:input type="text" path="address" required="true"/>
<br></br>
Enter Contact No:<form:input type="text" path="contactNumber" required="true"/>
<br/><br/>
Select Gender: 
<select name="Gender" >       
<option>Male</option>       
<option>Female</option>        
</select>
<br/><br/>
Enter Booking date:<form:input type="date" pattern="dd-MM-yyyy" path="bookingDate"/>
<br></br>
Enter CheckInDate:<form:input type="date" pattern="dd-MM-yyyy" path="checkInDate"/>
<br></br>
Enter CheckOutDate:<form:input type="date" pattern="dd-MM-yyyy" path="checkOutDate"/>
<br></br>
Enter RoomNo:<form:input type="text" path="roomNumber"/>
<br></br>
<input type="submit" style =
   "background: Brown;
   color: white;
   padding: 14px 14px;
   margin-top:30px;
   border-radius:10%;
   text-align: center;
   text-decoration: none;
   display: inline-block;" value="Submit"/>
</h2>
</form:form>
</div>
</body>
</html>