package exceptioHandling;

public class ThrowException {
	 //defining a method  
    public static void checkNum(int num) {  
        if (num < 1) {  
            throw new ArithmeticException("\nNumber is negative, cannot calculate square");  
        }  
        else {  
            System.out.println("Square of " + num + " is " + (num*num));  
        }  
    }  
    //main method  
    public static void main(String[] args) {  
    	ThrowException obj = new ThrowException();  
    	try {
    		 obj.checkNum(-3);  
    		
		} catch (ArithmeticException e) {
			System.out.println("no is not greater then 1" );
			
		}
    	finally {
    		 System.out.println("Rest of the code..");  
		}
    	
    		
    	}
           
           
    

}
