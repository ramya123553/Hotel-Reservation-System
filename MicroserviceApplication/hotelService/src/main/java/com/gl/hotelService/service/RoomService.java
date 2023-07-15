package com.gl.hotelService.service;

import java.util.List;

import com.gl.hotelService.bean.RoomDTO;


public interface RoomService {
	public void save(RoomDTO roomDTO);
	public List<RoomDTO> findAll();
	public RoomDTO findById(String id);
	public void deleteARoom(String roomId);
	public String GenerateRoomId(RoomDTO roomDTO);
}
