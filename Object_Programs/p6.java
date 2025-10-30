package Object_Programs;

public class p6 {
		int a =100; 
		int b=200; 
 
		protected void finalize() throws Throwable {
		System.out.println("Pradip wants to visit thailand");
		}
		public static void main(String[] args) {
			p6 ob1=new p6();
			ob1=new p6(); 
			
			p6 ob2 = new p6();
			ob2=null;
			new p6();
			new p6();
			System.gc();
		}

}
