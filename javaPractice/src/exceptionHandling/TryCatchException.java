package exceptionHandling;

public class TryCatchException {
	public static void main(String[ ] args) {
		try {
			int[] myNumbers = {1, 2, 3};
			System.out.println(myNumbers[10]);// In myNumbers array 11th number is not available
		} catch (Exception e) { //For all kind of exceptions like arthimatic and string outbound like that
			System.out.println("Print"+ e);
			System.out.println("Something went wrong.");
		}
		finally {
			System.out.println("This will print compulsorily despite of exception present or not");
		}
	}
}


//Exception ariases at runtime, ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc