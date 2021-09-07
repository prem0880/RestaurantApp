package com.rms.controller;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rms.dto.ItemDto;
import com.rms.dto.ItemTimeDto;
import com.rms.service.ItemServiceImpl;

public class AddItemController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String name=request.getParameter("name");
		String type=request.getParameter("type");
		String category=request.getParameter("category");
		String price=request.getParameter("price");
		String description=request.getParameter("description");
		String[] s=request.getParameterValues("itemTime");
		
		
		ItemDto itemDto = new ItemDto();
		itemDto.setName(name);
		itemDto.setType(type);
		itemDto.setCategory(category);
		itemDto.setDescription(description);
		itemDto.setPrice(Integer.parseInt(price));
		for(String x:s) {
			ItemTimeDto it=  new ItemTimeDto();
			it.setId(Long.valueOf(x));
			itemDto.getItemTime().add(it);
		}
		
		
		
		ItemServiceImpl itemServiceImpl = new ItemServiceImpl();
		Long id=itemServiceImpl.addFoodItem(itemDto);
		
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
