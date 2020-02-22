package com.portal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "cust")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Customer {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cust_id;
	private String custname;
	private String custpoints;
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCustpoints() {
		return custpoints;
	}
	public void setCustpoints(String custpoints) {
		this.custpoints = custpoints;
	}
	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", custname=" + custname + ", custpoints=" + custpoints + "]";
	}
	
	
	
}
