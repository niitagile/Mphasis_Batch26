package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	//@RequestMapping(value="hello",method="get")
	@GetMapping("/")
	public String getMessage() {
		return "Hello All";
	}
	@GetMapping("/product/{id}")
	public String getProduct(@PathVariable("id")int id) {
		if(id==1)
			return "Product Found";
		else
			//return "Product not found";
			throw new ProductException();
	}

}
