package com.algodomain.techtask.api;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.algodomain.techtask.entity.Product;

import com.algodomain.techtask.repo.ProductRepo;

@RestController
@RequestMapping("/customer")
public class CustomerApi {

	@Autowired
	ProductRepo productRepo;
	
	
	@GetMapping("/byName")
	ResponseEntity<Product> findByName(@RequestParam String name){
		System.out.println("name "+name);
		Product product = productRepo.findByName(name);
		//System.out.println("Product " +product);
		if(product != null)
			return new ResponseEntity<Product>(product, HttpStatus.OK);
		return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/byCategory")
	ResponseEntity<List<Product>> findByCategory(@RequestParam String category){
		System.out.println("Category "+category);
		List<Product> product = productRepo.findByCategory(category);
		//System.out.println("Product " +product);
		if(product != null)
			return new ResponseEntity<List<Product>>(product,HttpStatus.OK);
		return new ResponseEntity<List<Product>>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/byRange")
	ResponseEntity<List<Product>> findAllProductBetween(@RequestParam Double min, @RequestParam Double max){
		List<Product> product = productRepo.findByAmountBetween(min, max);
		if(product != null)
			return new ResponseEntity<List<Product>>(product,HttpStatus.OK);
		return new ResponseEntity<List<Product>>(HttpStatus.NOT_FOUND);
	}
}
