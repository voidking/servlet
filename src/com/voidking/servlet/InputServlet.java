package com.voidking.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InputServlet() {
        super();
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setCharacterEncoding("utf8");
		req.setCharacterEncoding("utf8");
		
		String input = req.getParameter("input");
		
		PrintWriter pw = res.getWriter();
		pw.println("<html><head><meta charset=\"UTF-8\"><title>");
		pw.println("显示输入内容");
		pw.println("</title><body>");
		pw.println(input);
		pw.println("</body></html>");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}

}