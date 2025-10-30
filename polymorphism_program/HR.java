package polymorphism_program;

public class HR extends employee {

	public HR(String ename, double sal, int eid) {
		super(ename, sal, eid);
		
	}
	public void work()
	{
		System.out.println("I recruit resources");
	}

}
