//Check if the given number is EVEN or ODD.
import java.util.*;
class EvenOrOdd {
	public static void main( String args[] ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter Number : ");
		int num = sc.nextInt();
		if( (num%2) == 0 ) {
			System.out.println(" Entered Number is Even ");			
		}	else {
				System.out.println(" Entered Number is Odd ");			
			}
		
	}	
}