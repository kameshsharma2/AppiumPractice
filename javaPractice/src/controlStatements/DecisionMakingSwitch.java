package controlStatements;

public class DecisionMakingSwitch {
	public static void main(String args[])  
	{  
		//C - CSE, E - ECE, M - Mechanical  
		char branch = 'C';                 
		int collegeYear = 4;  
		switch( collegeYear )  
		{  
		case 1:  
			System.out.println("English, Maths, Science");  
			break;  
		case 2:  
			switch( branch )   
			{  
			case 'C':  
				System.out.println("Operating System, Java, Data Structure");  
				break;  
			case 'E':  
				System.out.println("Micro processors, Logic switching theory");  
				break;  
			case 'M':  
				System.out.println("Drawing, Manufacturing Machines");  
				break;  
			}  
			break;  
		case 3:  
			switch( branch )   
			{  
			case 'C':  
				System.out.println("Computer Organization, MultiMedia");  
				break;  
			case 'E':  
				System.out.println("Fundamentals of Logic Design, Microelectronics");  
				break;  
			case 'M':  
				System.out.println("Internal Combustion Engines, Mechanical Vibration");  
				break;  
			}  
			break;  
		case 4:  
			switch( branch )   
			{  
			case 'C':  
				System.out.println("Data Communication and Networks, MultiMedia");  
				break;  
			case 'E':  
				System.out.println("Embedded System, Image Processing");  
				break;  
			case 'M':  
				System.out.println("Production Technology, Thermal Engineering");  
				break;  
			}  
			break;  
		}  
	}  

}


/*
 * There can be one or N number of case values for a switch expression. The case
 * value must be of switch expression type only. The case value must be literal
 * or constant. It doesn't allow variables. The case values must be unique. In
 * case of duplicate value, it renders compile-time error. The Java switch
 * expression must be of byte, short, int, long (with its Wrapper type), enums
 * and string. Each case statement can have a break statement which is optional.
 * When control reaches to the break statement, it jumps the control after the
 * switch expression. If a break statement is not found, it executes the next
 * case. The case value can have a default label which is optional.
 */