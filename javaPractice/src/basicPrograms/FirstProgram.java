package basicPrograms;

public class FirstProgram {
	static int m=100;//static variable  
	public int method()  
	{    
		int n=90;//local variable
		return n;
	}  
	public static void main(String[] args) {
		FirstProgram obj = new FirstProgram();
		int data=50;//instance variable    
		System.out.println("Static variable"+m);
		System.out.println("Local variable"+obj.method());
		System.out.println("Instance variable"+data);
	}  
}