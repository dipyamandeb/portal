package com.portal.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portal.entity.Product;
import com.portal.repository.ProductRepository;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
	@Autowired
	private ProductRepository productRepository;
	
	@RequestMapping(value = "/sayHi")
	public String sayHi() {
		return "Hi";
	}
	
	@RequestMapping(value = "/findAll")
	public List<Product> displayProducts() {
		return productRepository.findAll();
	}
	
}
