package com.sivadas.anand.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sivadas.anand.domain.Message;
import com.sivadas.anand.service.GreetingService;

@RestController
public class GreetingController {

	private final GreetingService greetingService;
	
	@Autowired
	public GreetingController(GreetingService greetingService) {
		
		this.greetingService = greetingService;
	}

	@RequestMapping(value="/getmessage", method=RequestMethod.GET, produces="application/json")
	public Message getMeessage(@RequestParam(required=true) String msg) {
		
		Message message = new Message();
		message.setMessage(msg);
		
		greetingService.applyGreetingRules(message);
		
		return message;
		
	}
	
}
