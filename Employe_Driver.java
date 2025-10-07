package inheritance_program;

public class Employe_Driver {
	public static void main(String[] args) {
		devlop e1 = new devlop("Jeevan", 111,300000, "Java");
		tester  e2	= new tester("Kartik", 222, 300000, "ATE");
		HR e3 =new HR("Disha",333, 250000);
		e1.displayemployeinfo();
		e1.devloper();
		System.out.println("------------------------------");
		e2.displayemployeinfo();
		e2.test();
		System.out.println("-------------------------------");
		e3.displayemployeinfo();
	}

}
