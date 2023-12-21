package oopsConcepts;

public class Modifiers {
	// Static method
	static void myStaticMethod() {
		System.out.println("Static methods can be called without creating objects");
	}

	// Public method
	public void myPublicMethod() {
		System.out.println("Public methods must be called by creating objects");
	}

	// Main method
	public static void main(String[ ] args) {
		myStaticMethod(); // Call the static method
		// myPublicMethod(); This would output an error

		Modifiers myObj = new Modifiers(); // Create an object of Main
		myObj.myPublicMethod(); // Call the public method
	}

}

/*
 * The public keyword is an access modifier, meaning that it is used to set the
 * access level for classes, attributes, methods and constructors.
 * 
 * We divide modifiers into two groups:
 * 
 * Access Modifiers - controls the access level Non-Access Modifiers - do not
 * control access level, but provides other functionality
 * 
 * 
 * Access Modifiers public The class is accessible by any other class. default
 * The class is only accessible by classes in the same package. private The code
 * is only accessible within the declared class. protected The code is
 * accessible in the same package and subclasses.
 * 
 * Non- Access Modifiers final The class cannot be inherited by other classes
 * abstract The class cannot be used to create objects final Attributes and
 * methods cannot be overridden/modified static Attributes and methods belongs
 * to the class, rather than an object abstract Can only be used in an abstract
 * class, and can only be used on methods. transient Attributes and methods are
 * skipped when serializing the object containing them synchronized Methods can
 * only be accessed by one thread at a time volatile The value of an attribute
 * is not cached thread-locally, and is always read from the "main memory"
 */