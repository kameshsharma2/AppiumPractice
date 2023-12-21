package baiscPrograms;

public class PrimeNumbers {
	public static void main(String[] args) {
		int flag =0;
		int number = 17;
		for(int i=2;i<number;i++ ) {
			if (number%i==0) {
				flag = 0;
				//	System.out.println("Number is not prime");
				break;
			}		
			else {				
				flag =1;
			}
		}	
		if (flag ==1) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Non -Prime Number");
		}
	}

}

/*
 * public static void main(String[] args) { int a = 54; boolean isPrime = true;
 * if(a>1) { for(int i = 2;i<a;i++) { if(a%i==0) { isPrime= false; break; }
 * 
 * } if(isPrime) { System.out.println("This is prime number"); } else{
 * System.out.println("This is not a prime number"); } } else {
 * System.out.println("Number should be greater than one"); } }
 */