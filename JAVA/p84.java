package JAVA;

public class p84 {
	public static void main(String[] args) {
		int row=5;
		int coloumn=5;
		int i=1;
		do {
			int j=1;
			do {
			if((i+j)%2==0)
			{
				System.out.print("1");
			} 
			else {
				System.out.print("0");
			}
			j++;	
			}while(j<=coloumn);
			System.out.println();
			i++;
		}while(i<=row);
	}

}
