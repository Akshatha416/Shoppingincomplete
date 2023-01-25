package com.exp.shopping.service;

import java.util.List;

import com.exp.shopping.entity.Product;

public interface ProductService {

	
	Product addproduct(Product product);
	
	Product getProductById(Integer pid);
	
	List<Product> getAllProducts();
	List<Product> searchByName(String Pname);
	String deleteProductById(Integer id);
	
	Product updateProductById(Product product, Integer pid);
}
