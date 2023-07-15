<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bill Invoice</title>
<link rel="stylesheet" type="text/css" href="/css/bill.css">
</head>
<body>
<!--  <div align="center">
  <h2> 
	<br/><br/>Details
	<br/><br/>                  -->
	
	
	 <div class="invoice_container">
		<div class="invoice_header">
			<div class="logo_container">
		<!-- 	<link href="/css/dlg.css" rel="stylesheet"> -->
			 	<img src="../images/dlg.jpeg" width=200% > 
			</div>
			<div class="company_address">
				<h2>De Le Grande</h2>
				<p>
					ATTN: Grande, CEO <br>
					Bangalore <br>
					Karnataka, 560037
				</p>
			</div>
		</div>
		<div class="customer_container">
			<div>
				<h2>Billing To</h2>
				<h4><td>${bill.name}<h4><td>
				 <h5><td>${bill.address}</td></h5>
			<!--  	<p>
					  <br>
					Global Co. <br>
				</p>   -->
			</div>
			<div class="in_details">
				<h1 class="in_head">INVOICE</h1>
				<table> 
					<tr>
						<td>Date</td>
						<td>:</td>
						<td><b>${bill.checkOutDate}</b></td>
					</tr>	 
					</table>
			</div>
		</div>
	
	
<div class="product_container">
	<table class="item_table" border="1" cellspacing="0">
  <tr>
   <th>CNR. No.</th>
	<th>Name</th>
	<th>Room Id</th>
	<th>CheckIn Date</th>
	<th>CheckOut Date</th>
	<th>Room Rent</th>
	<th>Other Expenses</th>
	<th>Gst</th>
	<th>Total</th>
	</tr>
   
      <tr>
      <td>${bill.cnr}</td>
      <td>${bill.name}</td>
      <td>${bill.roomNumber}</td>
      <td>${bill.checkInDate}</td>
      <td>${bill.checkOutDate}</td>
      <td>${bill.roomAmount}</td>
      <td>${bill.expenseAmount}</td>
      <td>${bill.gst}</td>
      <td>${bill.totalAmount}</td>
     </tr>  
     
     <tr>
		<th colspan="7">Total</th>
		<th>${bill.gst}</th>
		<th>${bill.totalAmount}</th>
	</tr>
		</table>
	</div>
	<div class="invoice_footer">
			<div class="note">
				<h2>Thank You!</h2>
				<p>
					"My Definition of a Good Hotel is A Place I'd Stay @"
				</p>
				</div>
				<div class="invoice_footer_amount">
				<table class="amount_table"   cellspacing="0">
					<tr>
						<td>Grand Total</td>
						<td>: <b>${bill.totalAmount}</b></td>
					</tr>
					</table>
			</div>
		</div>		
  
</div>
</body>
</html>