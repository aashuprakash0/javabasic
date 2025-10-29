package Association_programs;


public class driver { 
	public static void main(String[] args) {
		engine e = new engine(40000, 6); 
		car C1 = new car("BMW", 1000000, "Black", e);
		car C2 = new car("AUDI", 90000, "Blue", e) ; 
		car C3 = new car("hyndai",80000, "Red", e) ;
		car  [] ob= {C1,C2,C3} ;
		for (int i = 0; i < 3; i++) {
			ob[i].displaycarinfo();
			ob[i].x.displayengineinfo();
			System.out.println("-----------------------");
		}
		
	}

}
