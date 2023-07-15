package com.gl.hotelService.bean;

public class AccomodationDTO {
	
	private String accomId;
	private String accomName;
	private Double fareAmount;
	public AccomodationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccomodationDTO(String accomId, String accomName, Double fareAmount) {
		super();
		this.accomId = accomId;
		this.accomName = accomName;
		this.fareAmount = fareAmount;
	}
	public AccomodationDTO(Accomodation accomodation) {
		super();
		this.accomId = accomodation.getAccomId();
		this.accomName = accomodation.getAccomName();
		this.fareAmount = accomodation.getFareAmount();
	}
	public String getAccomId() {
		return accomId;
	}
	public void setAccomId(String accomId) {
		this.accomId = accomId;
	}
	public String getAccomName() {
		return accomName;
	}
	public void setAccomName(String accomName) {
		this.accomName = accomName;
	}
	public Double getFareAmount() {
		return fareAmount;
	}
	public void setFareAmount(Double fareAmount) {
		this.fareAmount = fareAmount;
	}
	
}
