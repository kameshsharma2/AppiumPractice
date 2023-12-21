package baiscPrograms;

public class ReversingCompleteString {
	 

	public static void doRev(String a) {
		char []b = a.toCharArray();
		String c = "";
		for(int j=b.length-1;j>=0;j--) {
			c = c+b[j];			
		}	
		//return c;
		System.out.print(" "+c);

}
	
	public static void main(String[] args) {
		String x = "This is my Time";
		String[] y =x.split(" ");
		for(int i=y.length-1;i>=0;i--) {
//			System.out.println(y[i]);
			doRev(y[i]);
		}
	}
}