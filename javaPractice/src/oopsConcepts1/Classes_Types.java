package oopsConcepts1;
class OuterClass {
	int x = 10;

	class InnerClass {		//Access Inner class
		int y = 5;	
		public int myInnerMethod() {  //accessing inner method inside inner class
			return x;
		}
	}

	static class InnerClass1 { //Access Static class
		int z = 5;
	}
}

public class Classes_Types {
	public static void main(String[] args) {

		//Inner Classes
		OuterClass myOuter = new OuterClass();
		OuterClass.InnerClass myInner = myOuter.new InnerClass();
		System.out.println(myInner.y + myOuter.x);

		OuterClass myOuter1 = new OuterClass();
		OuterClass.InnerClass myInner1 = myOuter1.new InnerClass();
		System.out.println(myInner1.myInnerMethod());

		OuterClass. InnerClass1 myInner2 = new OuterClass.InnerClass1();
		System.out.println(myInner2.z);
	}
}

// Outputs 15 (5 + 10)