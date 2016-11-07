import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  	
  	Scanner input = new Scanner(System.in);
  	
  	int num = inout.nextInt();
  	
  	
     
     hourGlass(num);
     
     
    public static void hourGlass(int numbers){
    	
    	
    	System.out.println("the number you have choosen is: "+numbers);
    	
    	if (numbers > 1){
    		
    		System.out.println();
			for(int counter=0;counter<numbers;counter++){
				System.out.print("*");
    		
         } 
         hourGlass(number-1);
         
         for(int counter=0;counter<number;counter++){
         	
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
}
