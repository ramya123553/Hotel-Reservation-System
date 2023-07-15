package com.gl.hotelService.dao;

import java.util.List;

import com.gl.hotelService.bean.Hotel;


public interface HotelDao {
	 public void save(Hotel hotel);
	 public void delete(String id);
	 public List<Hotel> findAllHotels();
	 public Hotel findHotelById(String id);
	 public String GenerateHotelId();
	 

}