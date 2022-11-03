package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {
	
	@Id
	@Column
	private int productid;
	@Column
	private int quantity;
	@Column
	private String brand;
	@Column
	private String description;
	@Column
	private String features;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productid, int quantity, String brand, String description, String features) {
		super();
		this.productid = productid;
		this.quantity = quantity;
		this.brand = brand;
		this.description = description;
		this.features = features;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	
}
