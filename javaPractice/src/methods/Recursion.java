package methods;

public class Recursion {
	public static void main(String[] args) {
		int result = sum(15);
		System.out.println(result);
		int result1 = sum(5, 10);
		System.out.println(result1);
	}


	//If numbers are not defined 
	public static int sum(int k) {
		if (k > 0) {
			return k + sum(k - 1);
		} else {
			return 0;
		}
	}

	//If numbers are defined between the range
	public static int sum(int start, int end) {
		if (end > start) {
			return end + sum(start, end - 1);
		} else {
			return end;
		}
	}
}
