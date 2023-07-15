package com.gl.clientService.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.clientService.bean.Booking;

@Service
public class BookingImpl implements BookingDao {
@Autowired
private BookingRepository repository;
	@Override
	public void save(Booking booking) {
		repository.save(booking);
	}

	@Override
	public List<Booking> findAll() {
		return repository.findAll();
	
	}

	@Override
	public Booking findById(String cnr) {
		return repository.getById(cnr);
		
	}
	
	
	@Override
	public String GenerateId(Booking booking) {
		 String va= booking.getHotelId();//H2
		String value=repository.findMaxRoomId(va);//H21002
		 
		  if(value==null) {
			  value=va+1001L;
		  }
		  else {
			  String sub=value.substring(2);
			  int v1=Integer.parseInt(sub);
			  v1++;  
			  value=va+v1;
		  }
		  return value;
		 }
	@Override
	public void bookingsavewithexpences(Booking booking) {
		 repository.save(booking);
	}

	
	}
	


