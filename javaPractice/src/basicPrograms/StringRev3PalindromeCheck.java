package basicPrograms;

public class StringRev3PalindromeCheck {

	public static boolean isPalindrome(String a) { //whenever loop runs one word will come here (ex: dad, mom,etc..,)
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
		String str = "dad mom child dad ";
		String[] s  = str.split(" ");
		System.out.println("Length of s: "+s.length);
		for(int i=0;i<=s.length-1;i++) {
			//	String str1 = s[i];
			if(isPalindrome(s[i])) {//for one string word in each loop
				System.out.println(s[i]);
			}
		}
	}	
}
/*
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