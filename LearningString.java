/*
	In this example I am learning how to use keywords such as charAt
*/


public class LearningString{
	static public void main(String[] args){
		//Declarations
		String firstName = "Lebron";
		String lastName = "James";
		char studentFirstInitial = firstName.charAt(0);
		char studentLastInitial = lastName.charAt(0);

		//Print out first name, last name, first name intial, last name intial
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(studentFirstInitial);
		System.out.println(studentLastInitial);

	}
}