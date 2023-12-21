package oopsConcepts;

public class Classes_Objects {
	int x = 5;
	String y = "Kamesh";
	public static void main(String[] args) {
		Classes_Objects myObj1 = new Classes_Objects();  // Object 1
		Classes_Objects myObj2 = new Classes_Objects();  // Object 2
		System.out.println(myObj1.x); //Outputs 5
		System.out.println(myObj2.y); //Outputs Kamesh
	}
}