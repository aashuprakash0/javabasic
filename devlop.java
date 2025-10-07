package inheritance_program;

public class devlop extends emp {
 String technology ; 
 public devlop(String ename , int eid , double sal, String technology) {
	super(ename,eid,sal);
	this.technology=technology ; 
 }
 public void devloper()
 {
	 System.out.println("I am devloper of "+this.technology);
 }	
}

