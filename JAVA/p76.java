package JAVA;

public class p76 {
	public static void main(String[] args) {
		System.out.println("Main Begin");
		int i=1;
		while(i<=5) {
			if(i==2||i==3|i==4)
			{
				i++;
				continue; 
			}
			System.out.println(i);
			i++;
		}
		System.out.println("Main End");
		
		
	}

}
