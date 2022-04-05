//package com.algodomain.techtask.entity;
//
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
//
//import com.fasterxml.jackson.annotation.JsonManagedReference;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Entity(name = "CATEGORY")
////@Data
////@NoArgsConstructor
////@AllArgsConstructor
//public class Category {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Integer id;
//	
//	@Column(name = "catname")
//	private String catName;
//	
//	@Column(name = "cattype")
//	private String catType;
//	
//	@OneToMany()
//	private List<Product> product;
//
//	public Category() {
//		super();
//	}
//
//	public Category(Integer id, String catName, String catType, List<Product> product) {
//		super();
//		this.id = id;
//		this.catName = catName;
//		this.catType = catType;
//		this.product = product;
//	}
//
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public String getCatName() {
//		return catName;
//	}
//
//	public void setCatName(String catName) {
//		this.catName = catName;
//	}
//
//	public String getCatType() {
//		return catType;
//	}
//
//	public void setCatType(String catType) {
//		this.catType = catType;
//	}
//
//	public List<Product> getProduct() {
//		return product;
//	}
//
//	public void setProduct(List<Product> product) {
//		this.product = product;
//	}
//
//	@Override
//	public String toString() {
//		return "Category [id=" + id + ", catName=" + catName + ", catType=" + catType + ", product=" + product + "]";
//	}
//	
//}
