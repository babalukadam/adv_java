package com.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.Product;
import com.demo.service.ProductService;

@CrossOrigin(origins = "*")
//need to find out but in my point of view this is for i think to connect the react 
@RestController
//need to find out
@RequestMapping("/product")
//this will show you on the html page 
public class ProductController {
	
	@Autowired
	//shift all the controll to the product servuce layeer
	ProductService productService;
	
	@GetMapping("/products")
	//this is also mapping when we chose the above anotation whis is product so it will shift you to directly to 
	public ResponseEntity<List<Product>> displayAll() {
		List<Product> plist=productService.getAllProduct();
		return ResponseEntity.ok(plist);
		
	
	}
	@GetMapping("/products/{pid}")
	//find out why the get mapping is use why the pid is also given in anotation 
	public ResponseEntity<Product> displayById(@PathVariable int pid) {
		Product p=productService.getById(pid);
		if(p!=null) {
			return new ResponseEntity(p,HttpStatus.OK);
		}
		return new ResponseEntity(HttpStatus.NOT_FOUND);
		
	
	}
		
	@PostMapping("/products/{pid}")
	
	public ResponseEntity<String> addProduct(@Valid @RequestBody Product p) {
		productService.addnewProduct(p);
		return new ResponseEntity("Data added successfully"+p.getPid(),HttpStatus.CREATED);
	}
	
		
	@PutMapping("/products/{pid}")
	public ResponseEntity<String> updateProduct(@RequestBody Product p) {
		int n=productService.updateProduct(p);
		if(n>0)
		   return new ResponseEntity("Data added successfully"+p.getPid(),HttpStatus.CREATED);
		else
		   return new ResponseEntity(HttpStatus.BAD_REQUEST);
	}
	
	@DeleteMapping("/products/{pid}")
	public ResponseEntity<String> deleteProduct(@PathVariable int pid) {
//		find the use of @pathVeriable
		productService.deleteById(pid);
		return new ResponseEntity("Data deleted successfully-->"+ pid,HttpStatus.OK);
		
	}
	

}
