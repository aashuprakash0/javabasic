package Encapusaltion_program;

public class student {
	private String sname ; 
	private int usn ;
	private String branch ; 
	 
	public student(String sname , int usn , String branch) {
		this.sname=sname; 
		this.usn=usn; 
		this.branch=branch; 
	} 
	
	/*Getter Method*/ 
	public String get_sname() {
		return this.sname ; 
	}
	/*Getter Method*/ 
	public int get_usn() {
		return this.usn ; 
	}
	/*Getter Method*/ 
	public String get_branch() {
		return this.branch ; 
	}
	/*Setter Method*/ 
	public void set_sname(String sname) {
		this.sname=sname ; 
	}

}
