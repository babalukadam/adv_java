package com.demo.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HBUtil {
	private static SessionFactory sf;

 public static SessionFactory getMysession() {
	 if(sf==null) {
		 sf=new Configuration().configure().buildSessionFactory();
	 }
	 return sf;
 }
 
 public static void closeMySession() {
	 if(sf!=null) {
		 sf.close();
	 }
 }
}
