package com.algodomain.techtask;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.algodomain.techtask.entity.Product;
import com.algodomain.techtask.repo.ProductRepo;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;

@SpringBootTest
class TechTaskApplicationTests {

	@Autowired
	ProductRepo productRepo;
	
	@Test
	@Order(1)	
	public void dbDefaultData() throws Exception {
		List<Product> arr = productRepo.findAll();
		assertEquals(8, arr.size());
		//System.out.println("passed CART data " + arr.toString());
		assertEquals(10000, arr.get(0).getAmount());
		assertEquals(29999, arr.get(1).getAmount());
	}
	
	@Test
	@Order(2)
	public void dbCategoryData() throws Exception{
		List<Product> arr = productRepo.findAll();
		Set<String> s = new HashSet<>();
		for(Product p:arr) {
			s.add(p.getCategory());
		}
		assertEquals(2, s.size());
	}
}
