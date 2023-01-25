package com.exp.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exp.shopping.entity.Product;
import com.exp.shopping.service.ProductService;

@RestController
@RequestMapping("/api/shopping")
public class ProductController {
	
	@Autowired
	private ProductService pservice;

	
	@GetMapping("/all")
	
	public ResponseEntity<?> getproducts(){
		
		List<Product>p=pservice.getAllProducts();
		
		return new ResponseEntity<>(p,HttpStatus.OK);
	}
	
	@GetMapping("/product/getProduct/{productId}")
	
	public ResponseEntity<?> getProductById(@PathVariable("productId") Integer id)
	{
		
	Product p1=pservice.getProductById(id);
	return new ResponseEntity<>(p1,HttpStatus.OK);
	}
	
	
	@PostMapping("/product")
	public ResponseEntity<?>addProduct(@RequestBody Product product)
	{
		Product p3=pservice.addproduct(product);
		return new ResponseEntity<>(p3,HttpStatus.CREATED);
	}

}
