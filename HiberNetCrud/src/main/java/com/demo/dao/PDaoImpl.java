package com.demo.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.beans.Product;

public class PDaoImpl implements PDao  {
    
	private static SessionFactory sf;
	static {
		sf=HBUtil.getMysession();
	}

	@Override
	public void addproduct(Product p) {

		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(p);
		tr.commit();
		session.close();
	}

	@Override
	public List<Product> showall() {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Criteria cr=session.createCriteria(Product.class);
		List<Product> plist=cr.list();
		if(plist!=null) {
			tr.commit();
			session.close();
			return plist;
		}
		session.close();
		return null;
	}

	@Override
	public Product showbyid(int pid) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Product p=session.get(Product.class, pid);
		if(p!=null) {
			tr.commit();
			session.close();
			return p;
		}
		session.close();

		return null;
	}

	@Override
	public boolean removeproduct(int pi) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Product m=session.get(Product.class, pi);
		if(m!=null) {
			session.delete(m);
			tr.commit();
			session.close();
		return true;
		}
		session.close();
		return false;
	}

	@Override
	public void closeMyConnection() {
		HBUtil.closeMySession();
	}

	@Override
	public boolean editpro(int pq, String pname,double price, int qty) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Product p=session.get(Product.class, pq);
		if(p!=null) {
			p.setPrice(price);
			p.setQty(qty);
			session.update(p);
			tr.commit();
			session.close();
			return true;
		}
		session.close();
		return false;
	}

}
