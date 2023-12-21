package collections;
public class Del1{


	public static boolean isPalindrome(String a) {
		String str1 = "";
		for(int j=a.length()-1; j>= 0; j--) {
			str1 = str1+a.charAt(j);	
		}
		if(a.equals(str1)) {
			return true;	
		}
		else {
			return false;	
		}
	}
	public static void main(String[] args) {
		String str = "mom dad mom child dad mom";
		String[] s  = str.split(" ");
		for(int i=0;i<=s.length-1;i++) {
			
			
			for(int j =i+1;j<=s.length-1;j++) {
				if(s[i].equals(s[j])) {
				if(isPalindrome(s[j])) {
					System.out.println(s[j]);
				}
				}
			}
		}	
	}
}
/*String s= "deepaak";
 * 1. Write Java logic to print the non-repeated characters (d, p,k) from the
 * given String? 
 * 
 * 2. Print most repeated character from the String (e)
 * 
 * String str = "dad mom child dad";
3) Write Java logic to print the word which are palindrome from the given string.
Output: dad, mom, dad
4) Print most repeated palindrome word in the given string (dad)

 */