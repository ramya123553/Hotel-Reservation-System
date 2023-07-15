package com.gl.managementApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gl.managementApplication.api.ClientApi;
import com.gl.managementApplication.api.HotelApi;
import com.gl.managementApplication.bean.AccomodationDTO;
import com.gl.managementApplication.bean.BookingDTO;
import com.gl.managementApplication.bean.ExpensesDTO;
import com.gl.managementApplication.bean.HotelDTO;

@RestController
@RequestMapping("/client")
public class ClientController {
	@Autowired
	private ClientApi clientApi;
	@Autowired
	private HotelApi hotelApi;
	
	@GetMapping("/index")
	public ModelAndView showIndexPage() {
		return new ModelAndView("clientIndex");
	}
	
	
	
	@GetMapping("/client-book")
	public ModelAndView clientEntryPage() {
		BookingDTO roomBooking=new BookingDTO();
		List<HotelDTO> hotelList=hotelApi.findAllHotels();
		List<AccomodationDTO> accList=hotelApi.showAllAccomodations();
		ModelAndView mv=new ModelAndView("clientEntryPage");
		mv.addObject("hotelList",hotelList);
		mv.addObject("accList",accList);
		mv.addObject("bookingRecord",roomBooking);
		return mv;
	}
	
	@PostMapping("/room-booking")
	 public ModelAndView clientEntrySave(@ModelAttribute("bookingRecord") BookingDTO roomBooking) {
		//String str=roomBooking.getContactNumber().trim();
		//if(str.)
		clientApi.bookingsave(roomBooking);
		ModelAndView mv= new ModelAndView("clientDisplayPage");
		List<BookingDTO> bookList=clientApi.findAll();
		mv.addObject("roomList",bookList);
		return mv;
	 }
	
	
	
	
	
	/*
	@ExceptionHandler(value = ContactNumberException.class)
	public ModelAndView handlingFeeException (ContactNumberException exception) {
	String message="Invalid Mobile Number";
	ModelAndView mv=new ModelAndView("errorShow") ;
	mv.addObject ("errorMessage" ,message) ;
	return mv;
	}*/
}
