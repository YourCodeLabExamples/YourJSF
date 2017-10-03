package com.yourcodelab.service;

import java.util.ArrayList;
import java.util.List;

import com.yourcodelab.model.Customer;

public class CustomerService {
	public List<Customer> listAll(){
		List<Customer> list = new ArrayList<Customer>();
		list.add(new Customer(1, "Alex", "alex@gmail.com"));
		list.add(new Customer(2, "John", "john@gmail.com"));
		list.add(new Customer(3, "Scott", "scott@gmail.com"));
		
		return list;
	}
	
	public void insertCustomer(Customer c){
		//TO-DO
	}
	
	public List<Customer> findCustomerByName(String name){
		//TO-DO
		return null;
	}
}
