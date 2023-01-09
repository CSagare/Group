package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Book;
import model.Customer;

import java.io.IOException;
import java.io.PrintWriter;

import dao.BookDAO;
import dao.CustomerDAO;

/**
 * Servlet implementation class BookController
 */
public class BookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BookDAO bookDao;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookController() {
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
//		int bookid=Integer.parseInt(getServletInfo())
		
		String name= request.getParameter("BookName");
		String publisher= request.getParameter("publisher");
		
		String author= request.getParameter("BookAuthor");
		
		
		
		
		Book book=new Book(name,publisher,author);
		try {
			int insert= bookDao.AddBook(book);
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


