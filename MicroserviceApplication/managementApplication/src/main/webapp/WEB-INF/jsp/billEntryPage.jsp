<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<link href="/css/background.css" rel="stylesheet">
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
<div align="center">

<h1 style="color:orange">
<u><i>Bill Entry</i></u>
</h1>
<br/><br/>
<form method="post" action="billEntry">
<h2 style = "color:Black;">
Enter CNR :<input type="text" name="cnr" required="true" />
<br/><br/>
<!--  <input type="submit" value="Submit"/> -->
<button type="submit" class ="button button1"> Submit</button>

</h2>
</form>
</div>
</body>
</html>