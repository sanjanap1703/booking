package com.sbp.booking.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class Controller {
	@GetMapping("/carpools")
	public String getCarpools()
	{
		return "hello";
	}
}

