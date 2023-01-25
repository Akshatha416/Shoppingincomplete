package com.exp.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exp.shopping.entity.Product;
import com.exp.shopping.repository.ProductRepository;

@Service
public class ProductServiceimp implements ProductService{

	
@Autowired
private ProductRepository prepo;

@Override
public Product addproduct(Product product) {
	
	   
	return prepo.save(product);
}

@Override
public Product getProductById(Integer pid) {
	
	
	return prepo.findById(pid).get();
}

@Override
public List<Product> getAllProducts() {

	return prepo.findAll();
}

@Override
public List<Product> searchByName(String Pname) {
	return prepo.getProductByName(Pname);
}

@Override
public String deleteProductById(Integer id) {
	//if(prepo.findById(id).isPresent())
		//prepo.deleteById(id);
	prepo.deleteById(id);
	return "Product deleted Sucessfully";
}

@Override
public Product updateProductById(Product product, Integer pid) {
	
	if(prepo.findById(pid).isPresent())
		
		product.setId(pid);
		return prepo.save(product) ;
		
	
}



}
