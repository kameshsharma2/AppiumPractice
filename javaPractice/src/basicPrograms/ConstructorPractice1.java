package basicPrograms;

public class ConstructorPractice1 {
	int a;
	
	  public ConstructorPractice1() 
	  { 
		  
		  System.out.println("Without Arguments");
	  }
	  public ConstructorPractice1(int x) 
	  { 
		  System.out.println("With one Argument");
	  } 
	  public ConstructorPractice1(int z, String y) 
	  {
		  System.out.println("With two Arguments");
	  }
	 
	public static void main(String[] args) {
		ConstructorPractice1 ref = new ConstructorPractice1();
		ref.a=12;
		System.out.println(ref.a);
	}
}
