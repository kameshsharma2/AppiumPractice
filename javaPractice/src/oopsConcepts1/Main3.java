package oopsConcepts1;

	class Pig3 implements Animal3 {
		  public void animalSound() {
		    System.out.println("The pig says: wee wee");
		  }
		  public void sleep() {
		    System.out.println("Zzz");
		  }
		}

	public class Main3 {
		  public static void main(String[] args) {
		    Pig3 myPig = new Pig3();
		    myPig.animalSound();
		    myPig.sleep();
		  }
		}
