package Object_Programs;

public class Bike {
	int cc; 
	float mileage;
public Bike(int cc,float mileage) {
	this.cc=cc; 
	this.mileage=mileage;	
}
public boolean equals(Object obj) {
	Bike temp =(Bike)obj; 
	if (this.cc==temp.cc && this.mileage==temp.mileage)
		return true; 
	else 
		return false;
	
}
public static void main(String[] args) {
	Bike RE = new Bike(350, 25);
	Bike yezdi = new Bike(350, 25);
	System.out.println(RE.equals(yezdi));
}

}
