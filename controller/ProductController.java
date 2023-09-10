package com.store.controller;

import java.util.Scanner;

import com.store.dto.Product;

import com.store.service.ProductService;

public class ProductController {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Id:- ");
		int id = sc.nextInt();

		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter name:- ");
		String name = sc1.nextLine();

		Scanner sc2 = new Scanner(System.in);
		System.out.print("Enter brand:- ");
		String brand = sc2.nextLine();

		Scanner sc3 = new Scanner(System.in);
		System.out.print("Enter price:- ");
		double price = sc3.nextDouble();

		Product product = new Product();

		product.setId(id);
		product.setName(name);
		product.setBrand(brand);
		product.setPrice(price);

		ProductService productService = new ProductService();

		Product p = productService.saveProduct(product);

		if (p != null) {
			System.out.println(p.getId() + "saved sucessfully");
		}
	}

}
