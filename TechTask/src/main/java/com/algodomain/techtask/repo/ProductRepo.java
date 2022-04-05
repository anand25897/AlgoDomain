package com.algodomain.techtask.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algodomain.techtask.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
	
	Product findByName(String name);
	
	List<Product> findByAddedBy(String addedBy);
	
	List<Product> findByCategory(String category);
	
	Product findByCategoryType(String categoryType);
	
	List<Product> findByAmountBetween(Double low, Double high);
	
}
