package com.gl.hotelService.bean;

import javax.persistence.*;


@Entity
public class Accomodation {
	@Id
	private String accomId;
	private String accomName;
	private Double fareAmount;
	public Accomodation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Accomodation(String accomId, String accomName, Double fareAmount) {
		super();
		this.accomId = accomId;
		this.accomName = accomName;
		this.fareAmount = fareAmount;
	}
	public Accomodation(AccomodationDTO accomodationDTO) {
		super();
		this.accomId = accomodationDTO.getAccomId();
		this.accomName = accomodationDTO.getAccomName();
		this.fareAmount = accomodationDTO.getFareAmount();
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
