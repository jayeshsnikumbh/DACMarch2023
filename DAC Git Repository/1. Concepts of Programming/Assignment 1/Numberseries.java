//Print series of any number
import java.util.*;

class Numberseries {
	public static void main( String []args ) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println(" Enter Number : ");
	int num = sc.nextInt();
	
	System.out.print(" The Number Series for entered number is :");
	for( int i=1; true; i++ ) {
		int series = num * i;
		System.out.print(" " + series);
	}	
	}
}