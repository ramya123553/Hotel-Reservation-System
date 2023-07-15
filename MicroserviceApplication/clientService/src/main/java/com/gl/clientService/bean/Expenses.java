package com.gl.clientService.bean;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Expenses {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long serialId;

 private String cnr;
 private String serviceType;
 private String date;
 private Double amount;
 
public Expenses() {
	super();
	// TODO Auto-generated constructor stub
}
public Expenses(Long serialId,String cnr, String serviceType, String date, Double amount) {
	super();
	this.serialId=serialId;
	this.cnr = cnr;
	this.serviceType = serviceType;
	this.date = date;
	this.amount = amount;
}
public Expenses(ExpensesDTO expensesDTO ) {
	super();
	this.serialId=expensesDTO.getSerialId();
	this.cnr = expensesDTO.getCnr();
	this.serviceType = expensesDTO.getServiceType();
	this.date = expensesDTO.getDate();
	this.amount = expensesDTO.getAmount();
}
 
public String getCnr() {
	return cnr;
}
public void setCnr(String cnr) {
	this.cnr = cnr;
}
public String getServiceType() {
	return serviceType;
}
public void setServiceType(String serviceType) {
	this.serviceType = serviceType;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public Double getAmount() {
	return amount;
}
public void setAmount(Double amount) {
	this.amount = amount;
}
public Long getSerialId() {
	return serialId;
}
public void setSerialId(Long serialId) {
	this.serialId = serialId;
}

}