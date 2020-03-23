package com.studycool.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.studycool.model.User;
import com.studycool.model.UserDetails;
import com.studycool.service.LoanTypesService;
import com.studycool.service.UserService;
import com.studycool.service.impl.UserDetailsService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    
    @Autowired
    private UserDetailsService details;

    //@Secured({"ROLE_ADMIN", "ROLE_USER"})
    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value="/users", method = RequestMethod.GET)
    public List<User> listUser(){
        return userService.findAll();
    }

  
    
    //@Secured("ROLE_USER")
    @PreAuthorize("hasRole('USER')")
    ////@PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public User getOne(@PathVariable(value = "id") Long id){
        return userService.findById(id);
    }
    
    @RequestMapping(value="/signup", method = RequestMethod.POST)
    public ResponseEntity<?> saveUser(@RequestBody UserDetails user){
    	try {
    			return details.newUser(user);
        	
    	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value="/usersDetails", method = RequestMethod.GET)
    public List<UserDetails> listUserDetails(){
    	
    	List<UserDetails> list=details.getAllUsers();
        return list;
    }

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value="/usersDetails/{id}", method = RequestMethod.GET)
    public Optional<UserDetails> listUserDetails(@PathVariable("id") Long id){
    	
    	Optional<UserDetails> list=details.getUser(id);
        return list;
    }

}
