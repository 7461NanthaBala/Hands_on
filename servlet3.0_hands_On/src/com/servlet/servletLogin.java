package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servletLogin")
public class servletLogin extends HttpServlet {
	
	protected void doPost(HttpServletRequest re, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter p=res.getWriter();
	 	   res.setContentType("text/html");
	 	   String user=re.getParameter("userName");
	 	   String pass=re.getParameter("userPassword");
	 	   if(user.equals("bala02") && pass.equals("bala02"))
	 	   {
	 		   RequestDispatcher dis=re.getRequestDispatcher("/home");
	 		   dis.forward(re,res);
	 	   }
	 	   else
	 	   {
	 		   p.println("login failed");
	 	   }
	 	   p.close();
	}

}
