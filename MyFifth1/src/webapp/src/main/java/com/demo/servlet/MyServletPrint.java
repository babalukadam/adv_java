package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Product;
import com.demo.service.PService;
import com.demo.service.PServiceImpl;
@WebServlet("/MyServletPrint")
public class MyServletPrint extends HttpServlet {
	static PService service;
	static{
		service=new PServiceImpl();
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		try {
			doGet(req,res);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		

		List<Product> plist=service.printAllProduct();
		out.print("<Table border='5'>");
		for(Product p:plist)
		{
			out.print("<tr> <td>"+p.getPid()+"</td><td>"+p.getProduct()+"</td><td>"+p.getPrice()+"</td><td>"+p.getQty()+"</td><td>"+p.getCid()+"</td>");
			out.println("<td><a href='MyServletdelete?id="+p.getPid()+"'>delete</a> / <a href='edit?id="+p.getPid()+"'>edit</a></td></tr>");
		}
		out.println("<a href='index.html'>AddProduct</a>");
	}



}
