package com.demo.beans;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("cont")
public class ContractEmp extends Employee {
	private double hrs;
	private double charges;
	public ContractEmp() {
		super();
	}
	public ContractEmp(int eid, String ename, String dept,double hrs, double charges) {
		super(eid,ename,dept);
		this.hrs = hrs;
		this.charges = charges;
	}
	public double getHrs() {
		return hrs;
	}
	public void setHrs(double hrs) {
		this.hrs = hrs;
	}
	public double getCharges() {
		return charges;
	}
	public void setCharges(double charges) {
		this.charges = charges;
	}
	@Override
	public String toString() {
		return super.toString()+ "ContractEmp hrs=" + hrs + ", charges=" + charges ;
	}
	

}
