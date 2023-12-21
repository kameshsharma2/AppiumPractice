package exceptionHandling;

public class ThrowsDeclaration {
	static void checkAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("Access denied - You must be at least 18 years old."); //Declaring exception type if occurred
		}
		else {
			System.out.println("Access granted - You are old enough!");
		}
	}
	public static void main(String[] args) {
		checkAge(15); // Set age to 15 (which is below 18...)
	}
}
