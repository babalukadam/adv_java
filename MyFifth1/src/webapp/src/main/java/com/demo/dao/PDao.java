package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface PDao {

	List<Product> printallproduct();



	void adodProduct(Product p);



	void deleteid(int pid);

}
