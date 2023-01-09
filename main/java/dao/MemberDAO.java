package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DbConnection;
import model.Customer;
import model.Member;

public class MemberDAO {
DbConnection db = new DbConnection();

public int AddMember(Member member) {
	try {
		String query = "insert into member(Fname,Lname,gender,age,contact,Email) values(?,?,?,?,?,?)";
		PreparedStatement st = db.con.prepareStatement(query);
		
		st.setString(1, member.getMemFname());
		st.setString(2, member.getMemLname());
		st.setString(3, String.valueOf(member.getGender()));
		st.setInt(4, member.getAge());
		st.setString(5, member.getContact());
		st.setString(6, member.getEmail());
		
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