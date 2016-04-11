package com.example.cdi;

 

import java.util.List;


import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/customersvc")
public class CustomerService {

	@Inject
	private CustomerManager customerManager;

	@GET
	@Path("/{id}")
	public Customer getCustomer(@PathParam("id") int id) {
		return customerManager.getCustomer(id);
	}
	
	@POST
	public void addCustomers(List<Customer> customers) {
		customerManager.addCustomers(customers);
	}
	
}

