package com.algodomain.techtask.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity (name = "PRODUCT")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
//	@ManyToOne()
//	@JoinColumn(name = "catid")
//	private Category category;
	
	//Common Attributes
	@Column(name = "name")
	private String name;
	@Column(name = "category")
	private String category;
	@Column(name = "categorytype")
	private String categoryType;
	@Column(name = "amount")
	private Double amount;
	@Column(name = "returnpolicy")
	private String returnPolicy;
	@Column(name = "emi")
	private String emi;
	@Column(name = "discount")
	private String discount;
	
	
	//Electronics
	@Column(name = "ram")
	private String ram;
	@Column(name = "cpu")
	private String cpu;
	@Column(name = "screen")
	private String screen;
	@Column(name = "gpu")
	private String gpu;
	
//	@ManyToOne()
//	@JoinColumn(name = "electronicid")
//	private Electronic electronic;
	
	//Fashion
	@Column(name = "color")
	private String color;
	@Column(name = "size")
	private String size;
	
	//for seller
	@Column(name = "addedby")
	private String addedBy;
	
//	@ManyToOne()
//	@JoinColumn(name = "fashionid")
//	private Fashion fashion;

	public Product() {
		super();
	}


public Product(Integer id, String name, String category, String categoryType, Double amount, String returnPolicy,
		String emi, String discount, String ram, String cpu, String screen, String gpu, String color, String size, String addedBy) {
	super();
	this.id = id;
	this.name = name;
	this.category = category;
	this.categoryType = categoryType;
	this.amount = amount;
	this.returnPolicy = returnPolicy;
	this.emi = emi;
	this.discount = discount;
	this.ram = ram;
	this.cpu = cpu;
	this.screen = screen;
	this.gpu = gpu;
	this.color = color;
	this.size = size;
	this.addedBy=addedBy;
}


public Integer getId() {
	return id;
}


public void setId(Integer id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getCategory() {
	return category;
}


public void setCategory(String category) {
	this.category = category;
}


public String getCategoryType() {
	return categoryType;
}


public void setCategoryType(String categoryType) {
	this.categoryType = categoryType;
}


public Double getAmount() {
	return amount;
}


public void setAmount(Double amount) {
	this.amount = amount;
}


public String getReturnPolicy() {
	return returnPolicy;
}


public void setReturnPolicy(String returnPolicy) {
	this.returnPolicy = returnPolicy;
}


public String getEmi() {
	return emi;
}


public void setEmi(String emi) {
	this.emi = emi;
}


public String getDiscount() {
	return discount;
}


public void setDiscount(String discount) {
	this.discount = discount;
}


public String getRam() {
	return ram;
}


public void setRam(String ram) {
	this.ram = ram;
}


public String getCpu() {
	return cpu;
}


public void setCpu(String cpu) {
	this.cpu = cpu;
}


public String getScreen() {
	return screen;
}


public void setScreen(String screen) {
	this.screen = screen;
}


public String getGpu() {
	return gpu;
}


public void setGpu(String gpu) {
	this.gpu = gpu;
}


public String getColor() {
	return color;
}


public void setColor(String color) {
	this.color = color;
}


public String getSize() {
	return size;
}


public void setSize(String size) {
	this.size = size;
}

public String getAddedby() {
	return this.addedBy;
}
public void setAddedby(String addedBy) {
	this.addedBy=addedBy;
}

@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", category=" + category + ", categoryType=" + categoryType
			+ ", amount=" + amount + ", returnPolicy=" + returnPolicy + ", emi=" + emi + ", discount=" + discount
			+ ", ram=" + ram + ", cpu=" + cpu + ", screen=" + screen + ", gpu=" + gpu + ", color=" + color + ", size="
			+ size + ", addedBy="+addedBy +"]";
}
	
	
	
}
