package Association_programs;

public class car { 
	String Model ; 
	double price ; 
	String color ; 
	engine x ; 
	public car (String Model , double price , String color,engine x ) {
		this.Model=Model; 
		this.price=price ; 
		this.color=color;
		this.x=x;
		
	}
	public void displaycarinfo() {
		System.out.println("Model= "+this.Model+ " Price= "+this.price+ " color= "+this.color);
	}

}
