package com.demo.service;

import java.util.List;

import com.demo.beans.Product;
import com.demo.dao.PDao;
import com.demo.dao.PDaoImpl;

public class PServiceImpl implements PService {
	private static PDao prodao;
	static {
		prodao=new PDaoImpl();
		
	}
	@Override
	public List<Product> printAllProduct() {
		return prodao.printallproduct();
	}
	@Override
	public void addProduct(Product product) {
		prodao.adodProduct(product);
	}
	@Override
	public void deleteID(int pid) {
		prodao.deleteid(pid);
	}
}
