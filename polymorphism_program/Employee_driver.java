package polymorphism_program;

public class Employee_driver {
	public class Employee {

	}

	public static void main(String[] args) {
		employee e1 = new tester("AASHU", 111, 2000000) ; 
		employee e2 = new devloper("Prakash", 220, 3000000);
		employee e3 = new HR("Shubham", 333,600000);
		employee[] x= {e1,e2,e3};
		for (int i = 0; i < x.length; i++) {
			x[i].Displayemployeeinfo();
			x[i].work();
			System.out.println("-------------------------");
		}
	}
	

}
