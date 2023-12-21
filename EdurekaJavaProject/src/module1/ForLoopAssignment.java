package module1;

public class ForLoopAssignment {
	public static void main(String[] args) {
		// Even Numbers & Odd Numbers
		int number = 22;
		for(int i=2; i<=number;i++)
		{
			if(i%2==0) {
				System.out.println(i+ "is even Number"+ " ");
			}
			else {
				System.out.println(i+ "is odd Number"+ " ");
			}			
		}

		//Factorial of a number
		int num = 10;
		for(int i=0;i<10;i++) 
		{			
			num = num+i;
		}
		System.out.println("Factorial of the given number is: "+ num);	
		
		//Generate Tables of 10
		int table = 5;
		for(int i=1; i<=10;i++) {	
			System.out.println(table+ "*"+i+"="+(table*i));
		}
		
		//Add the digits of a number
		int digitNum= 231;
		for(int i=digitNum;i!=0;i++) {
			digitNum = digitNum%10+digitNum;
		}
		System.out.println("This is digital Num: "+digitNum);
	}
}
