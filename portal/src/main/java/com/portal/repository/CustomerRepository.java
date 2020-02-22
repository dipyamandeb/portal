package com.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portal.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
