package collections;

public class Del2 {
	static String str1="";
	static String str2="";
	public static String fullString(){
		String a = "This is postive";
		String[] b = a.split(" ");
		
		for(int i=0; i<=b.length-1; i++) {
			str1 = str1+b[i];
			System.out.println(str1);
		}
		return str1;
	}
	public static String reverseString(String c) {
		char[] d = c.toCharArray();
		
		for(int j = d.length-1;j>=0;j--) {
			str2 = str2+d[j];
			System.out.println("This is reverse: "+str2);
		}
		return str2;
	}
	public static void doCheck() {
		if(str1 == str2) {
			System.out.println("This is palindorme");
		}
		else {
			System.out.println("This is not palindrome");
		}
	}
	public static void main(String[] args) {
		fullString();
		reverseString(str1);
		doCheck();
	}
}