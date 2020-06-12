package com.ecommerce.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.main.model.Product;
import com.ecommerce.main.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	public Product getProductById(Integer id) {
		return productRepository.findById(id).orElse(null);
	}
	
	public List<Product> findProductByCustomerId(Integer id){
		return productRepository.findByCustomerId(id);
	}

	public void addNewProduct(Product product) {
		productRepository.save(product);
	}
	
	public void updateProduct(Product product) {
		productRepository.save(product);
	}
	
	public void deleteProduct(Integer id) {
		productRepository.deleteById(id);
	}
}
