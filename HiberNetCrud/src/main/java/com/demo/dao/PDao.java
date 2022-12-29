package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface PDao {

	void addproduct(Product p);

	List<Product> showall();

	Product showbyid(int pid);

	boolean removeproduct(int pi);

	void closeMyConnection();


	boolean editpro(int pq, String pname,double price, int qty);

}
