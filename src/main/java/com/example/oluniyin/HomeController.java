package com.example.oluniyin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author gyebadokpo.ext
 *
 */
@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "Hello, Spring boot";
	}
}
