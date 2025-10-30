package JAVA;
/*WAP to check whether character id vowel or consonant*/
public class p59 {

	public static void main(String[] args) {
	
		char character = 'z' ;
		switch (character) 
		{
		case ('a'):
		case ('e'):
		case('i'): 
		case ('o'):
		case('u'):
		{
			System.out.println("Vowel");
			break;
		}
		default : {
			System.out.println("Consonant");
		}
		}
		
	}
}
