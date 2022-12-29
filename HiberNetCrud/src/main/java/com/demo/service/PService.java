package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface PService {

	void addProduct();

	List<Product> displayall();

	Product displaybyid(int pid);

	boolean DeleteProduct(int pi);

	void CloseMySession();

	boolean UpadateProduct(int pq, String pname, double price, int qty);

}
