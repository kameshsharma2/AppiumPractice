package basicPrograms;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		System.out.println("Please enter S");
		Scanner s = new Scanner (System.in);
		int p = s.nextInt();
		System.out.println("Enter Number s " + p);
		s.close();
	}

}
