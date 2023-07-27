package com.template;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class MainController {

		@GetMapping("/info")
        public Product display() {
        	RestTemplate resttemplate=new RestTemplate();
        	Product p=resttemplate.getForObject("http://localhost:8081/productinfo", Product.class);
        	//return p.toString();
        	return p;
		}
           
        
}
