package com.yourcodelab.service;

import java.util.ArrayList;
import java.util.List;

import com.yourcodelab.dao.CustomerDAO;
import com.yourcodelab.model.Category;
import com.yourcodelab.model.Customer;

public class CustomerService {
	private CustomerDAO dao;
	
	public CustomerService(){
		this.dao = new CustomerDAO();
	}
	
	public List<Customer> listAll(){
		return dao.listAll();
	}
	
	public List<Customer> findCustomerByName(String name){
		List<Customer> list = new ArrayList<Customer>();
		
		if(name != null && name.trim().length() > 0)
			list = dao.findByName(name);
		else
			list = listAll();
		
		return list;
	}
	
	public void insertCustomer(Customer c){
		//TO-DO
	}
	
	public void updateCustomer(Customer c){
		//TO-DO
	}
	
	public void deleteCustomer(Customer c){
		//TO-DO
	}
	
}
