package baiscPrograms;

public class StringRevPalindormeCheck {

	public static void doRev(String x) {  //whenever loop runs one word will come here (ex: dad, mom,etc..,)
		char[] y = x.toCharArray();
		String z = "";
		for(int j=y.length-1;j>=0;j--) {
			z = z+y[j];
		}
//		System.out.print(" "+z);
		if(x.equals(z)) {
			System.out.println("This is palindrome String: "+ x);
		}
		else {
			System.out.println("This is not palindrome String: "+ x);
		}
	}
	public static void main(String[] args) {
		String a ="dad mom child dad";
		String[] b=a.split(" ");
		for(int i=0; i<=b.length-1;i++) {
//			System.out.print("The forward string is: "+b[i]);	
			doRev(b[i]); //for one string word in each loop
		}
	
	}

}
