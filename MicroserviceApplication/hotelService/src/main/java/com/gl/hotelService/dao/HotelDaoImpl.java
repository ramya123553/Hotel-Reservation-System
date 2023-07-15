package com.gl.hotelService.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.hotelService.bean.Hotel;

@Service
public class HotelDaoImpl implements HotelDao {

 @Autowired
 private HotelRepository repository;

 @Override
 public void save(Hotel hotel) {
	 repository.save(hotel);
 }

 @Override
 public void delete( String id) {
	 repository.deleteById(id);
 }

 @Override
 public List<Hotel> findAllHotels() {
	 return repository.findAll();
 }

 @Override
 public Hotel findHotelById(String id) {
	 return repository.getById(id);

 }
 @Override
 public String GenerateHotelId(){
 
			// TODO Auto-generated method stub
			String val=repository.findMaxHotelId();
			int value;
			if(val==null)
			{
				value=1;
			}
			else
			{
				value=Integer.parseInt(val.substring(1))+1;
				
			}
			String s="H"+String.valueOf(value);
			return s;
		}
 }
	 

