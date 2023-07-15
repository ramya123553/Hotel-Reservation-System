<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html>
<head>
<link href="/css/hdisplay.css" rel="stylesheet">
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
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<div align="left">
<h1 style="color:orange">
<u><i>Accomodation Fare Updation</i></u>
</h1>
<br/><br/>
<form:form action="accomodation-edit" method="post" modelAttribute="accomodationRecord" >
<h2 style = "color:white">

Accomodation Id<form:input type="text" path="accomId" readonly="readonly"/>
<br/><br/>
Accomodation Name:<form:input type="text" path="accomName" readonly="readonly"/>
<br/><br/>
Enter New Fare/Day:<form:input type="text" path="fareAmount"/>
<br/><br/>
 
 <input type="submit" class ="button button1" value="Submit"/>
<!--  <button type="submit"> Submit</button> -->
 </h2>
</form:form>
</div>

</body>
</html>