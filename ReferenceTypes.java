public class ReferenceTypes {
	public static void main(String[] args) {

		//I am Listing my errors so I can learn from them
		//When creating the Data type for a string I did not capitalize the s in String
		//This led to the error
				/*
				ReferenceTypes.java:4: error: cannot find symbol
				string CreatorName = "Kevin!";
				^
		  		symbol:   class string
		  		location: class ReferenceTypes
				ReferenceTypes.java:6: error: cannot find symbol
				System.put.println(CreatorName);
				      ^
		  		symbol:   variable put
		  		location: class System
				2 errors
				*/
		String CreatorName = "Kevin!";

		System.out.println(CreatorName);
	}
}

//What did I Learn
/*
From what I can see the Syntax can be somewhat unforgiving, I am still learning and I
am attempting to learn Java while not having touched a computer to program for a few weeks

Besides that
Pros:
Java from what I see a Language very similar to C++ 
Cons: 
Java must be written with more keywords

Things to work on 
-----------------
Remeber how to start the program
	i.e 
	public class <nameoffile> {
		public static void main(String[] args){

			This is where the Data Types are defined

			This is where we print the data type (so far what we have learned)
		}
	}

	
*/