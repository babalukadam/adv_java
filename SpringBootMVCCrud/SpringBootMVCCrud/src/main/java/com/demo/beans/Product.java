package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//@Getter
//here @getter and @setter is also an anotation which will directly gives you a getter and setter methpod
//@Setter
//@NoArgsConstructor
// becoz of @NoArgsConstructor and AllArgsConStructor we get bothe constructor becoz of this anotation ao we dont need to gentrate this two constriuctor ;

//@AllArgsConstructor
//@Data
//need to find out 
@Entity
//this is for creating table and @table is for giving the table name
@Table(name="product88")
public class Product {
	@Id
	//this is for creating the primary key for the id 
	
	private int pid;
	@NotNull
	
	//bhara hua hona chaiye
	//it must have some data 
	@Pattern(regexp="^[a-zA-Z0-9]+$")
//	in pattern we have to must add some data 
	private String pname;
	@Min(1)
	//need to find out 
	@Max(100)
//	need to find out 
	private int qty;
	private double price;
	public Product() {
		super();
	}
	public Product(int pid, String pname, int qty, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", price=" + price + "]";
	} 
	

}
