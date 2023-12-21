package arraysPractice;

public class Arrays {
	public static void main(String[] args) {
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars[0]);
		System.out.println(cars.length); // Length of an element, Outputs 4

		//Changing an Element
		String[] cars1 = {"Volvo", "BMW", "Ford", "Mazda"};
		cars1[0] = "Opel";
		System.out.println(cars1[0]);
		// Now outputs Opel instead of Volvo

		//Loop in Array
		String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars2) {
			System.out.println(i);
		}  
	}	
}