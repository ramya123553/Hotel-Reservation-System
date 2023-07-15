<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<link href="/css/hdisplay.css"rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<style>
input[type=text] {
  width: 30%;
  padding: 12px 20px;
  margin: 5px 0;
  box-sizing: border-box;
  border: 2px black;
  border-radius: 4px;
   background-color: AliceBlue;
  color: black;
}
 
.button {
  background-color:Gold; 
  border: none;
  color: black;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
  border-radius: 10px;
  -webkit-transition-duration: 0.4s; /* Safari */
  transition-duration: 0.4s;
}

.button1:hover {
  box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24),0 17px 50px 0 rgba(0,0,0,0.19);
}
</style>
<div align="left">
<h1 style="color:orange">
<u><i>Add Hotel</i></u>
</h1>
<br/><br/>
<form:form method="post" action="hotel-addition" modelAttribute="hotelRecord">
<h2 style = "color:white;">
 
Enter Hotel Name:<form:input type="text" path="hotelName" required="true"/>
<br/><br/>
 
<!--  <input type="submit" value="Submit"/> -->
<button type="submit" class ="button button1"> Submit</button>

</h2>

</form:form>

</div>

</body>
</html>