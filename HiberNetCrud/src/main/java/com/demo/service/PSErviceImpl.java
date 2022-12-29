package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Product;
import com.demo.dao.PDao;
import com.demo.dao.PDaoImpl;

public class PSErviceImpl  implements PService {
	private static PDao pdao;
	public PSErviceImpl() {
		super();
		this.pdao = new PDaoImpl();
	}
	Scanner sc=new Scanner(System.in);
	@Override
	public void addProduct() {
		System.out.println("enter the id");
		int pid=sc.nextInt();
		System.out.println("enter the pname");
		String pname=sc.next();
		System.out.println("enter the price");
		double price=sc.nextDouble();
		System.out.println("enter the qty");
		int qty=sc.nextInt();
		Product p=new Product(pid,pname,price,qty);
		pdao.addproduct(p);
	}
	@Override
	public List<Product> displayall() {
		return pdao.showall();
	}
	@Override
	public Product displaybyid(int pid) {
		return pdao.showbyid(pid);
	}
	@Override
	public boolean DeleteProduct(int pi) {
		return pdao.removeproduct(pi);
	}
	@Override
	public void CloseMySession() {
		pdao.closeMyConnection();
	}
	@Override
	public boolean UpadateProduct(int pq, String pname, double price, int qty) {
		return pdao.editpro(pq,pname,price,qty);
	}

}
