import java.util.Scanner;

public class Fib{
	static public void main(String [] args)
	{
		//Declarations
		//Used long instead of int to usee bigger numbers
		long fibValue1 = 0;
		long fibValue2 = 1;
		long fibValue3 = fibValue1 + fibValue2;
		long userInput = 0;

		//Question 
		System.out.println("Input a number to see if that number is a value in the sequence:");


		//Takes input
		Scanner input = new Scanner(System.in);
		userInput = input.nextInt();

		System.out.println("\n" + fibValue1 + " + " + fibValue2 + " = " + fibValue3);
		//Fibonacci algorithmn
		while(userInput > fibValue3)
		{
			
			fibValue1 = fibValue2;
			fibValue2 = fibValue3;
			fibValue3 = fibValue1 + fibValue2;
			System.out.println("\n" + fibValue1 + " + " + fibValue2 + " = " + fibValue3);
		}

		//Checks to see if it is in the Fibonacci Sequence
		if(userInput == fibValue3)
		{
			System.out.println("\nThe number " + userInput + " is apart of the Fibonacci sequence ");
		}
		else
		{
			System.out.println("\nThe number " + userInput + " is NOT apart of the Fibonacci sequence ");
		}
		//System.out.println(userInput);

	}
}