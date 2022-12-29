package com.demo.beans;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity(name="empHerarchi_0909")
//in this we are giving table name
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//ned find out :-ans:-here we need to find out which type of data opration we did and which type of output we requierd
@DiscriminatorColumn(name="empType",discriminatorType=DiscriminatorType.STRING)
//need to find out ans:- this is actually one column which is use in single table.
//and what ever data type we uses we can takes aslike String ,Integer 

public class Employee {
	@Id
	@GeneratedValue
	private int eid;
	private String ename;
	private String dept;
	public Employee() {
		super();
	}
	public Employee( int eid ,String ename, String dept) {
		super();
		this.eid=eid;
		this.ename = ename;
		this.dept = dept;
	}
//	public Employee( String ename, String dept) {
//		super();
//
//		this.ename = ename;
//		this.dept = dept;
//	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee eid=" + eid + ", ename=" + ename + ", dept=" + dept ;
	}

}
