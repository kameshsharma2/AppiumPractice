package module1;

public class IfConditionAssignment {
	public static void main(String[] args) {
		int CheckAge = 10;
		//Program for Negative or Positive

		if (CheckAge>=18) {
			System.out.println("You can vote");
		}
		else if(CheckAge<=10000){
			System.out.println("You can't vote");
		}
		else {
			System.out.println("Invalid output");
		}

		//Program for Negative, positive or Zero
		int x = 2000;
		if (x>0) {
			System.out.println("x value is: "+x +" and it is Positive");
		}
		else if(x<0) {
			System.out.println("x value is: "+x +" and it is Negative");
		}
		else {
			System.out.println("x value is: "+x +" and it is Zero");
		}
		//Program to find Largest
		int a = 100;
		int b =100;
		if (a>b){
			System.out.println(a + "is greater than"+ b);
		}
		else if (b>a){
			System.out.println(b + "is less than"+ a);
		}
		else {
			System.out.println(b + "is equal to "+ a);
		}
		//Program to check even or odd
		int d = 0;
		if(d==0){
			System.out.println("'d' is: "+d + "is zero ");	
		}
			else if(d%2==0) {
				System.out.println("'d' is: "+d + "is even Number ");
			}
			else if (d%2!=0) {
				System.out.println("'d' is: "+d + "is odd Number ");
			}

		}

	}

