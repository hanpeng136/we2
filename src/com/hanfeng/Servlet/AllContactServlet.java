package com.hanfeng.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hanfeng.entity.Contact;
import com.hanfeng.service.ContactService;

/**
 * Servlet implementation class AllContactServlet
 */
@WebServlet("/AllContactServlet")
public class AllContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AllContactServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");	
		PrintWriter out = response.getWriter();
		ContactService myContactService = new ContactService();
		ArrayList<Contact> contactList = new ArrayList<Contact>();
		contactList =  myContactService.queryAllContacts();
		
		
		request.setAttribute("contactList",contactList); //联系人列表
		request.setAttribute("name",contactList.get(0).getContact_name()); 
		request.getRequestDispatcher("contactList.jsp").forward(request,response); 
		System.out.println("联系人列表已发送"+contactList.get(0).getContact_name());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
