package module1;

public class AmusmentParkSolution {

	public static void main(String[] args) {
		int TicketPrice = 400;
		int n= 11;
		if(n>10) {
			System.out.print("The total ticket price is: "+ (TicketPrice * 90/100) *n);
		}
		else {
			System.out.print("The total ticket price is: "+ TicketPrice*n );
		}
	}

}
