package controlStatements;

public class Break_ContinueJumpStatements {
	public static void main(String[] args) {  
	    //declaring variable  
	    int i=1;  
	    //do-while loop  
	    do{  
	        if(i==5){  
	           //using break statement  
	           i++;  
	           break;//it will break the loop  
	        }  
	        System.out.println(i);  
	        i++;  
	    }while(i<=10);   
	//while loop  
    int j=1;  
    while(j<=10){  
        if(j==5){  
            //using continue statement  
            j++;  
            continue;//it will skip the rest statement  
        }  
        System.out.println(j);  
        j++;  
    
    }  
}  
}
