<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
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
<u><i>New Accomodation Entry</i></u>
</h1>
<br/><br/>
<form:form method="post" action="accomodation" modelAttribute="accomodationRecord">
<h2 style = "color:white">

Enter Accomodation ID:<form:input type="text" path="accomId" required="true"/>
<br/><br/>
Enter Accomodation Name:<form:input type="text" path="accomName" required="true"/>
<br/><br/>
Enter Fare Amount/Day:<form:input type="text" path="fareAmount" required="true"/>
<br/><br/>

<input type="submit" class ="button button1" value="Submit"/>

</h2>

</form:form>

</div>
</body>
</html>