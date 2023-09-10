package com.store.controller;

import com.store.service.ProductService;

public class TestGetAll {

	public static void main(String[] args) {

		ProductService productService = new ProductService();
		productService.GetAllProduct();
	}
}
