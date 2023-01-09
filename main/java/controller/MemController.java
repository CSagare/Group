package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Customer;
import model.Member;

import java.io.IOException;
import java.io.PrintWriter;

import dao.CustomerDAO;
import dao.MemberDAO;

/**
 * Servlet implementation class MemController
 */
public class MemController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private MemberDAO memberdao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		memberdao = new MemberDAO();
		PrintWriter out=response.getWriter();		
		String memFname= request.getParameter("FirstName");
		String memLname= request.getParameter("LastName");
		char gender= request.getParameter("gender").charAt(0);		
	    int age = Integer.parseInt(request.getParameter("Age"));
		String phoneNo= request.getParameter("contact");
		String usernam= request.getParameter("email");	
		Member member=new Member(memFname,memLname,gender,age,phoneNo,usernam);
		
		try {
			int insert= memberdao.AddMember(member);
			if(insert==1) {
				out.print("Successfully added");
			}else {
				out.print("Error registring customer");
			}
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		

	}
	}


