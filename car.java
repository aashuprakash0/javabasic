package inheritance_program;

public class car extends vechile {

	public car(String brand, int cc, double milege) {
		super(brand, cc, milege);
	}
	public static void main(String[] args) {
	 car ob = new car("Honda City",1498,17.5555); 
	 System.out.println( "Brand: " + ob.brand +
	            ", Engine CC : " + (++ob.cc) +
	            ", Mileage : " + ob.milege );
	}
	
}
