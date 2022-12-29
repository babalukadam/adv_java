package com.demo.beans;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("salemp")
public class SalEmp extends Employee {
	private double sal;
	private double bonus;
	public SalEmp() {
		super();
	}
	public SalEmp( int eid,String ename, String dept,double sal, double bonus) {
		super(eid,ename,dept);
		this.sal = sal;
		this.bonus = bonus;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return super.toString()+"SalEmp sal=" + sal + ", bonus=" + bonus;
	}
	

}
