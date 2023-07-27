package com.template;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	
	@GetMapping("/productinfo")
	public Product getProduct() {
		Product product=new Product();
		product.setPid("10");
		product.setProdname("Sugar");
		return product;
	}
	
	

}
