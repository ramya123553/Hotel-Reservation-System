package com.gl.clientService.controller;
import org.springframework.http.MediaType;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.clientService.bean.BookingDTO;
import com.gl.clientService.service.BookingService;

@RestController
@RequestMapping("/roombooking")
public class BookingController {
	@Autowired
	private BookingService bookingService;
	
	@GetMapping(value="/clients",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<BookingDTO> findAll()	
	{
		return  bookingService.findAll();
	}
	
	@GetMapping(value="/clients/{cnr}",produces=MediaType.APPLICATION_JSON_VALUE)
	public BookingDTO findBookingById(@PathVariable String cnr)
	{
		return  bookingService.findById(cnr);
	}
	
	@PostMapping(value="/clients",consumes=MediaType.APPLICATION_JSON_VALUE)
	public String bookingsave(@RequestBody BookingDTO bookingDTO)
	{
		String id=bookingService.GenerateId(bookingDTO);
		bookingDTO.setCnr(id);
		bookingService.save(bookingDTO);
		return "Book saved";
	}
	@PostMapping(value="/client",consumes=MediaType.APPLICATION_JSON_VALUE)
	public String bookingsavewithexpences(@RequestBody BookingDTO bookingDTO)
	{
		bookingService.save(bookingDTO);
		return "Book UPDATED";
	}
	@PutMapping(value="/expensesput/{cnr}",consumes=MediaType.APPLICATION_JSON_VALUE)
	public String edit(@PathVariable String cnr,@RequestBody BookingDTO patientDTO) {
		BookingDTO patient=bookingService.findById(cnr);
		patient.setAmountPayable(patientDTO.getAmountPayable());
		bookingService.save(patient);
		return "Booking Editted";
	}
	
	
}
