package com.demo.beans;

public class Product {
	private int pid;
	private String pname;
	private double price;
	private int qty;
	private int cid;
	public Product() {
		super();
	}
	public Product(int pid, String product, double price, int qty, int cid) {
		super();
		this.pid = pid;
		this.pname = product;
		this.price = price;
		this.qty = qty;
		this.cid = cid;
	}
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProduct() {
		return pname;
	}

	public void setProduct(String product) {
		this.pname = product;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "Produt [pid=" + pid + ", product=" + pname + ", price=" + price + ", qty=" + qty + ", cid=" + cid
				+ "]";
	}



}
