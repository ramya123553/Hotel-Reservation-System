package com.gl.clientService.bean;

public class ExpensesDTO {
	private Long serialId;
	 private String cnr;
	 private String serviceType;
	 private String date;
	 private Double amount;
	 public ExpensesDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExpensesDTO(Long serialId,String cnr, String serviceType, String date, Double amount) {
		super();
		this.serialId=serialId;
		this.cnr = cnr;
		this.serviceType = serviceType;
		this.date = date;
		this.amount = amount;
	}
	public ExpensesDTO(Expenses expenses) {
		super();
		this.serialId=expenses.getSerialId();
		this.cnr = expenses.getCnr();
		this.serviceType = expenses.getServiceType();
		this.date = expenses.getDate();
		this.amount = expenses.getAmount();
	}
	 
	public Long getSerialId() {
		return serialId;
	}
	public void setSerialId(Long serialId) {
		this.serialId = serialId;
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

