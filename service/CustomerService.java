package com.store.service;

import com.store.dao.CustomerDao;
import com.store.dto.Customer;

public class CustomerService {

	CustomerDao customerDao = new CustomerDao();

	public Customer saveCustomer(Customer customer) {
		return customerDao.saveCustomer(customer);
	}

	public boolean deleteCustomer(int id) {

		boolean b = customerDao.deleteCustomer(id);

		return b;

	}

	public String updateCustomer(String email, int id) {
		String e = customerDao.updateCustomer(email, id);
		return e;

	}

	public int getEmail(int id) {
		return customerDao.getEmail(id);
	}

	public int getCustomer(int id) {
		return customerDao.getCustomer(id);
	}

	public void GetAllCustomer() {
		customerDao.GetAllCustomer();
	}
}
