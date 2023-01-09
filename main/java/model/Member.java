package model;
public class Member {



	private int MemId;
    private String memFname;
    private String memLname;
    private char gender;
    private int age;
    private String contact;
    private String Email;
    
    public Member(String memFname,String memLname,char gender,String Email){
        this.memFname=memFname;
        this.memLname=memLname;
        this.gender=gender;
//        this.contact=contact;
        this.Email=Email;

    }


    public Member(String memFname, String memLname, char gender,int age, String phoneNo) {
		// TODO Auto-generated constructor stub
    	this.memFname=memFname;
    	this.memLname=memLname;
    	this.gender=gender;
    	this.age=age;
    	this.contact=phoneNo;
    
	}


	public Member(String memFname2, String memLname2, char gender2, int age2, String phoneNo, String username) {
		// TODO Auto-generated constructor stub
		this.memFname=memFname2;
    	this.memLname=memLname2;
    	this.gender=gender2;
    	this.age=age2;
    	this.contact=phoneNo;
    	this.Email=username;
	}


	public String getEmail() {
    	return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getContact() {
            return contact;
        }

        public void setContact(String contact) {
            this.contact = contact;
        }

    public String getMemLname() {
        return memLname;
    }

    public void setMemLname(String memLname) {
        this.memLname = memLname;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getMemId() {
        return this.MemId;
    }

    public void setMemId(int MemId) {
        this.MemId = MemId;
    }
    public String getMemFname() {
        return this.memFname;
    }

    public void setMemFname(String memFname) {
        this.memFname = memFname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


	    
	    
	    

	    
	    

	   
	  



	   

	  
	   

	}





