import java.util.Scanner;
public class ASCIIValueAdd5
    {
        public static void main(String args[]) 
    {
     Scanner sc =new Scanner (System.in);
    
     
     System.out.println(" Enter the chracter value here   = "); 
     
       char ch = sc.next().charAt(0);
       
       // conversion of character 
       
       int num ;
       
        num = (int)ch;
        
        num =num + 5 ;
       
     System.out.println (" The conversion of chararcter is = " + (char)num);
      
      
    }
}