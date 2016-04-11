package com.example.cdi;

import java.util.List;

 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class CustomerManager {

	
	@PersistenceContext
	private EntityManager emg;
	
	public Customer getCustomer(int id) {
		System.out.println(emg.find(Customer.class, id).getName());
		return emg.find(Customer.class, id);
	}
	
	 
	public void addCustomers(List<Customer> customers) {
		for (Customer customer : customers) {
			emg.persist(customer);
		}
	}
}
