package HwReverseNumber;

public class ReverseNumber {

	public static void main(String[] args) {
		int number=1234;

		
		int reverse = 0;
        int remainder = 0;
        
      
    	   
       while(number>0) {
    	   
            remainder = number%10;
            
            reverse = reverse*10 + remainder;
            
              number = number/10;
//          
       
       } 
       System.out.println(reverse);
    }

}


	

