package interfaces;
class DemoClass implements FirstInterface, SecondInterface {
	public void myMethod() {
		System.out.println("Some text..");
	}
	public void myOtherMethod() {
		System.out.println("Some other text...");
	}
}

public class MainInheritingInterface {
	public static void main(String[] args) {
		DemoClass myObj = new DemoClass();
		myObj.myMethod();
		myObj.myOtherMethod();
	}
}
//Especially this is used when we import methods