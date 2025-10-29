package Arrays_program;

public class p8 {
	int a=100; 
	int b=200; 
	public static void main(String[] args) {
		p8 [] x= new p8[4];
		x[0]=new p8();
		x[1]=new p8();
		x[2]=new p8();
		x[3]=new p8();
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i].a+ ","+x[i].b);
		}
	}

}
