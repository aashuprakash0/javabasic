package Object_Programs;

public class EMPLOYEE {
	String ename ; 
	int eid; 
	double sal; 
	public EMPLOYEE(String ename,int eid,double sal) {
		this.ename=ename; 
		this.eid=eid;
		this.sal=sal; 
	}
	public String toString() {
		return "Ename = "+this.ename+ ", Eid= "+this.eid+ ", Sal= "+this.sal;
		}
	public static void main(String[] args) {
		EMPLOYEE e1 = new EMPLOYEE("Umang", 111, 600000);
		EMPLOYEE e2 = new EMPLOYEE("Ramu", 222, 500000);
		EMPLOYEE e3 = new EMPLOYEE("Shubham", 333 , 400000);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}

}
