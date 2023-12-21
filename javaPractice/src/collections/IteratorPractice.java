package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPractice {
	public static void main(String[] args) {

		// Make a collection
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

		// Get the iterator
		Iterator<String> it = cars.iterator();

		// Print the first item
		System.out.println(it.hasNext());

		
		//Iterator using integers
		
		 ArrayList<Integer> numbers = new ArrayList<Integer>();
		    numbers.add(12);
		    numbers.add(8);
		    numbers.add(2);
		    numbers.add(23);
		    Iterator<Integer> it1 = numbers.iterator();
		  
		    while(it1.hasNext()) {
		      Integer i = it1.next();
		      if(i < 10) {
		        it1.remove();
		      }
		    }
		    System.out.println(numbers);
		
	}
}
