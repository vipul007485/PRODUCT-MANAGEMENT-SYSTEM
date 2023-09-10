package com.store.controller;

import java.util.Scanner;

import com.store.service.CustomerService;

public class DeleteCustomer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Id:- ");
		int id = sc.nextInt();

		CustomerService customerService = new CustomerService();

		boolean b = customerService.deleteCustomer(id);

		System.out.println(b);
	}

}
