package model;


public class Issue {
    private String BookName;
    private String MemName;

    private String IssueDate;
    private String ReturnDate;
    private int ISBN;
    
    
    public Issue(int ISBN, String bookName, String IssueDate, String ReturnDate) {
		// TODO Auto-generated constructor stub
    	this.ISBN=ISBN;
    	this.BookName=bookName;
    	this.IssueDate=IssueDate;
    	this.ReturnDate=ReturnDate;
    	
	}
	public Issue(String bookname2, String memname2, String issdate, String returnDate2) {
		// TODO Auto-generated constructor stub		
    	this.BookName=bookname2;
    	this.MemName=memname2;
    	this.IssueDate=issdate;
    	this.ReturnDate=returnDate2;
	}
	public int getISBN() {
        return ISBN;
    }
    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }
    public String getBookName() {
        return BookName;
    }
    public void setBookName(String bookName) {
        BookName = bookName;
    }
    public String getMemName() {
        return MemName;
    }
    public void setMemName(String memName) {
        MemName = memName;
    }
    public String getIssueDate() {
        return IssueDate;
    }
    public void setIssueDate(String issueDate) {
        IssueDate = issueDate;
    }
    public String getReturnDate() {
        return ReturnDate;
    }
    public void setReturnDate(String returnDate) {
        ReturnDate = returnDate;
    }
   
    
}
