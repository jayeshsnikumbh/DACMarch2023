//Write a Java Program to print all the Prime Factors of the Given Number
import java.util.*;

class Primefactors {
	
	public static boolean isPrime(int checkprime) {
		boolean isPrime = true;		
		if (checkprime == 2) {
			isPrime = true;
			return true;
		} else {
			for ( int i=2; i<=checkprime/2; i++ ) {
				if (checkprime % i == 0) {
				isPrime = false;
				break;
			}
			}
	}		return isPrime;
	}
	public static void main( String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Number : ");
		int num = sc.nextInt();
		
		System.out.print(" Prime Factors are :");
		for (int i = 2; i <= num/2; i++) {
			if (isPrime(i)) {
				if ( num%i == 0 ) {
					System.out.print(" " + i);
				} else {
					continue;
				}
			}
		} 
		
		
	}
	
	
	
	
}
