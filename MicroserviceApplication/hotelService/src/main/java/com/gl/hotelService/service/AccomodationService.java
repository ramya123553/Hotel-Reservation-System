package com.gl.hotelService.service;

import java.util.List;

import com.gl.hotelService.bean.AccomodationDTO;


public interface AccomodationService {

	public void save( AccomodationDTO accomodationDTO);
	public List<AccomodationDTO> findAll();
	public AccomodationDTO findByid(String id);
	

}
