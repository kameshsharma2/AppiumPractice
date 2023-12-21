package oopsConcepts1;

public class AbstractClasssForEncapsulation {

	private String name;

	   // Getter
	   public String getName() {
	     return name;
	   }

	   // Setter
	   public void setName(String newName) {
	     this.name = newName;
	   }
}


/*
 * The meaning of Encapsulation, is to make sure that "sensitive" data is hidden
 * from users. To achieve this, you must:
 * 
 * declare class variables/attributes as private provide public get and set
 * methods to access and update the value of a private variable
 * 
 * The get method returns the variable value, and the set method sets the value.
 * 
 * Syntax for both is that they start with either get or set, followed by the
 * name of the variable, with the first letter in upper case:
 */
