//Check wheather the given number is Positive or negative
import java.util.*;
class PosistiveOrNegative {
	public static void main( String args[] ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter Number : ");
		int num = sc.nextInt();
		
		if ( num==0 ) {
			System.out.println(" Entered number is neither Positive nor Negative ");
		} else {if (num > 0) {
			System.out.println(" Entered Number is Positive ");
		}	else {
				System.out.println(" Entered Number is Negative ");
			}
		}	
		
		
	}


}