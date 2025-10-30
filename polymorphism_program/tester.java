package polymorphism_program;

public class tester extends employee {

	public tester(String ename, double sal, int eid) {
		super(ename, sal, eid);
		
	}
	public void work()
	{
		System.out.println("I test web applications");
	}
}
