package module1;

public class TheaterTicketSolution {

	public static void main(String[] args) {
		int Gold  = 200;
		int Silver =150;
		int Ticket =200;
		
		if (Ticket == Gold) 
		{
			System.out.println("This is Gold category");
		}
		else if (Ticket == Silver) 
		{
			System.out.println("This is Silver category");
		}
		else
		{
			System.out.println("Please enter valid input");	
		}
	}

}
