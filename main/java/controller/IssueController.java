package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Book;
import model.Issue;

import java.io.IOException;
import java.io.PrintWriter;

import dao.BookDAO;

/**
 * Servlet implementation class IssueController
 */
public class IssueController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BookDAO bookDao;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public IssueController() {
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
		bookDao = new BookDAO();

		PrintWriter out=response.getWriter();		
		String bookname=request.getParameter("BookName");
		String Memname=request.getParameter("MemberName");
		String Issdate=request.getParameter("IssueDate");
		String ReturnDate=request.getParameter("ReturnDate");

				
		
		
		Issue issue=new Issue(bookname,Memname,Issdate,ReturnDate);
		try {
			int insert= bookDao.IssueBook(issue);
		
		if(insert>0){
			out.println("<h3>Book issued successfully</h3>");
		}else{
			out.println("<h3>Sorry, unable to issue book.</h3><p>We may have sortage of books. Kindly visit later.</p>");
		}}catch(Exception ex) {
			ex.printStackTrace();
		}
		}
		}
//		out.println("</div>");
		
		
//		request.getRequestDispatcher("footer.html").include(request, response);
	


