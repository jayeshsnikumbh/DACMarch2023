//Swap two numbers without using the third variable approach
import java.util.*;
class SwapTwoNumbers {
	public static void main( String args[] ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter Two Numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println(" Numbers Entered are : " + num1 + " and " + num2);
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println( " Swapped Numbers are : " + num1 + " and " + num2);		
	
	}
}