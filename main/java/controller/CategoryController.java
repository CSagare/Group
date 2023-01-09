package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Category;
import model.Issue;

import java.io.IOException;
import java.io.PrintWriter;

import dao.BookDAO;

/**
 * Servlet implementation class CategoryController
 */
public class CategoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BookDAO bookDao;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategoryController() {
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
		String CategoryName=request.getParameter("category");
		String CategoryDes=request.getParameter("categoryDes");
		Category cat=new Category(CategoryName,CategoryDes);
		try {
			int insert= bookDao.CategoryBook(cat);
		
		if(insert>0){
			out.println("<h3>Book Category issued successfully</h3>");
		}else{
			out.println("<h3>Sorry, unable to issue.</h3><p>We may have sortage Kindly visit later.</p>");
		}}catch(Exception ex) {
			ex.printStackTrace();
		}
		}
		
	}


