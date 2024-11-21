import java.util.Scanner; // importing a scanner class
public class IT24201239Lab4Q2 {
	
	public static void main (String[]args) {

	// Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
		
	// Declaring required variables
	double examMarks, labMarks, examPercentage, labPercentage;
	
	//ask the user to input the exam marks
	System.out.print("Please enter the exam marks (out of 100):");
	examMarks = input.nextDouble();
	
	//validate the entered marks
	if (examMarks < 0 || examMarks > 100) {
		System.out.println("Invalid input for exam marks. Terminating program.");
		return; //The program will exit
	}
	
	//ask the user to input the lab marks
	System.out.print("Please enter thelab submission marks (out of 100):");
	labMarks = input.nextDouble();
	
	//validate the entered marks
	if (labMarks < 0 || labMarks > 100) {
		System.out.println("Invalid input for Lab submission marks. Terminating program.");
		return; //The program will exit
	}
	
	//ask the user to input the percentage for exam marks
	System.out.print("Please enter the percentage given for the exam: ");
	examPercentage = input.nextDouble();
	
	//ask the user to input the percentage for lab submission marks
	System.out.print("Please enter the percentage given for the lab submission: ");
	labPercentage = input.nextDouble();
	
	//validating the percentages
	if (examPercentage + labPercentage != 100) {
		System.out.println("The percentage must add up to 100. Terminating program.");
		return; //exit the program
	}
	
	//calculating the final marks
	double finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage /100);
	
	// Display the final mark
	System.out.println("The final exam mark is: " + finalMark);

	input.close();
    }
}