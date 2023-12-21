package controlStatements;

public class ForLoop {
	public static void main(String[] args) {  
		//loop of i  
		for(int i=1;i<=3;i++){  
			//loop of j  
			for(int j=1;j<=3;j++){  
				System.out.println(i+" "+j);  
			}//end of i  
		}//end of j  
	}  
}


/*
 * Initialization: It is the initial condition which is executed once when the
 * loop starts. Here, we can initialize the variable, or we can use an already
 * initialized variable. It is an optional condition. Condition: It is the
 * second condition which is executed each time to test the condition of the
 * loop. It continues execution until the condition is false. It must return
 * boolean value either true or false. It is an optional condition.
 * Increment/Decrement: It increments or decrements the variable value. It is an
 * optional condition. Statement: The statement of the loop is executed each
 * time until the second condition is false.
 */