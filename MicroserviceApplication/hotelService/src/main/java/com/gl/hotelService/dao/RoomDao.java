package com.gl.hotelService.dao;

import java.util.List;

import com.gl.hotelService.bean.Room;
 
public interface RoomDao {
	 public void save(Room room);
	 public String GenerateRoomId(Room room);
	 public List<Room> findAll();
	 public Room findById(String id);
	 public void deleteARoom(String roomId);

}