package collections;

public class Del3 {
	static String s = "dad mom child dad";
	static String[] a =s.split(" ");
	static String one;
	static String rev;

	public static String doOne() {
		for(int i=0;i<=a.length-1;i++) {		
	
			System.out.println("This is String one: "+ a[i]);
	}
		return one;
	}
	public static String doRev() {
		for(int j=a.length-1; j>=0;j--) {		
			rev = "";
			rev = rev + a[j];	
			System.out.println("This is String one: "+ rev);
		}
		return one;
	}
	public static void doCompare() {
		if(one==rev) {
			System.out.println("This is palindrome");
		}
		else {
			System.out.println("This is not palindrome");
		}
	}
	public static void main(String[] args) {		
		doOne();
		doRev();
		doCompare();
	}
}