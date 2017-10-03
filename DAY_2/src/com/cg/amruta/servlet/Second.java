package com.cg.amruta.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Second")
public class Second extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			ServletContext context=getServletContext();
			String user=(String) context.getAttribute("username");
			String Pw=(String) context.getAttribute("Password");
			String Mob=(String) context.getAttribute("MobileNumber");
			out.println("Welcome " +user);
			out.println("Your password is " +Pw);
			out.println("Your Mobile number is " +Mob);
		}

	}