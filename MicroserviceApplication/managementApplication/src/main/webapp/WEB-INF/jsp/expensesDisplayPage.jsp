<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
     <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<link href="/css/background.css" rel="stylesheet">
<meta charset="UTF-8">
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
<title>ClientDisplayPage</title>
</head>
<body>
 
<div align="center">
<h3>
<h1 style="color:DarkOliveGreen">
<u><i>Client_Services</i></u>
</h1>
<div>
<a href="/super/expenses-entry" style =
			  "background: DarkBlue;
			  color: white;
			  padding: 14px 25px;
			  margin-top:20px;
			  text-align: center;
			  text-decoration: none;
			  display: inline-block;">Add Service Type</a>
			  </div>
<br/>
 <table border="2">
 <tr>
     <th>CNR</th>
    <th>Service Type</th>
    <th>Date</th>
    <th>Amount</th>
    </tr>
    <c:forEach items="${expensesList}" var="Expenses">
      <tr>
      <td>${Expenses.cnr}</td>
   <td>${Expenses.serviceType}</td>
   <td>${Expenses.date}</td>
   <td>${Expenses.amount}</td>
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