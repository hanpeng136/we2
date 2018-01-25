package com.hanfeng.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hanfeng.entity.Contact;
import com.hanfeng.service.ContactService;

/**
 * Servlet implementation class AddContactServlet
 */
@WebServlet("/AddContactServlet")
public class AddContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddContactServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String contact_name=request.getParameter("contact_name");
		String contact_class=request.getParameter("contact_class");
		String contact_stuID=request.getParameter("contact_stuID");
		String contact_age=request.getParameter("contact_age");
		String contact_birthday=request.getParameter("contact_birthday");
		String contact_weight=request.getParameter("contact_weight");
		String contact_phone=request.getParameter("contact_phone");
		String contact_remarks=request.getParameter("contact_remarks");
		
		ContactService myContactService = new ContactService();
		int contact_age2 = Integer.parseInt(contact_age);
		double contact_weight2 = Double.parseDouble(contact_weight);
		Contact myContact = new Contact(contact_name,contact_class,contact_stuID,contact_age2,contact_birthday,
				contact_weight2,contact_phone,contact_remarks);		
		myContactService.insertContact(myContact);
		response.sendRedirect("AllContactServlet.do");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
