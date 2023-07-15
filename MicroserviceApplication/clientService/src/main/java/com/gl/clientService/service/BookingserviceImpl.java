package com.gl.clientService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.gl.clientService.bean.Booking;
import com.gl.clientService.bean.BookingDTO;
import com.gl.clientService.dao.BookingDao;
import com.gl.clientService.dao.BookingRepository;
@Service
@Repository
public class BookingserviceImpl implements BookingService {
@Autowired
private BookingDao roomBookDao;
@Autowired
private BookingRepository roomBookingRepository;
	@Override
	public void save(BookingDTO bookingDTO) {
		Booking roomBooking=new Booking(bookingDTO);
		roomBookDao.save(roomBooking);
				
	}

	@Override
	public List<BookingDTO> findAll() {
		// TODO Auto-generated method stub
		List<BookingDTO>bookingList=new ArrayList<>();
		for(Booking booking:roomBookDao.findAll())
		{
			BookingDTO roomBookinDTO=new BookingDTO(booking);
			bookingList.add(roomBookinDTO);
		}
		return bookingList;
	}

	@Override
	public BookingDTO findById(String cnr) {
		// TODO Auto-generated method stub
		return new BookingDTO(roomBookDao.findById(cnr)) ;
	}
	@Override
	public String GenerateId(BookingDTO bookingDTO) {
		 String va= bookingDTO.getHotelId();//H2
		String value=roomBookingRepository.findMaxRoomId(va);//H21002
		 
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
	public void bookingsavewithexpences(BookingDTO bookingDTO) {
		Booking roomBooking=new Booking(bookingDTO);
		roomBookDao.save(roomBooking);	 
	}
}


