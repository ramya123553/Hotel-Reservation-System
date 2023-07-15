package com.gl.hotelService.bean;
 
public class HotelDTO {

	 private String hotelId;
	 private String hotelName;
	 
	public HotelDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HotelDTO(String hotelId, String hotelName) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
	}

	public HotelDTO(Hotel  hotel) {
		super();
		this.hotelId = hotel.getHotelId();
		this.hotelName = hotel.getHotelName();
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