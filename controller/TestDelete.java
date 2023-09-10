package com.store.controller;

import java.util.Scanner;

import com.store.service.ProductService;

public class TestDelete {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id:- ");
		int id = sc.nextInt();

		ProductService productService = new ProductService();

		boolean b = productService.deleteProduct(id);

		System.out.println(b);
	}

}
