package iterationStatmeents;

public class WhileStatements {
	public static void main(String[] args) {
		int i = 0;
		do {			//This will print definitely without checking condition
			System.out.println(i);
			i++;
		}
		while (i < 5);  
	}
}


/*
  The do/while loop is a variant of the while loop. This loop will execute the
  code block once, before checking if the condition is true, then it will
  repeat the loop as long as the condition is true.
  
  do {
  // code block to be executed
}
while (condition);
 */