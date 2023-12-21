package baiscPrograms;

public class VowelsCount {

		public static void main(String[] args) {

			String s= "This is palindromeu";
			char[] c=s.toCharArray();
			int count = 0;
			int wordscount = 0;
			for(int i=0;i<=c.length-1;i++) {
				if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u') {
					count++;
					System.out.println("These are the values: "+c[i]);
					for(int j=i+1;j<c.length-2;j++) {
						if(c[i]==c[j]) {
							wordscount++;
							
						}
					}
					System.out.println("This is inside loop"+c[i]);
					
				}
				
			}
			
			System.out.println("Total count: "+count);
	}

}
