package com.rms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rms.service.ItemServiceImpl;


public class DeleteItemController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String s=request.getParameter("FoodId");
		Long id=Long.parseLong(s);
		ItemServiceImpl itemServiceImpl = new ItemServiceImpl();
		Boolean flag = itemServiceImpl.deleteFoodItemById(id);
		
		if(flag==true)
		{
			RequestDispatcher rd=request.getRequestDispatcher("AdminHome.jsp");  
	        rd.forward(request,response);
		}
		else
		{
			out.println("Something went wrong!");
		}
		
	}

}
