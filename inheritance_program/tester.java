package inheritance_program;

public class tester extends emp {
     String tester; 
	public tester(String ename, int eid, double sal,String tester) {
		super(ename, eid, sal);
		this.tester=tester ;
	}
		public void test()
		{
			System.out.println("I am a "+this.tester);
		}
	
	}


