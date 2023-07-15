package com.gl.hotelService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.hotelService.bean.RoomDTO;
import com.gl.hotelService.service.RoomService;

@RestController
@RequestMapping("roomaddition")
public class RoomController {
	
	 @Autowired
	 private RoomService roomService;

	 @GetMapping(value="/room",produces=MediaType.APPLICATION_JSON_VALUE)
	 public List<RoomDTO> showAllRooms(){
		 return roomService.findAll();
	 }

	 @GetMapping(value="/room/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	 public RoomDTO findRoomById(@PathVariable String id){
		 return roomService.findById(id);
	 }

	 @PostMapping(value="/room",consumes=MediaType.APPLICATION_JSON_VALUE)
	 public String saveRoom(@RequestBody RoomDTO roomDTO) {
		 String id=roomService.GenerateRoomId(roomDTO);
		 roomDTO.setRoomId(id);
		 roomService.save(roomDTO);
		 return "Room Accepted";

	 }
	 
	 @DeleteMapping(value="/room/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	 public String deleteRoomById(@PathVariable String id){
		 roomService.deleteARoom(id);
		 return "Hotel Deleted";
	 }


}
