package com.techelevator.validation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.validation.model.Login;
import com.techelevator.validation.model.Registration;

@Controller
public class UserController {

	@RequestMapping(path="/", method=RequestMethod.GET)
	public String getMainScreen() {
		return "homePage";
	}

	@RequestMapping(path="/register", method=RequestMethod.GET)
	public String showRegistration(ModelMap map) {
		
		if(! map.containsAttribute("register")) {
			map.addAttribute("register", new Registration());
		}
		
		return "register";
	}

	@RequestMapping(path="/register", method=RequestMethod.POST)
	public String handleRegistration(@Valid @ModelAttribute("register") Registration registration, 
										BindingResult result) {
		
		if(result.hasErrors()) {
			return "register"; 
		}
		return "redirect:/registerConfirmation";
	}

	@RequestMapping(path="/registerConfirmation", method=RequestMethod.GET)
	public String getRegisterConfirmation() {
		return "registerConfirmation";
	}
	
	@RequestMapping(path="/login", method=RequestMethod.GET)
	public String showLogin(ModelMap map) {
		
		if(! map.containsAttribute("login")) {
			map.addAttribute("login", new Login());
		}
		
		return "login";
	}

	@RequestMapping(path="/login", method=RequestMethod.POST)
	public String handleLogin(@Valid @ModelAttribute("login") Login login, BindingResult result) {
		
		if(result.hasErrors()) {
			return "login"; 
		}
		return "redirect:/loginConfirmation";
	}
	
	@RequestMapping(path="/loginConfirmation", method=RequestMethod.GET)
	public String getLoginConfirmation() {
		return "loginConfirmation";
	}

}