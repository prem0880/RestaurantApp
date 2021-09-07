package com.rms.controller;

import java.io.IOException;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rms.entity.Item;
import com.rms.service.ItemServiceImpl;


public class ViewItemController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Item> item = new ItemServiceImpl().viewFoodItem();
		request.setAttribute("item", item);
		request.getRequestDispatcher("ViewItems.jsp").forward(request, response);
	}
}
