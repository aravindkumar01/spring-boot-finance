package com.studycool.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.studycool.DTO.CustomerDTO;
import com.studycool.service.CustomerDetailsDTOService;

@Controller
@RequestMapping("/new-customer")
public class CustomerDTOController {
	
	@Autowired
	CustomerDetailsDTOService cusDtoSer;
	// Method to save the customer details.
	@PostMapping
	public ResponseEntity<?> saveCustDetails(@RequestBody CustomerDTO cust)
	{
		try {
			
			return new ResponseEntity<Map<String,String>>(cusDtoSer.saveCust(cust), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<Boolean>(false, HttpStatus.OK);
		}
	}

}
