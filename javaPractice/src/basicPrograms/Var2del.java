package basicPrograms;

public class Var2del {

	int x;
	String z;
	short d;
	
	public void add() {
		System.out.println("Int is "+ x);
		System.out.println("String is "+ z);
		System.out.println("Short is "+ d);
		
	}
	public static void main(String[] args) {
		
		Var2del ref = new Var2del();
		ref.x= 25;
		ref.z= "Kamesh";
		ref.d= 34;
		ref.add();
		
	}

}
