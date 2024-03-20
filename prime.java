import java.text.BreakIterator;
import java.util.Iterator;
import java.util.Scanner;

public class prime {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter a number : ");
	int number = scanner.nextInt();
	
	boolean isprime = true;
	
	if (number<2) {
		
		isprime = false;
	
	}
	
	for(int i = 2; i<number ; i++) {
		if (number % i == 0) {
			
			isprime = false;
			break;
		}
	}
		
	if (isprime) {
		System.out.println("The number you entered is prime.");
	}
	else {
		System.out.println("The number you entered is not prime.");
	}
	
	
	
	
}
}