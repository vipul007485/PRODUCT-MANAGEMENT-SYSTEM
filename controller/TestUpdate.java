package com.store.controller;

import java.util.Scanner;

import com.store.service.ProductService;

public class TestUpdate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Id:- ");
		int id = sc.nextInt();

		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter price:- ");
		double price = sc1.nextDouble();

		ProductService productService = new ProductService();

		productService.getPrice(id);
		double p = productService.updateProduct(price, id);

		System.out.print(p);

	}
}