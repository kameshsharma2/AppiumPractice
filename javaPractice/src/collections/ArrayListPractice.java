package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {
	public static void main(String[] args) {
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();  //Taking all values to arraylist and assigning to myNumbers object
		myNumbers.add(33);
		myNumbers.add(15);
		myNumbers.add(20);
		myNumbers.add(34);
		myNumbers.add(8);
		myNumbers.add(12);

		Collections.sort(myNumbers);  // Sort myNumbers
		System.out.println("The size is "+ myNumbers.size());
		for (int i : myNumbers) { //It will print sorted numbers because in the last statement using collections class sorted
			System.out.println(i);
		}
	}

}

/*
 * The ArrayList class has a regular array inside it. When an element is added,
 * it is placed into the array. If the array is not big enough, a new, larger
 * array is created to replace the old one and the old one is removed. The
 * LinkedList class is a collection which can contain many objects of the same
 * type, just like the ArrayList.
 * 
 * The LinkedList class has all of the same methods as the ArrayList class
 * because they both implement the List interface. This means that you can add
 * items, change items, remove items and clear the list in the same way.
 * 
 * However, while the ArrayList class and the LinkedList class can be used in
 * the same way, they are built very differently. Use an ArrayList for storing
 * and accessing data, and LinkedList to manipulate data.
 */