package com.cg.amruta.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Firstservlet")
public class Firstservlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Method getParameterNames-display name with values
		/*response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Enumeration param=request.getParameterNames();
		String par=null,value=null;
		while(param.hasMoreElements())
		{
			par=(String) param.nextElement();
			value=request.getParameter(par);
			out.println(par);
			out.println(value);
		}*/
		
		//Method getParameter-Display only values inserted at page
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("Name");
		String PW=request.getParameter("PW");
		out.println("welcome" +name);
		out.println("Your Password is" +PW);
	
	}

}
