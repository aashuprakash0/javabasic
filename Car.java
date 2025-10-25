package Object_Programs;



public class Car implements Cloneable {
	String model; 
	String color; 
	double price; 
   public Car(String model,String color,double price) {
	this.model=model; 
	this.color=color; 
	this.price=price;
}
   public String toString() {
	return "Model="+this.model+ ",Color="+this.color+ ",price="+this.price;  
   }
   public static void main(String[] args) {
	 Car x = new Car("BMW", "Blue", 8500000);
	 Car[] obj = new Car[5];
	 for (int i = 0; i < obj.length; i++) {
		try {
			obj [i]=(Car)x.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e);
		}
	 System.out.println("--------------------------");
	 
	 System.out.println(obj[i].toString());
	 }
}

}
