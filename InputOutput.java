import java.util.Scanner;

public class InputOutput{
	//Correction: Correct syntax would be
	static public void main(String[] args){
		//Definitions
		String firstName = "Lebron";
		String lastName = "James";
		char firstNameIntial = firstName.charAt(0);
		char lastNameIntial = lastName.charAt(0);
		double studentGPA = 0.0;

		//Printing Strings and Char to display
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(firstNameIntial);
		System.out.println(lastNameIntial);


		System.out.println("What is the GPA?");
		//Syntax Error was made here
			//Error: input.nextdouble();
			//Correction: input.nextDouble();
		//I needed to capitalize the D in dounle to use that function
		
		Scanner input = new Scanner(System.in);
		studentGPA = input.nextDouble();



		System.out.println(studentGPA);

	}
}