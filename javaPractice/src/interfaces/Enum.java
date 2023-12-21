package interfaces;

enum Level {
	LOW,
	MEDIUM,
	HIGH
}

public class Enum {
	public static void main(String[] args) {
		Level myVar = Level.MEDIUM;

		switch(myVar) {
		case LOW:
			System.out.println("Low level");
			break;
		case MEDIUM:
			System.out.println("Medium level");
			break;
		case HIGH:
			System.out.println("High level");
			break;
		}
		for (Level myVar1 : Level.values()) {
			System.out.println(myVar1);
		}
	}

}

/*
 * 
 * An enum is a special "class" that represents a group of constants
 * (unchangeable variables, like final variables).
 * 
 * To create an enum, use the enum keyword (instead of class or interface), and
 * separate the constants with a comma. Note that they should be in uppercase
 * letters:
 */