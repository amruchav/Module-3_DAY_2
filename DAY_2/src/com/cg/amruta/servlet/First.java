package com.cg.amruta.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/First")
public class First extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		ServletContext context=getServletContext();
		String user=request.getParameter("uname");
		context.setAttribute("username", user);
		String pw=request.getParameter("PW");
		context.setAttribute("Password", pw);
		String NUM=request.getParameter("MobileNo");
		context.setAttribute("MobileNumber", NUM);
		
		//First way to call RequestDispatcher method
			//RequestDispatcher rd=request.getRequestDispatcher("Second");
			//rd.forward(request, response);
		
		
		//Second way to call RequestDispatcher method
		    //RequestDispatcher rd=getServletContext().getRequestDispatcher("/Second");
		     //rd.forward(request, response);
		
		//Client side method 
		  response.sendRedirect("Second");
		
		
		
		

	}

}
