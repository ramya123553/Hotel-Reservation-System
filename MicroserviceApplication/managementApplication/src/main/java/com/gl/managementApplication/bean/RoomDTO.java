package com.gl.managementApplication.bean;

public class RoomDTO {
	
	private String roomId;
	private String hotelId;
	private String roomType;
	private String roomStatus="V";
	public RoomDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RoomDTO(String roomId, String hotelId, String roomType, String roomStatus) {
		super();
		this.roomId = roomId;
		this.hotelId = hotelId;
		this.roomType = roomType;
		this.roomStatus = roomStatus;
	}
	
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getRoomStatus() {
		return roomStatus;
	}
	public void setRoomStatus(String roomStatus) {
		this.roomStatus = roomStatus;
	}
	
}
