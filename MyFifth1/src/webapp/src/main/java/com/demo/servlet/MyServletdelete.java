package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.service.PService;
import com.demo.service.PServiceImpl;

/**
 * Servlet implementation class MyServletdelete
 */
@WebServlet("/MyServletdelete")
public class MyServletdelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		int pid=Integer.parseInt(request.getParameter("id"));
		PService p=new PServiceImpl();
		p.deleteID(pid);
		//		p.execute
		//		PrintWriter out=response.getWriter();
		//		out.print("deleted one product");
		RequestDispatcher rs=request.getRequestDispatcher("/MyServletPrint");
		rs.forward(request,response);


		//		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
