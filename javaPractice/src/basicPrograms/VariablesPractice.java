package basicPrograms;

public class VariablesPractice {

	public static void main(String[] args) {

		//Initialization and Declaration of Variables
		int myNum = 5;
		float myFloatNum = 5.99f;
		char myLetter = 'D';
		boolean myBool = true;
		String myText = "Hello";
		final int x = 10; //Cannot change the value later.


		System.out.println(myFloatNum); //Priniting the variable
		System.out.println(myLetter); //Priniting the variable
		System.out.println(myBool); //Priniting the variable
		System.out.println(myText); //Priniting the variable
		System.out.println(x+ myNum); //Priniting the variable
	}
}


/*
 * String - stores text, such as "Hello". String values are surrounded by double
 * quotes int - stores integers (whole numbers), without decimals, such as 123
 * or -123 float - stores floating point numbers, with decimals, such as 19.99
 * or -19.99 char - stores single characters, such as 'a' or 'B'. Char values
 * are surrounded by single quotes boolean - stores values with two states: true
 * or false
 */


/**
 * Names can contain letters, digits, underscores, and dollar signs Names must
 * begin with a letter Names should start with a lowercase letter and it cannot
 * contain whitespace Names can also begin with $ and _ (but we will not use it
 * in this tutorial) Names are case sensitive ("myVar" and "myvar" are different
 * variables) Reserved words (like Java keywords, such as int or boolean) cannot
 * be used as names
 */