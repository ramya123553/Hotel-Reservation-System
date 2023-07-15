package com.gl.clientService.dao;

import java.util.List;


import com.gl.clientService.bean.Booking;


public interface BookingDao {
	public void save(Booking booking);
	public List<Booking> findAll();
	public Booking findById(String cnr);
	public String GenerateId(Booking booking);
	public void bookingsavewithexpences(Booking booking);
	
	
}
