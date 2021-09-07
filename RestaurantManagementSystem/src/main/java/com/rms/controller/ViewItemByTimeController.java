package com.rms.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rms.entity.ItemTime;
import com.rms.service.ItemTimeServiceImpl;

public class ViewItemByTimeController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String timing = request.getParameter("foodtiming");
		List<ItemTime> item = new ItemTimeServiceImpl().viewFoodItemTime();
		int index;
		for (index = 0; index < item.size(); index++)
			if (item.get(index).getTimeOfDay().equalsIgnoreCase(timing))
				break;
		request.setAttribute("item", item.get(index).getItem());
		request.getRequestDispatcher("ViewItemByTime.jsp").forward(request, response);
	
	
	}

}
