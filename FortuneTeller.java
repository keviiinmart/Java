import java.util.Scanner;

public class FortuneTeller{
	static public void main(String [] args){
		//Declarations
		int errorCheck = 5;
		int inputValue = 0;

		System.out.println("Please input a Number between 1 and 10:");
		//Input
		Scanner input = new Scanner(System.in);
		inputValue = input.nextInt();

		if (inputValue < errorCheck) {
			System.out.println("your number is less than 5");
		}
		else{
			System.out.println("Your number is 5 or greator");
		}
	}
}