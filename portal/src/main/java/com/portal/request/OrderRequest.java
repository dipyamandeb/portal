package com.portal.request;

import java.util.List;

public class OrderRequest {
	Integer cust_id;
	List<String > productList;
	
	public Integer getCust_id() {
		return cust_id;
	}
	public void setCust_id(Integer cust_id) {
		this.cust_id = cust_id;
	}
	public List<String> getProductList() {
		return productList;
	}
	public void setProductList(List<String> productList) {
		this.productList = productList;
	} 
	

}
