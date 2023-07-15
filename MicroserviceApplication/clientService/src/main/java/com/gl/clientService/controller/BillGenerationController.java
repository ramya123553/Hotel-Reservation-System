package com.gl.clientService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.clientService.bean.BillGenerationDTO;
import com.gl.clientService.service.BillGenerationService;

@RestController
@RequestMapping("/billGeneration")
public class BillGenerationController {
@Autowired
private BillGenerationService billGenerationService;

@PostMapping(value="/bill",consumes=MediaType.APPLICATION_JSON_VALUE)
public String billingsave(@RequestBody BillGenerationDTO billGenerationDTO)
{
	billGenerationService.save(billGenerationDTO);
	return "Bill UPDATED";
}
}
