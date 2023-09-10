package com.store.controller;

import java.util.Scanner;

import com.store.dto.Customer;
import com.store.service.CustomerService;

public class UpdateCustomer {

	public static void main(String[] args) {

		Customer customer = new Customer();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Id:- ");
		int id = sc.nextInt();

		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter Email:- ");
		String email = sc1.nextLine();
		CustomerService customerService = new CustomerService();

		customerService.getEmail(id);

		String p = customerService.updateCustomer(email, id);

		System.out.println(p);

	}

}
