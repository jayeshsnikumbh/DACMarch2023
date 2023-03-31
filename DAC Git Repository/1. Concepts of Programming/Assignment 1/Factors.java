// Write a Java Program to print all the Factors of the Given number
import java.util.*;

class Factors {
	public static void main( String args[] ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter Number to find factors : ");
		int num = sc.nextInt();
		
		System.out.print(" Factors of the number are : ");		
		for ( int i=1; i<=num/2; i++ ) {			
			if (num%i==0) {
				System.out.print(" "+i);
				
			}			
		}	
		System.out.print(" " + num);
	}	
}