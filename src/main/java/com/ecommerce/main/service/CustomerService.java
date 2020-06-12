package com.ecommerce.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.main.model.Customer;
import com.ecommerce.main.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	public Customer getCustomerById(Integer id) {
		return customerRepository.findById(id).orElse(null);
	}

	// Finding customers by location id
	public List<Customer> findCustomerByLocation(Integer id) {
		return customerRepository.findByLocationId(id);
	}

	public void addNewCustomer(Customer customer) {
		customerRepository.save(customer);
	}
	
	public void updateCustomer(Customer customer) {
		customerRepository.save(customer);
	}
	
	public void deleteCustomer(Integer id) {
		customerRepository.deleteById(id);
	}
}
