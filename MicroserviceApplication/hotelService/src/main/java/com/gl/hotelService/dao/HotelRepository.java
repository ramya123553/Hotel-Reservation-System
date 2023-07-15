package com.gl.hotelService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gl.hotelService.bean.Hotel;


@Repository

public interface HotelRepository extends JpaRepository<Hotel, String> {
	@Query("select max(id) from Hotel")
	public String findMaxHotelId();
	
	@Query("select max(hotelId) from Hotel")
	public String finddeleteHotelId();

	 
}

