package com.yourcodelab.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.yourcodelab.model.Customer;
import com.yourcodelab.service.CustomerService;

@ManagedBean(name = "customerManagedBean")
@SessionScoped
public class CustomerManagedBean implements Serializable{
	private static final long serialVersionUID = -9004785433894347006L;
	
	private Customer customer;
	private List<Customer> listCustomer;
	
	private CustomerService service;
	
	public CustomerManagedBean(){
		service = new CustomerService();
		customer = new Customer(0, "", "");
		listCustomer = service.listAll();
	}

	public void searchByNameAction(){
		System.out.println("Searching...");
		this.listCustomer = service.findCustomerByName(customer.getName());
	}
	
	public String insertCustomerAction(){
		System.out.println("Saving...");
		service.insertCustomer(customer);
		
		return "index";
	}
	
	public String updateCustomerAction(){
		System.out.println("Updating...");
		//service.updateCustomer(customer);
		
		return "index";
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Customer> getListCustomer() {
		return listCustomer;
	}

	public void setListCustomer(List<Customer> listCustomer) {
		this.listCustomer = listCustomer;
	}
	
}
