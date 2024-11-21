import java.util.Scanner;
public class IT24201239Lab4Q1{

	public static void main(String[]args){

	// Create a Scanner object 
	Scanner input = new Scanner(System.in);
	
	// ask the user to enter a number
	System.out.print("Enter a number:");

	// Read the entered number and store it in the variable 'num'
	int num = input.nextInt();
	
	 // Use an if-else if-else structure to check the sign of the number
		if (num > 0) {
			// If the number is greater than zero, it's positive
			System.out.println("The number is: Positive");
		} else if (num < 0) {
			// If the number is less than zero, it's negative
			System.out.println("The number is: Negative");
		} else {
			// If the number is neither greater nor less than zero, it must be zero
			System.out.println("The number is zero");
		}
	
	// Close the Scanner 
	  input.close();
	}
}
