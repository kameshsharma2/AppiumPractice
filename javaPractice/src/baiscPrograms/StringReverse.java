package baiscPrograms;

public class StringReverse {
	public static void main(String[] args) {
		//	 System.out.println(new StringBuilder("Automation").reverse());// Method1
		String str = "Saket Saurav";
		char chars[] = str.toCharArray();  // converted to character array and printed in reverse order
		for(int i = 0; i<=chars.length-1; i++) {
			System.out.print(chars[i]);
		}
		System.out.println("");
		for(int i= chars.length-1; i>=0; i--) {
			System.out.print(chars[i]);
		} 

	}
}