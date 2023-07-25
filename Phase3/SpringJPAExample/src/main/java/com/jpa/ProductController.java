package com.jpa;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductController {
    
    @Autowired
    ProductService productService;
    
    @GetMapping("/allproduct")
    public List<ProductEntity> getAllProduct(){
        return productService.getAllProduct();
    }
    
    @GetMapping("/product/{id}")
    public ProductEntity getProduct(@PathVariable int id){
        return productService.getProduct(id);
    }
    
    @PostMapping("/product")   //@REquestBody is used to read object from browser
    public void addProduct(@RequestBody ProductEntity pe ) {
        productService.addProduct(pe);
    }
    
    @PutMapping("/product/{id}")
    public void updateProduct(@PathVariable int id, @RequestBody ProductEntity pe ) {
        productService.updateProduct(id, pe);
    }   

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable int id)  {
        productService.deleteProduct(id);
    }
}
