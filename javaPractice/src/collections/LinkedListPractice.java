package collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListPractice {
	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();   //Taking all values to linkedlist and assigning to carsobject
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

		// Use addFirst() to add the item to the beginning
		//cars.addFirst("Mazda");

		//Use addLast() to add the item to the end
		//cars.addLast("Mazda");

		// Use removeFirst() remove the first item from the list
		// cars.removeFirst(); 

		// Use removeLast() remove the last item from the list
		//cars.removeLast();

		// Use getFirst() to display the first item in the list
		// System.out.println(cars.getFirst());

		// Use getLast() to display the last item in the list
		System.out.println("Before sorting: "+ cars);
		 System.out.println("Before Sorting Last value is "+cars.getLast());
		
		Collections.sort(cars);  

		System.out.println("After Sorting: "+cars);
		System.out.println("After Sorting Last value is "+cars.getLast());

	}
}


/*
 * The LinkedList class is a collection which can contain many objects of the
 * same type, just like the ArrayList.
 * 
 * The LinkedList class has all of the same methods as the ArrayList class
 * because they both implement the List interface. This means that you can add
 * items, change items, remove items and clear the list in the same way.
 * 
 * However, while the ArrayList class and the LinkedList class can be used in
 * the same way, they are built very differently. The LinkedList stores its
 * items in "containers." The list has a link to the first container and each
 * container has a link to the next container in the list. To add an element to
 * the list, the element is placed into a new container and that container is
 * linked to one of the other containers in the list.
 * 
 * Use an ArrayList for storing and accessing data, and LinkedList to manipulate
 * data.
 * 
 */