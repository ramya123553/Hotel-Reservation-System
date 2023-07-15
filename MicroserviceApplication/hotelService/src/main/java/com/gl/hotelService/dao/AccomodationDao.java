package com.gl.hotelService.dao;

import java.util.List;

import com.gl.hotelService.bean.Accomodation;


public interface AccomodationDao {
	public void save( Accomodation accomodation);
	public List<Accomodation> findAll();
	public Accomodation findByid(String accomId);
	
}
