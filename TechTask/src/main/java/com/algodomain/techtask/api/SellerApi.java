package com.algodomain.techtask.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.algodomain.techtask.entity.Product;
import com.algodomain.techtask.repo.ProductRepo;

@RestController
@RequestMapping("/seller")
public class SellerApi {

	@Autowired
	ProductRepo productRepo;
	
	
	@PostMapping("/addProduct")
	ResponseEntity<String> findByName(@RequestBody Product p){
		System.out.println("name "+p);
		Optional<Product> optional = productRepo.findById(p.getId());
		if(optional.isPresent())
			return new ResponseEntity<String>("Already Present Record with this id",HttpStatus.INTERNAL_SERVER_ERROR);
		Product pnew = new Product();
		//pnew.setId(p.getId());
		pnew.setName(p.getName());
		pnew.setCategory(p.getCategory());
		pnew.setCategoryType(p.getCategoryType());
		pnew.setAmount(p.getAmount());
		pnew.setReturnPolicy(p.getReturnPolicy());
		pnew.setEmi(p.getEmi());
		pnew.setDiscount(p.getDiscount());
		
		pnew.setRam(p.getRam());
		pnew.setCpu(p.getCpu());
		pnew.setScreen(p.getScreen());
		pnew.setGpu(p.getGpu());
		
		pnew.setColor(p.getColor());
		pnew.setSize(p.getSize());
		
		pnew.setAddedby(p.getAddedby());
		
		productRepo.save(pnew);
		System.out.println("Addedd Successfully");
		return new ResponseEntity<String>("Product Created",HttpStatus.CREATED);
	}
	
	@GetMapping("/viewProducts")
	ResponseEntity<List<Product>> getAllProductAddedBySeller(){
		List<Product> product = productRepo.findByAddedBy("seller");
		if(product!=null)
			return new ResponseEntity<List<Product>>(product,HttpStatus.OK);
		return new ResponseEntity<List<Product>>(HttpStatus.NO_CONTENT);
	}
	
	@PutMapping("/updateProduct")
	ResponseEntity<String> updateProduct(@RequestBody Product p){
		System.out.println("name "+p);
		Optional<Product> optional = productRepo.findById(p.getId());
		if(optional.isPresent()) {
			Product pnew = new Product();
			pnew.setId(p.getId());
			pnew.setName(p.getName());
			pnew.setCategory(p.getCategory());
			pnew.setCategoryType(p.getCategoryType());
			pnew.setAmount(p.getAmount());
			pnew.setReturnPolicy(p.getReturnPolicy());
			pnew.setEmi(p.getEmi());
			pnew.setDiscount(p.getDiscount());
		
			pnew.setRam(p.getRam());
			pnew.setCpu(p.getCpu());
			pnew.setScreen(p.getScreen());
			pnew.setGpu(p.getGpu());
		
			pnew.setColor(p.getColor());
			pnew.setSize(p.getSize());
		
			pnew.setAddedby(p.getAddedby());
		
			productRepo.save(pnew);
			System.out.println("Product Updated Successfully");
			return new ResponseEntity<String>("Product Updated",HttpStatus.CREATED);
		}
		return new ResponseEntity<String>("Product Not Found with this id",HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteProduct")
	ResponseEntity<String> deleteProduct(@RequestParam int id){
		System.out.println("ID = "+id);
		Optional<Product> optional = productRepo.findById(id);
		Product product = optional.orElseThrow();
		if(product!=null) {
			productRepo.delete(product);
			return new ResponseEntity<String>("Product deleted Successfully",HttpStatus.OK);
		}
		return new ResponseEntity<String>("No Product Found With the given ID!!",HttpStatus.OK);
	}
}
