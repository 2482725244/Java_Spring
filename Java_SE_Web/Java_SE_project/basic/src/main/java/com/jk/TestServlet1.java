package com.jk;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet1 extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		int num1 =Integer.parseInt(request.getParameter("num1"));
		int num2 =Integer.parseInt(request.getParameter("num2"));
		int opr =Integer.parseInt(request.getParameter("opr"));
		
		JudgmentBean bean = new JudgmentBean(num1,num2,opr);
		int endNum = bean.getEndNum();
		
		request.getSession().setAttribute("endNum", endNum);
		request.getSession().setAttribute("num1", num1);
		request.getSession().setAttribute("num2", num2);
		request.getSession().setAttribute("opr", opr);
		response.sendRedirect("/basic/index.jsp");
		
				
		
		out.println(endNum);
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}

}
