package basicPrograms;


public class SentenceReverse {

	public static void main(String[] args) {
		String s = "This is bad time to learn coding";
		String[] a= s.split(" "); // split the words based on space
		// a contains array of words

		// a= ["this", "is", "bad", "time","to","learn","coding"]
//		for(int i=0; i<=a.length-1;i++) {
		for(int i=a.length-1;i>=0;i--) {
			//1st iteration a[0] = this
			System.out.print(" "+reverseString(a[i]));
		}
	}
	public static String reverseString(String k){ //k = this
		char[] ch =  k.toCharArray(); // [t,h,i,s]
		String result = "";
		for(int i=ch.length-1;i>=0;i--){
			result = result+ch[i];
		}
		return result;//result contains reversed string
	}
}