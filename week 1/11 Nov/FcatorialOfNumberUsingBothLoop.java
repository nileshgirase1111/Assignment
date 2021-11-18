import java.util.Scanner;
public class FcatorialOfNumberUsingBothLoop
{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner (System.in);
       
     System.out.println("Fcatorail of given Number By using for loop");
       
       int  number =sc.nextInt();
       
       int fact =1;
       for (int i= 1;i<=number;i++){
      
        fact = fact * i;  
           
       }  
       
      System.out.println("here the value of given factorial number by using while loop = " + fact);
        
        
        System.out.println("Fcatorail of given Number By using while loop");
             
      
       int  num =sc.nextInt();
       int factorial =1;
      
       int i =1 ;
       while (i<=num)
       {
         factorial=factorial * i;  
         
         i++;
           
       }
         
       System.out.println("here the value of given factorial by using while loop  = " + factorial);
        
        
    }
    
}