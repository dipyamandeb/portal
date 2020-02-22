package com.portal.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portal.entity.Customer;
import com.portal.entity.Product;
import com.portal.repository.CustomerRepository;
import com.portal.repository.ProductRepository;
import com.portal.request.OrderRequest;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private ProductRepository productRepository;

	@RequestMapping(value = "/findAll")
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	@PostMapping(value = "/requestOrder")
	private String verifyOrder(@RequestBody OrderRequest orderRequest) {
		Integer cust_id = orderRequest.getCust_id();
		if (cust_id == null || !customerRepository.existsById(cust_id)) {
			return "Please provide valid customer id.";
		}
		List<String> orderList = orderRequest.getProductList();
		if (orderList.isEmpty()) {
			return "Please provide list of item to be ordered.";
		}
		String result = null;

		Integer totalCost = new Integer(0);

		for (String prodCode : orderList) {
			Product product = productRepository.findProduct(prodCode);
			if (product == null) {
				return "Product not found for code:" + prodCode;
			} else {
				totalCost = Integer.sum(totalCost, Integer.parseInt(product.getProductRate()));
			}
		}

		String custPoints = customerRepository.findById(cust_id).get().getCustpoints();

		if (totalCost.compareTo(Integer.parseInt(custPoints)) <= 0) {
			result = "OK!";
		} else {
			result = "NOT OK! Not enough points.";
		}

		return result;

	}

}
