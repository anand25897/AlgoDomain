//package com.algodomain.techtask.entity;
//
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//
//import com.fasterxml.jackson.annotation.JsonManagedReference;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Entity(name = "ELECTRONIC")
////@Data
////@NoArgsConstructor
////@AllArgsConstructor
//public class Electronic {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "id")
//	private Integer id;
//	@Column(name = "ram")
//	private String ram;
//	@Column(name = "cpu")
//	private String cpu;
//	@Column(name = "screen")
//	private String screen;
//	@Column(name = "gpu")
//	private String gpu;
//	
//	@OneToMany()
//	@JsonManagedReference
//	List<Product> product;
//
//	public Electronic() {
//		super();
//	}
//
//	public Electronic(Integer id, String ram, String cpu, String screen, String gpu, List<Product> product) {
//		super();
//		this.id = id;
//		this.ram = ram;
//		this.cpu = cpu;
//		this.screen = screen;
//		this.gpu = gpu;
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
//	public String getRam() {
//		return ram;
//	}
//
//	public void setRam(String ram) {
//		this.ram = ram;
//	}
//
//	public String getCpu() {
//		return cpu;
//	}
//
//	public void setCpu(String cpu) {
//		this.cpu = cpu;
//	}
//
//	public String getScreen() {
//		return screen;
//	}
//
//	public void setScreen(String screen) {
//		this.screen = screen;
//	}
//
//	public String getGpu() {
//		return gpu;
//	}
//
//	public void setGpu(String gpu) {
//		this.gpu = gpu;
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
//		return "Electronic [id=" + id + ", ram=" + ram + ", cpu=" + cpu + ", screen=" + screen + ", gpu=" + gpu
//				+ ", product=" + product + "]";
//	}
//	
//	
//}
