package basicPrograms;

public class MathPractice {
	public static void main(String[] args) {
		System.out.println(Math.max(5, 10)); // To find the highest value of x and y
		System.out.println(Math.min(5, 10)); //To find the lowest value of x and y:
		System.out.println(Math.sqrt(64)); //To find the Square Root value:
		System.out.println(Math.abs(-4.7)); //To find the positive value:
		System.out.println(Math.random()); //To print any random value:

		//Random number between 0 and 100, you can use the following formula
		int randomNum = (int)(Math.random() * 101);  // 0 to 100
		System.out.println(randomNum);
	}
}
