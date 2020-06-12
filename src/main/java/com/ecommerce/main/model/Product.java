package com.ecommerce.main.model;

import java.time.LocalDateTime;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Integer quantity;
	private Float price;
	private LocalDateTime purchasedate;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "customerid", insertable = false, updatable = false)
	private Customer customer;

	private Integer customerid;

	public Integer getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}

	public Product() {

	}

	public Product(Integer id, String name, Integer quantity, Float price, LocalDateTime purchasedate, Integer customerid) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.purchasedate = purchasedate;
		this.customerid = customerid;
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

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public LocalDateTime getPurchasedate() {
		return purchasedate;
	}

	public void setPurchasedate(LocalDateTime purchasedate) {
		this.purchasedate = purchasedate;
	}

	@JsonBackReference
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
}
