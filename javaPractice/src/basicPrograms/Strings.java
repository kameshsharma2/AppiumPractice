package basicPrograms;

public class Strings {

	public int add() {
		int x = 10;
		int y = 20;
		int z = x + y;  // z will be 1020 (a String)
		return z;
		
	}
	public static void main(String[] args) {
		String txt = "Hello World";
		System.out.println("The length of the txt string is: " + txt.length()); //Finding Length of the String
		System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
		System.out.println(txt.toLowerCase());   // Outputs "hello world"

		//Finding location of the String word
		String txt1 = "Please locate where 'locate' occurs!";
		System.out.println(txt1.indexOf("locate")); // The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):Outputs 7
		System.out.println("Started"+ txt1.startsWith(txt1));
		//Concatenation
		String firstName = "John";
		String lastName = "Doe";
		System.out.println(firstName + " " + lastName);
		System.out.println(firstName.concat(lastName));

		
		String s2 = new String("Kamesh");
		System.out.println("Print my name: "+ s2);
		Strings obj = new Strings();
		System.out.println(obj.add());
		
		String a = "Kamesh";
		String b = "Sharma";
		System.out.println(a==b);
		
	}
}

/*
 * Escape character Result Description \' ' Single quote \"	" Double quote \\ \
 * Backslash The sequence \" inserts a double quote in a string:
 * 
 * Other common escape sequences that are valid in Java are:
 * 
 * Code Result Try it \n New Line \r Carriage Return \t Tab \b Backspace \f Form
 * Feed
 */