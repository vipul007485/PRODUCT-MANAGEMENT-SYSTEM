package com.store.controller;

import java.util.Scanner;

import com.store.service.ProductService;

public class TestGet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Id:- ");
		int id = sc.nextInt();

		ProductService productService = new ProductService();

		productService.getProduct(id);
	}

}
