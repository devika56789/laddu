package com.text;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/janu")
public class janu extends GenericServlet implements Servlet 
{
	private static final long serialVersionUID = 1L;
    public janu()
    {
    System.out.println("chinthaparty varipalli");    
    }
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Agraharam post");
	}
	public void destroy() {
		System.out.println("Nimmana palli mdl");
	}	 
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("Annmaya Distic");
	}
}
