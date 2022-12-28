package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Product;
import com.demo.service.PService;
import com.demo.service.PServiceImpl;

/**
 * Servlet implementation class MyServletAdd
 */
@WebServlet("/MyServletAdd")
public class MyServletAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		int pid=Integer.parseInt(req.getParameter("pid"));
		String pname=req.getParameter("pname");
		double price=Double.parseDouble(req.getParameter("price"));
		int qty=Integer.parseInt(req.getParameter("qty"));
		int cid=Integer.parseInt(req.getParameter("cid"));
		PService pservice=new PServiceImpl();
		pservice.addProduct(new Product(pid,pname,price,qty,cid));
		RequestDispatcher rd=req.getRequestDispatcher("/MyServletPrint");
		rd.forward(req, res);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
