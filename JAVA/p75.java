package JAVA;
/*WAP TO Print this pattern 
 * **
 * 
 * * *    */
public class p75 {
  public static void main(String[] args) {
	  int row=3; 
	  int coloumn=3; 
	  int i=1; 
	  while(i<=row) {
		  int j=1;
		   while(j<=coloumn) {
			  if(i==2&&j==2) {
				  break; }
			  System.out.print("*");
			  j++;
	  }
	 	System.out.println("*");
		i++;
	  }
	  }
  }

