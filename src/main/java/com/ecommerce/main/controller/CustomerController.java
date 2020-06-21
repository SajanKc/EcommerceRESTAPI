package com.ecommerce.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.main.model.Customer;
import com.ecommerce.main.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/customers")
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}

	@GetMapping("/customer/{id}")
	public Customer getCustomerById(@PathVariable Integer id) {
		return customerService.getCustomerById(id);
	}

	// Finding customers by location id
	@GetMapping("/customer/location/{id}")
	public List<Customer> findCustomerByLocationId(@PathVariable Integer id) {
		return customerService.findCustomerByLocation(id);
	}

	@PostMapping("/customer/addcustomer")
	public void addNewCustomer(@RequestBody Customer customer) {
		customerService.addNewCustomer(customer);
	}

	@PutMapping("/customer/update/{id}")
	public void updateCustomer(@RequestBody Customer customer) {
		customerService.updateCustomer(customer);
	}

	@DeleteMapping("/customer/delete/{id}")
	public void deleteCustomer(@PathVariable Integer id) {
		customerService.deleteCustomer(id);
	}

	
}
