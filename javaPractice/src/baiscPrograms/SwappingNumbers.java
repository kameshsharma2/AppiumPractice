package baiscPrograms;

public class SwappingNumbers {
	public static void main(String[] args) {
		int a=46;
		int b=72;
		int c= 0;
		System.out.println("Before Swapping "+ a +" "+ b);
		
		 c = b; b = a; a= c; //Method1
				
		b = a+b-(a=b); //Method2
		System.out.println("After Swapping "+ a +" "+ b);
	}
}