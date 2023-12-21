package module1;

public class DataTypesOperators {

	public static void main(String[] args) {

		byte a = 10;				//Byte value holds -128 to 127
		short b = 2000;				//Stores whole numbers from -32,768 to 32,767 
		int c = 5;               	// Stores whole numbers from -2,147,483,648 to 2,147,483,647
		long d = 2000000; 			//Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		float e = 5.99f;   		 	// Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
		double f = 243.1224455; 	//Stores fractional numbers. Sufficient for storing 15 decimal digits
		boolean g = true;       // Stores true or false values
		char h = 'A';         // Stores a single character/letter or ASCII values		    
		String myText = "Welcome";     // String   

		System.out.println("Addition: "+ (a+b));
		System.out.println("Subtraction: "+ (b-c));
		System.out.println("Multiplication: "+ (a*c));
		System.out.println("Division: " +(b/c));
		System.out.println("Incremant Operator: "+ (++d));
		System.out.println("Decremant Operator: "+ (--e));
		System.out.println("Float and Double:" + (e+f) );
		System.out.println("Boolean: " + g );
		System.out.println("Text Concatenation: "+(h+" "+myText) );
	}
}


