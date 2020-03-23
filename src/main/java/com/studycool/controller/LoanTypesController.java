package com.studycool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.studycool.model.LoanTypes;
import com.studycool.service.LoanTypesService;

@Controller
@RequestMapping("/loandetails")
public class LoanTypesController {
	
	@Autowired
	LoanTypesService loanSer;
		
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping
    public @ResponseBody ResponseEntity<?> saveCollection(@RequestBody LoanTypes col)
    {
    	try {
    		if(!loanSer.saveColl(col)) {
    			return new ResponseEntity<String>("Alredy exist or unable to insert", HttpStatus.OK);
    		}
			return new ResponseEntity<Boolean>(true, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<Boolean>(false, HttpStatus.NO_CONTENT);
		}
    }
	
	
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping
    public @ResponseBody ResponseEntity<?> getLoans()
    {
    	try {
    		
			return new ResponseEntity<List<LoanTypes>>(loanSer.getloans(), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<Boolean>(false, HttpStatus.NO_CONTENT);
		}
    }
	
	@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("{id}")
	public @ResponseBody ResponseEntity<?> deleteEntry(@PathVariable Long id)
	{
		try {
			return new ResponseEntity<Boolean>(loanSer.deleteEntry(id), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<Boolean>(false, HttpStatus.OK);
		}
	}
	@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/status/{id}/{status}")
	public @ResponseBody ResponseEntity<?> changeStatus(@PathVariable long id,@PathVariable boolean status)
	{
		System.out.println("Hello "+id+" "+status);
		try {		
			return new ResponseEntity<Boolean>(loanSer.changeStatus(id, status), HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<Boolean>(false, HttpStatus.OK);
		}
	}
}
