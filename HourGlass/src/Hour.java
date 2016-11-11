import java.util.Scanner;

public class Hour {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	  	
	  	int num = input.nextInt();
	  	
	  	
	  	System.out.println("the number you have choosen is: "+num);
	    hourGlass(num);
		

	}
	
	
	
	public static void hourGlass(int numbers){
    	
    	
    	
    	
    	if (numbers > 1){
    		
    		System.out.println();
			for(int counter=0;counter<numbers;counter++){
				System.out.print("*");
    		
         } 
         hourGlass(numbers-1);
         
         for(int counter=0;counter<numbers;counter++){
         	
				System.out.print("*");
			}
			
				System.out.println("");
			
		}else{
			
			System.out.println("");
			
			System.out.println("*");
			
			System.out.println("*");
		}
    	
    	
    	
    	
    	
    	
    }

		
}


