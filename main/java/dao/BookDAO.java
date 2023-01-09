package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DbConnection;
import model.Book;
import model.Category;
import model.Customer;
import model.Issue;


public class BookDAO {
DbConnection db = new DbConnection();

public int AddBook(Book book) {
	try {
		String query = "insert into book(Bk_title,publisher,author) values(?,?,?)";
		PreparedStatement st = db.con.prepareStatement(query);
		
		st.setString(1, book.getBookName());
		st.setString(2, book.getBookPublisher());
		st.setString(3, book.getBookAuthor());
	

		
		return db.manipulate(st);
		
		
	}catch(SQLException e) {
		e.printStackTrace();
		return 0;
	}
}

public int IssueBook(Issue issue) {
	try {
		String query = "insert into issue_book(bookname,membername,issue_date,return_date) values(?,?,?,?)";
		PreparedStatement st = db.con.prepareStatement(query);
		
		st.setString(1, issue.getBookName());
		st.setString(2, issue.getMemName());
		st.setString(3, issue.getIssueDate());
		st.setString(4, issue.getReturnDate());
		return db.manipulate(st);
		}catch(SQLException e) {
		e.printStackTrace();
		return 0;
	}
}
public int CategoryBook(Category category) {
	try {
		String query = "insert into category(categoryName,desc) values(?,?)";
		PreparedStatement st = db.con.prepareStatement(query);
		
		st.setString(1, category.getCategoryName());
		st.setString(2, category.getCategoryDesc());
		
		return db.manipulate(st);
		}catch(SQLException e) {
		e.printStackTrace();
		return 0;
	}
}










 //login customer
public Customer loginCustomer (String username, String password) {
	String query;
	query= "select * from customer where username=' "+username +"' and password='" +password +"';";
	ResultSet rs = db.retrieve(query);
	Customer customer= null;
	
	try {
		while(rs.next()) {
			customer = new Customer();
			customer.setCustID(rs.getInt("custID"));
			customer.setCustFname(rs.getString("custFname"));
			customer.setCustLname(rs.getString("custLname"));
			customer.setGender(rs.getString("gender").charAt(0));
			customer.setAddress(rs.getString("address"));
			customer.setUsername(rs.getString("username"));
			}
	
	}catch(Exception ex) {
		System.out.println("Error"+ ex);
	}
	
	return customer;
	

}
public List<Customer> getAllCustomers() {
	String query;
	query = "select * from customer";
	db = new DbConnection();
	ResultSet rs = db.retrieve(query);
	List<Customer>lstCustomers = new ArrayList<Customer>();
	
	try {
		while(rs.next()) {
			Customer customer = new Customer();
			customer.setCustID(rs.getInt("custID"));
			customer.setCustFname(rs.getString("custFname"));
			customer.setCustLname(rs.getString("custLname"));
			customer.setGender(rs.getString("gender").charAt(0));
			customer.setAddress(rs.getString("address"));
			customer.setUsername(rs.getString("username"));
			
			lstCustomers.add(customer);
		}
	}catch(Exception ex) {
		System.out.print("Error" + ex);
	}
	return lstCustomers;
}

}