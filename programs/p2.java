package programs;
//Write a program to print odd number from 1 to 100 without using any loop
public class p2 {
static int num=1; 
public static void main(String[] args) {
	if (num<=100) {
		if(num%2 !=0) {
		System.out.println(num);
		}
		num++; 
		main(null);
	}
}
}
