package com.studycool.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
@RequestMapping("/ui")
public class ViewController {
	
	
	@Autowired
	 HttpSession session;
	
	@GetMapping
	public String home() {
		
		return "login";
	}
	
;	@RequestMapping("/home")
	public String dashboard() {
		
		try {
			
			String token=(String)session.getAttribute("token");
			if(token==null) {
			
				return "redirect:/ui";
				
			}
			
			return "dashboard";
		} catch (Exception e) {
			e.printStackTrace();
			return "redirect:/ui";
		}
	}

	
	

	@RequestMapping("/loanCollections")
	public String loanCollections() {
		
		
		try {
			String token=(String)session.getAttribute("token");
			if(token==null) {
			
				return "redirect:/ui";
				
			}
			
			return "loanCollections";
		} catch (Exception e) {
			e.printStackTrace();
			return "redirect:/ui";
		}
	}
	
	
	@RequestMapping("/loanDetails")
	public String loanDetails() {
		
		
		try {
			String token=(String)session.getAttribute("token");
			if(token==null) {
			
				return "redirect:/ui";
				
			}
			return "loanDetails";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "redirect:/ui";
		}
	
	}
	
	@RequestMapping("/addLoan")
	public String addLoan() {
		try {
			
			String token=(String)session.getAttribute("token");
			if(token==null) {
			
				return "redirect:/ui";
				
			}
			return "addLoan";
		} catch (Exception e) {
			e.printStackTrace();
			return "redirect:/ui";
		}
		
		
	}
	
	@RequestMapping("/addLocation")
	public String addLocation() {
		
		try {
			String token=(String)session.getAttribute("token");
			if(token==null) {
			
				return "redirect:/ui";
				
			}
			return "addLocation";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "redirect:/ui";
		}
		
	}
	
	@RequestMapping("/locationDetails")
	public String locationDetails() {
		
		try {
			String token=(String)session.getAttribute("token");
			if(token==null) {
			
				return "redirect:/ui";
				
			}
			
			return "locationDetails";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "redirect:/ui";
		}
		
	}
	
	
	@RequestMapping("/addUser")
	public String addUser() {
		
		try {
			String token=(String)session.getAttribute("token");
			if(token==null) {
			
				return "redirect:/ui";
				
			}
			
			return "addUser";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "redirect:/ui";
		}
	
	}
	
	
	@RequestMapping("/addCustomer")
	public String addCustomer() {
		
		try {
			
			String token=(String)session.getAttribute("token");
			if(token==null) {
			
				return "redirect:/ui";
				
			}
			
			return "addCustomer";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "redirect:/ui";
		}
		
	}
	
	
	@RequestMapping("/nextCustomerAdd")
	public String nextCustomerAdd() {
		
		try {
			String token=(String)session.getAttribute("token");
			if(token==null) {
			
				return "redirect:/ui";
				
			}
			
			return "nextCustomerAdd";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "redirect:/ui";
		}
		
	}
	
	
	
	

	
	@RequestMapping("/customerDetails")
	public String customerDetails() {
		
		try {
			
			String token=(String)session.getAttribute("token");
			if(token==null) {
			
				return "redirect:/ui";
				
			}
			
			return "customerDetails";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "redirect:/ui";
		}
		
	}
	
	
	@RequestMapping("/userDetails")
	public  ModelAndView userDetails(ModelMap model,HttpSession session){
		
		
		try {
			
			String token=(String)session.getAttribute("token");
			if(token==null) {
			
				return new ModelAndView("login");
				
			}
			model.addAttribute("token","hai");
			
			///model.addAttribute("userType",u.getRole());
			return new ModelAndView("userDetails");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@GetMapping("/login/menu")
	public  ModelAndView menu(ModelMap model,HttpSession session){
		
	
		
		try {
			String token=(String)session.getAttribute("token");
			if(token==null) {
			
				return new ModelAndView("login");
				
			}
			 model.addAttribute("token","hai");
//		    /model.addAttribute("userType",u.getRole());
			return new ModelAndView("menu");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	


}
