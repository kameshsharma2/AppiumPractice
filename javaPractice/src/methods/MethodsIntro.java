package methods;

public class MethodsIntro {
	public static void myMethod() {
		System.out.println("I just got executed!");
	}
	
	//Enters x and y values 
	static int myMethod(int x, int y) {
		return x + y; 
	}

	//Checking Age 
	 static void checkAge(int age) {

		    // If age is less than 18, print "access denied"
		    if (age < 18) {
		      System.out.println("Access denied - You are not old enough!");

		    // If age is greater than, or equal to, 18, print "access granted"
		    } else {
		      System.out.println("Access granted - You are old enough!");
		    }
	 }
	public static void main(String[] args) {
		myMethod();
		myMethod();
		myMethod();

		//Method Adding Parameters
		int z = myMethod(5, 3);
		System.out.println(z); //outputs 8

		//Age Check
		checkAge(20); // Call the checkAge method and pass along an age of 20
	}

}
