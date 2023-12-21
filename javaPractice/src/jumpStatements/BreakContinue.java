package jumpStatements;

public class BreakContinue {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(i);
		}  
		for (int j = 0; j < 10; j++) {
			if (j == 4) {
				continue;
			}
			System.out.println(j);
		}
	}
}
/*
 * The break statement can also be used to jump out of a loop. The continue
 * statement breaks one iteration (in the loop), if a specified condition
 * occurs, and continues with the next iteration in the loop.
 * 
 * This example skips the value of 4:
 */