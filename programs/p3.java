package programs;

public class p3 {
	static int num=1; 
	static int sum=0; 
	public static void main(String[] args) {
		if(num<=100) {
			sum+=num;
			main(null); 
		}
		else {
			System.out.println(sum);
		}
	}

}
