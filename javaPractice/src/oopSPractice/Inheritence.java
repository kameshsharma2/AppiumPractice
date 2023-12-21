package oopSPractice;

class Employee{  
	float salary=40000;  

	int bonus=10000;  
} 
public class Inheritence extends Employee {
	public static void main(String args[]){  
		Inheritence p=new Inheritence();  
		System.out.println("Programmer salary is:"+p.salary);  
		System.out.println("Bonus of Programmer is:"+p.bonus);  
	}  
}  
