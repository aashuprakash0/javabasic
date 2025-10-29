package Association_programs;

public class engine {
	int cc ; 
	float mileage; 
	public engine(int cc , float mileage) {
		this.cc=cc; 
		this.mileage=mileage; 
	}
	public void displayengineinfo() {
	  System.out.println("CC= "+this.cc+ "mileage= "+this.mileage);	
	}
}
