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
//@Entity(name = "FASHION")
////@Data
////@NoArgsConstructor
////@AllArgsConstructor
//public class Fashion {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "id")
//	private Integer id;
//	
//	@Column(name = "name")
//	private String name;
//	
//	@Column(name = "color")
//	private String color;
//	
//	@Column(name = "size")
//	private String size;
//	
//	@OneToMany()
//	@JsonManagedReference
//	List<Product> product;
//
//	public Fashion() {
//		super();
//	}
//
//	public Fashion(Integer id, String name, String color, String size, List<Product> product) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.color = color;
//		this.size = size;
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
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getColor() {
//		return color;
//	}
//
//	public void setColor(String color) {
//		this.color = color;
//	}
//
//	public String getSize() {
//		return size;
//	}
//
//	public void setSize(String size) {
//		this.size = size;
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
//		return "Fashion [id=" + id + ", name=" + name + ", color=" + color + ", size=" + size + ", product=" + product
//				+ "]";
//	}
//	
//	
//}
