package com.lpu.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LeagueController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LeagueController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String leagueName=request.getParameter("l_name").toString();
		String leagueYear=request.getParameter("l_year").toString();
		String leagueSeason=request.getParameter("l_season").toString();
		if((leagueName.isEmpty() &&(leagueYear.isEmpty() && (leagueSeason.isEmpty()))))
		{
			RequestDispatcher view=request.getRequestDispatcher("error.html");
			view.forward(request, response);
		}
		else
		{
			RequestDispatcher view=request.getRequestDispatcher("success.html");
			view.forward(request, response);
		}
		
	}

}
