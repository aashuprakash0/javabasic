package Object_Programs;

public class student {
	String sname; 
	int regno; 
	float percentage; 
public student(String sname,int regno,float percentage) {
	this.sname=sname; 
	this.regno=regno; 
	this.percentage=percentage; 
}
public static void main(String[] args) {
	student s1 = new student("Ramu", 111, 65);
	student s2 = new student("Tejashwi", 222, 75);
	student s3 = new student("Shubham", 333, 85);
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s3.hashCode());
}

}
