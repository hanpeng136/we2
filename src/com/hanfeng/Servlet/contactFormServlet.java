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
 * Servlet implementation class contactFormServlet
 */
@WebServlet("/contactFormServlet")
public class contactFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public contactFormServlet() {
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
		String contact_stuID=request.getParameter("contact_stuID");
		System.out.println(contact_stuID);
		ContactService myContactService = new ContactService();
		ArrayList<Contact> myContactList =new ArrayList<Contact>();
		myContactList = myContactService.queryContactById(contact_stuID);
		request.setAttribute("contact_stuID",myContactList.get(0).getContact_name());
		System.out.println(myContactList.get(0).getContact_name());
		request.setAttribute("contactList",myContactList); 
		request.getRequestDispatcher("contactForm.jsp").forward(request,response); 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
