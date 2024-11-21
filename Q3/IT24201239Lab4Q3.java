import java.util.Scanner;
public class IT24201239Lab4Q3{

	public static void main(String[]args){

	//create a scanner object
	Scanner input = new Scanner(System.in);

	//asking the user to input a number
	System.out.print("Enter a number:");

	//declaring and storing the number
	int num = input.nextInt();
	
	//using ternary operator
	// If the number is greater than 0, the result is "positive"
		String result = (num > 0)?"The number is: positive" : 
		// If the number is less than 0, the result is "negative"	
				(num < 0)?"The number is: Negative" :
		 // Otherwise, the number is zero
				"The number is zero";
	
	//displaying the output	
	System.out.println(result);

	 // Close the Scanner object to release resources
        input.close();	
	}
}