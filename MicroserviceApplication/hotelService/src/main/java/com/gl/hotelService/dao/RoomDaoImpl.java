package com.gl.hotelService.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.hotelService.bean.Room;

@Service
public class RoomDaoImpl implements RoomDao {

	@Autowired
	private RoomRepository repository;

	 @Override
	 public void save(Room room) {
		 repository.save(room);
	 }

	 @Override
	 public List<Room> findAll() {
		 return repository.findAll();
	 }

	 @Override
	 public Room findById(String id) {
	 return repository.getById(id);
	 }
	 @Override
	 public String GenerateRoomId(Room room) {
	   String va= room.getHotelId();
		  String value = repository.findMaxRoomId(va);
		//  String str="R1";
		  if(value==null) {
			  String str="R1";
			  value=va+str;
		  }
		  else {
			   
			  String sub=value.substring(3);
			  int v1=Integer.parseInt(sub);
	
		  v1++;
		  value=va+"R"+v1;
		  } 
		  return value;  
	 
		 }
	 @Override
	 public void deleteARoom(String id) {
		 repository.deleteById(id);
	 }
}