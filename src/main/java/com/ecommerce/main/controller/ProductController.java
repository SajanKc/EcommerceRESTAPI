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

import com.ecommerce.main.model.Product;
import com.ecommerce.main.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable Integer id) {
		return productService.getProductById(id);
	}

	// Finding products by customer id
	@GetMapping("/product/customer/{id}")
	public List<Product> findProductsByCustomerId(@PathVariable Integer id) {
		return productService.findProductByCustomerId(id);
	}

	@PostMapping("/product/addproduct")
	public void addNewProduct(@RequestBody Product product) {
		productService.addNewProduct(product);
	}

	@PutMapping("/product/update/{id}")
	public void updateProduct(@RequestBody Product product) {
		productService.updateProduct(product);
	}

	@DeleteMapping("/product/delete/{id}")
	public void deleteProduct(@PathVariable Integer id) {
		productService.deleteProduct(id);
	}
	
}
