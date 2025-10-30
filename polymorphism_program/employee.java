package polymorphism_program;

public class employee {
	String ename; 
	int eid;
	double sal ; 
	public employee(String ename, double sal, int eid) {
		this.ename=ename ;
		this.eid=eid ; 
		this.sal=sal; 
		}
	public  void Displayemployeeinfo()
	{
		System.out.println("Ename="+this.ename+ " Eid="+this.eid+"Sal="+this.sal);
	}
public void work()
{
	System.out.println("I work as a Employee");
}
}
