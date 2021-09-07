package com.rms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rms.dto.ItemTimeDto;
import com.rms.service.ItemTimeServiceImpl;


public class AddItemTimeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String timing = request.getParameter("itemTime"); 
		
		ItemTimeDto itemTimeDto  = new ItemTimeDto();
	
		itemTimeDto.setTimeOfDay(timing);
		
		
		ItemTimeServiceImpl itemTimeServiceImpl = new ItemTimeServiceImpl();
		Long id=itemTimeServiceImpl.addFoodItemTime(itemTimeDto);
		
		if(id!=null)
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
