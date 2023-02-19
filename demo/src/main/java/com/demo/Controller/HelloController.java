package com.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	//@RequestMapping(value="/",method=RequestMethod.GET)
	@GetMapping("/")
	 
	public String HelloMapping() {
		return "Hello Spring Boot Application";
	}

}
