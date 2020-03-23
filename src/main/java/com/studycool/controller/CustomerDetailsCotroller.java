package com.studycool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.studycool.model.CustomerDetails;
import com.studycool.service.CustomerDetailsService;

@Controller
@RequestMapping("/customerdetails")
public class CustomerDetailsCotroller {

	@Autowired
	CustomerDetailsService cusSer;
	// Method to save the customer details.
	@PostMapping
	public ResponseEntity<?> saveCustDetails(@RequestBody CustomerDetails cust)
	{
		try {
			return new ResponseEntity<Object>(cusSer.saveCust(cust), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<Boolean>(false, HttpStatus.OK);
		}
	}
	
	@GetMapping
	public ResponseEntity<?> getCustomers()
	{
		try {
			return new ResponseEntity<List<CustomerDetails>>(cusSer.getCustomerList(), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<Boolean>(false, HttpStatus.OK);
		}
	}
	
}
