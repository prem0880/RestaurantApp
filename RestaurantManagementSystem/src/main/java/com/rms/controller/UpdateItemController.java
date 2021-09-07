package com.rms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.rms.dto.ItemDto;
import com.rms.service.ItemServiceImpl;


public class UpdateItemController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		HttpSession session = request.getSession(true);
		Long id = (Long) session.getAttribute("id");
		
		
		String name=request.getParameter("name");
		String type=request.getParameter("type");
		String category=request.getParameter("category");
		String price=request.getParameter("price");
		String description=request.getParameter("description");
		
		ItemDto itemDto = new ItemDto();
		itemDto.setName(name);
		itemDto.setType(type);
		itemDto.setCategory(category);
		itemDto.setDescription(description);
		itemDto.setPrice(Integer.parseInt(price));

		ItemServiceImpl itemServiceImpl = new ItemServiceImpl();
		Boolean flag=itemServiceImpl.updateFoodItemById(itemDto,id);
		
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
