package basicPrograms;

public class Variables {

	public static void main(String[] args){  
		
		//Typecasting
		int a=10;  
		float f=a;  
		System.out.println(a);  // Outputs int value
		System.out.println(f); // Outputs float value
		
		float i=10.5f;  
		//int i=f;//Compile time error  
		int j=(int)i;  
		System.out.println(j);  
		System.out.println(i);  
		
		}  
}
