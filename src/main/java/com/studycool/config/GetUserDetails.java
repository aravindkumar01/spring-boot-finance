package com.studycool.config;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class GetUserDetails {

	Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	{
	if (principal instanceof UserDetails) {
	@SuppressWarnings("unused")
	String username = ((UserDetails)principal).getUsername();
	} else {
	@SuppressWarnings("unused")
	  String username = principal.toString();
	}
	}
}
