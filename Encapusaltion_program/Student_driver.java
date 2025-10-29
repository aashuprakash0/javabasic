package Encapusaltion_program;

public class Student_driver {
	public static void main(String[] args) {
		 student S = new student("Shubham",4563 , "Mechanical") ; 
		 System.out.println(S.get_sname());
		 System.out.println(S.get_usn());
		 System.out.println(S.get_branch());
		 System.out.println("----------------");
		 S.set_sname("Shubham Kumar");
		 System.out.println(S.get_sname());
		 System.out.println(S.get_usn());
		 System.out.println(S.get_branch());
		 
		 
	}

}
