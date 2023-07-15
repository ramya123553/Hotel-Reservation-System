package com.gl.managementApplication.bean;

public class ExpensesDTO {
	 private String cnr;
	 private String serviceType;
	 private String date;
	 private Double amount;
	 public ExpensesDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExpensesDTO(String cnr, String serviceType, String date, Double amount) {
		super();
		this.cnr = cnr;
		this.serviceType = serviceType;
		this.date = date;
		this.amount = amount;
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
	
}

