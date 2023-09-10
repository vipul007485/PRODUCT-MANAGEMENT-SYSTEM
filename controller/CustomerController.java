package com.store.controller;

import java.util.Scanner;

import com.store.dto.Customer;
import com.store.service.CustomerService;

public class CustomerController {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Id:- ");
		int id = sc.nextInt();

		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter name:- ");
		String name = sc1.nextLine();

		Scanner sc2 = new Scanner(System.in);
		System.out.print("Enter email:- ");
		String email = sc2.nextLine();

		Customer customer = new Customer();

		customer.setId(id);
		customer.setName(name);
		customer.setEmail(email);

		CustomerService customerService = new CustomerService();

		Customer c = customerService.saveCustomer(customer);

		if (c != null) {

			System.out.println(c.getId() + "Saved Sucessfully");
		}

	}

}
