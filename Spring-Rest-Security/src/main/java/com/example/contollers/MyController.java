package com.example.contollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyController {

	public MyController() {
		// TODO Auto-generated constructor stub
	}
	
	
	@GetMapping("/user/show")
	public String showMessage() {
		return "hello";
	}
	
	@GetMapping("/user/greet")
	public String greet() {
		return "Great Day";
	}
	
	@GetMapping("edit")
	public String editProduct() {
		return "edited";
	}
	
	@GetMapping("/add")
	public String addProduct() {
		return "added";
	}

}
