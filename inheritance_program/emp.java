package inheritance_program;

public class emp {
 String ename ; 
 int eid ; 
 double sal ; 
  public emp(String ename , int eid , double sal )
  {
	 this.ename=ename ; 
	 this.eid=eid ; 
	 this.sal=sal ; 
  }
  public void displayemployeinfo()
  {
	  System.out.println("Ename="+this.ename+ ", eid=" +this.eid+ ", sal ="+this.sal);
  }
}
