package multithreading;

public class ExtendingInterface implements Runnable {
	  public static void main(String[] args) {
		  ExtendingInterface obj = new ExtendingInterface();
		    Thread thread = new Thread(obj);
		    thread.start();
		    System.out.println("This code is outside of the thread");
		  }
		  public void run() {
		    System.out.println("This code is running in a thread");
		  }

}
