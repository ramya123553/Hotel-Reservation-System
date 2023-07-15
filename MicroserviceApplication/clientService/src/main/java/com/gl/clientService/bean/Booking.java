package com.gl.clientService.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Booking {
	@Id
	private String cnr;
	private String name;
	private String address;
	private String contactNumber;
	private String gender;
	private String hotelId;
	private String bookingDate;
	private String checkInDate;
	private String checkOutDate;
	private String roomNumber;
	private String payStatus="Pending";
	private String roomType;
	private Double AmountPayable;
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(String cnr, String name, String address, String contactNumber, String gender, String hotelId,
			String bookingDate, String checkInDate, String checkOutDate, String roomNumber, String payStatus,
			String roomType, Double amountPayable) {
		super();
		this.cnr = cnr;
		this.name = name;
		this.address = address;
		this.contactNumber = contactNumber;
		this.gender = gender;
		this.hotelId = hotelId;
		this.bookingDate = bookingDate;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.roomNumber = roomNumber;
		this.payStatus = payStatus;
		this.roomType = roomType;
		AmountPayable = amountPayable;
	}
	public Booking(BookingDTO BookingDTO) {
		super();
		this.cnr = BookingDTO.getCnr();
		this.name = BookingDTO.getName();
		this.address = BookingDTO.getAddress();
		this.contactNumber = BookingDTO.getContactNumber();
		this.gender = BookingDTO.getGender();
		this.bookingDate = BookingDTO.getBookingDate();
		this.checkInDate = BookingDTO.getCheckInDate();
		this.checkOutDate = BookingDTO.getCheckOutDate();
		this.roomNumber = BookingDTO.getRoomNumber();
		this.payStatus = BookingDTO.getPayStatus();
		this.hotelId=BookingDTO.getHotelId();
		this.roomType = BookingDTO.getRoomType();
		AmountPayable = BookingDTO.getAmountPayable();
		
	}
	public String getCnr() {
		return cnr;
	}
	public void setCnr(String cnr) {
		this.cnr = cnr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}
	public String getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public Double getAmountPayable() {
		return AmountPayable;
	}
	public void setAmountPayable(Double amountPayable) {
		AmountPayable = amountPayable;
	}
		}

	