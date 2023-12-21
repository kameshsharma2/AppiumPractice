package baiscPrograms;

public class Vowels {

	public static void main(String[] args) {
		String i = "Sundar";
		char []p = i.toCharArray();
		for(int j=0;j<i.length();j++) {
			if (p[j]=='a'||p[j]=='e'||p[j]=='i'||p[j]=='o'||p[j]=='u') {
				System.out.println(p[j]);
			}
			else {
				System.out.println("Not a vowel");
			}
		}
		
		for(int j=0; j<i.length();j++) {
			if (i.charAt(j) == 'a'||i.charAt(j)=='e'||i.charAt(j)=='o'||i.charAt(j)=='u') {
				System.out.println(i.charAt(j));
				
		}
			
		}
	
	}
}
