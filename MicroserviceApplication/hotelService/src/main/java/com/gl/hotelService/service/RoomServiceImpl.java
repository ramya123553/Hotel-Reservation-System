package com.gl.hotelService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.gl.hotelService.bean.Room;
import com.gl.hotelService.bean.RoomDTO;
import com.gl.hotelService.dao.RoomDao;
import com.gl.hotelService.dao.RoomRepository;
@Repository
@Service
public class RoomServiceImpl implements RoomService {
	@Autowired
	private RoomDao roomDao;
	@Autowired
	private RoomRepository repository;
	
	@Override
	public void save(RoomDTO roomDTO) {
		roomDao.save(new Room(roomDTO));
	}

	@Override
	public List<RoomDTO> findAll() {
		List<RoomDTO>roomList=new ArrayList<>();
		for(Room room:roomDao.findAll())
		{
			RoomDTO roomDTO=new RoomDTO(room);
			roomList.add(roomDTO);
		}
		return roomList;
	}

	@Override
	public RoomDTO findById(String id) {
		return new RoomDTO(roomDao.findById(id));
	}
	@Override
	 public void deleteARoom(String roomId) {
		roomDao.deleteARoom(roomId);
	 }
	 @Override
	 public String GenerateRoomId(RoomDTO roomDTO) {
	   String va= roomDTO.getHotelId();
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

}
