package com.gl.hotelService.bean;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Hotel{
	@Id

	private String hotelId;
	private String hotelName;
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(String hotelId, String hotelName) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
	}
	public Hotel(HotelDTO hotelDTO) {
		super();
		this.hotelId = hotelDTO.getHotelId();
		this.hotelName = hotelDTO.getHotelName();
	}
	
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	

  
  

}