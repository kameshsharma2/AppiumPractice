package baiscPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Del {
	public static void main(String[] args) {

		String s= "This is palindromeu";
		char[]vowels = {'a','e','i','o','u'};
		char[] c = s.toCharArray();

		int vowelscount=0;
		int repeatedcount=0;
		
		  Map <Character,Character> obj = new HashMap<Character,Character>(); ArrayList
		  obj2 = new ArrayList();
		 		for(int i= 0; i<vowels.length;i++) {
			for(int j=0;j<c.length;j++) {

				if(c[j]==vowels[i]) {
					obj.put(vowels[i], c[j]);
					if(obj.containsKey(vowels[i])) {
						
						System.out.println("This is the repeated character: "+ obj.get(vowels[i])+ repeatedcount); 
						 repeatedcount++;
					}
					
					System.out.println("These are the vowels present in the given string: "+c[j]);
					vowelscount++;
				}
				//	if(c[i]==vowels[i]) {

			}
		}

		System.out.println(vowelscount);	
	}
}
//1) Repeated vowels count,
//2) Repeated letters