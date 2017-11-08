package com.yourcodelab.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.yourcodelab.model.Category;
import com.yourcodelab.model.Customer;
import com.yourcodelab.service.CategoryService;
import com.yourcodelab.service.CustomerService;

@ManagedBean(name = "customerManagedBean")
@SessionScoped
public class CustomerManagedBean implements Serializable{
	private static final long serialVersionUID = -9004785433894347006L;
	
	private Customer customer;
	private List<Customer> listCustomer;
	private List<Category> listCategory;
	
	private CustomerService customerService;
	private CategoryService categoryService;
	
	public CustomerManagedBean(){
		customerService = new CustomerService();
		categoryService = new CategoryService();
		customer = new Customer(0, "", "", new Category(0, "Select One"));
		listCustomer = customerService.listAll();
		listCategory = categoryService.listAll();
	}

	public void searchByNameAction(){
		System.out.println("Searching...");
		this.listCustomer = customerService.findCustomerByName(customer.getName());
	}
	
	public String insertCustomerAction(){
		System.out.println("Inserting...");
		//service.insertCustomer(customer);
		
		customer = new Customer(0, "", "", new Category(0, "Select One"));
		
		return "index";
	}
	
	public String updateCustomerAction(){
		System.out.println("Updating...");
		customerService.updateCustomer(customer);
		
		customer = new Customer(0, "", "", new Category(0, "Select One"));
		
		return "index";
	}
	
	public String deleteCustomerAction(){
		System.out.println("Deleting...");
		customerService.deleteCustomer(customer);
		
		listCustomer = customerService.listAll();
		
		customer = new Customer(0, "", "", new Category(0, "Select One"));
		
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

	public List<Category> getListCategory() {
		return listCategory;
	}

	public void setListCategory(List<Category> listCategory) {
		this.listCategory = listCategory;
	}
	
}
