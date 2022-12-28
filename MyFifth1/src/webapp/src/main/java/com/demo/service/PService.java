package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface PService {

	List<Product> printAllProduct();

	void addProduct(Product product);

;

	void deleteID(int pid);

}
