package baiscPrograms;

public class ArrayPract {

	public static void main(String[] args) {
		int []a = {98,77,62,89,97,55,23,11};
		int leftsum=0;
		int rightsum=0;
		if(a.length%2==0) {
			System.out.println("The length is even: ");
			int midpoint1 = (a.length/2)-1;
			int midpoint2 = a.length/2;

			for(int i=0;i<midpoint1;i++) {
				System.out.println("These are left array"+a[i]);
				leftsum = leftsum+a[i];		
			}
			System.out.println("The lefsum is: "+ leftsum);

			for(int i=midpoint2+1;i<a.length;i++) {
				System.out.println("These are Right array"+a[i]);
				rightsum = rightsum+a[i];
			}
			System.out.println("The rightsum is: "+ rightsum);
		}

		else {
			System.out.println("The length is odd: ");
			int midpoint  = a.length/2;

			for(int i=0;i<midpoint;i++) {			
				System.out.println("These are left array"+a[i]);
				leftsum = leftsum+a[i];
			}
			System.out.println("The lefsum is: "+ leftsum);

			for(int i=midpoint+1;i<a.length;i++) {
				System.out.println("These are Right array"+a[i]);
				rightsum = rightsum+a[i];
			}
			System.out.println("The rightsum is: "+ rightsum);
		}
	}
}

/*
 * DesiredCapablities caps = new DesiredCapabilities();
 * 
 * caps.("appPackage", ""); caps.("appActivity", ""); caps.("platformVersion",
 * ""); driver = new AndroidDriver(new url("http:127.0.0.1.4723", caps));
 * TouchActions touch = new TouchActions(driver); touch
 */