package com.yourcodelab.dao;

import java.util.ArrayList;
import java.util.List;

import com.yourcodelab.model.Category;
import com.yourcodelab.model.Customer;

public class CustomerDAO {
	public List<Customer> listAll(){
		List<Customer> list = new ArrayList<Customer>();
		list.add(new Customer(1, "Alex", "alex@gmail.com", new Category(1, "Gold")));
		list.add(new Customer(2, "John", "john@gmail.com", new Category(1, "Gold")));
		list.add(new Customer(3, "Scott", "scott@gmail.com", new Category(1, "Gold")));
		
		return list;
	}
	
	public List<Customer> findByName(String name){
		List<Customer> list = new ArrayList<Customer>();
		
		if(name.charAt(0) == 'a' || name.charAt(0) == 'A')
			list.add(new Customer(1, "Alex", "alex@gmail.com", new Category(1, "Gold")));
		else{
			list.add(new Customer(2, "John", "john@gmail.com", new Category(1, "Gold")));
			list.add(new Customer(3, "Scott", "scott@gmail.com", new Category(1, "Gold")));
		}
		
		return list;
	}
}
