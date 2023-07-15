package com.gl.hotelService.service;

import java.util.List;

import com.gl.hotelService.bean.HotelDTO;

 
public interface HotelService {
	 public void save(HotelDTO hotelDTO);
	 public void delete(String id);
	 public List<HotelDTO> findAll();
	 public HotelDTO findById(String id);
	 public String GenerateHotelId();

}