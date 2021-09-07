package com.rms.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rms.entity.ItemTime;
import com.rms.service.ItemTimeServiceImpl;

public class ViewItemTimeController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<ItemTime> item = new ItemTimeServiceImpl().viewFoodItemTime();
		request.setAttribute("item", item);
		request.getRequestDispatcher("ViewItemTime.jsp").forward(request, response);
	
	
	}

}
