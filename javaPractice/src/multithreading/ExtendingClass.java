package multithreading;

public class ExtendingClass extends Thread {
	  public static void main(String[] args) {
		  ExtendingClass thread = new ExtendingClass();
		    thread.start();
		    System.out.println("This code is outside of the thread");
		  }
		  public void run() {
		    System.out.println("This code is running in a thread");
		  }
	}
