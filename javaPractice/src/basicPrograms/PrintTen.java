package basicPrograms;

public class PrintTen {

	public static int RectangleArea(int l,int b) {	
		return l*b;
	}

	public static int RectanglePerimeter(int l,int b) {
		return 2*(l+b);
	}
	public static void main(String[] args) {

		System.out.println("Print the value: "+ RectangleArea(20, 30));
		System.out.println("Print the value: "+ RectanglePerimeter(40, 50));		
	}
}