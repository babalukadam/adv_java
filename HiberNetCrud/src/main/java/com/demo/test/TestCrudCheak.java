package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Product;
import com.demo.service.PSErviceImpl;
import com.demo.service.PService;

public class TestCrudCheak {
	public static void main(String []args) {
	
		PService ps=new PSErviceImpl();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("welcome!!!!\n here are some choices \n1.add product \n2.display all product\n3.displaybyid\n4.delete product"
					+ "\n4.displaybyid \n5. update product\n 6.closese session");
			choice=sc.nextInt();
			switch(choice){
			case 1:
				ps.addProduct();
				
				break;
			case 2:
				List<Product> plist=ps.displayall();
				plist.forEach(x->{System.out.println(x);});
				break;
			case 3:
				System.out.println("enter the product id");
				int pid=sc.nextInt();
				Product p=ps.displaybyid(pid);
				break;
			case 4:
				System.out.println("enter the id");
				int pi=sc.nextInt();
				boolean status=ps.DeleteProduct(pi);
				break;
			case 5:
				System.out.println("enter the id");
				int pq=sc.nextInt();
				System.out.println("enter the pname");
				String pname=sc.next();
				System.out.println("enter the price");
				double price=sc.nextDouble();
				System.out.println("enter the qty");
				int qty=sc.nextInt();
				boolean statas=ps.UpadateProduct(pq,pname,price,qty);
				break;
			case 6:
				System.out.println("thank u for visiting !!!!");
				ps.CloseMySession();
				break;
				
			}
		}while(choice!=6);
		
		
	}
		

}
