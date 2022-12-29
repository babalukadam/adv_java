package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.ContractEmp;
import com.demo.beans.SalEmp;

public class TestInheritance {
	public static void main(String[]args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		SalEmp s1=new SalEmp(1,"ganesh","admin",900,12000);
		SalEmp s2=new SalEmp(11,"jignesh","wachmen",578,1000);
		ContractEmp c1=new ContractEmp(9,"umesh","casual",90,120);
		ContractEmp c2=new ContractEmp(10,"babalu","non-technical",80,180);
		session.save(c1);
		session.save(c2);
		session.save(s1);
		session.save(s2);
		tr.commit();
		session.close();
	}
}
