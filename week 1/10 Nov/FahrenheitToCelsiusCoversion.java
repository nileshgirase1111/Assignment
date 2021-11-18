import java.util.Scanner;
public class FahrenheitToCelsiusCoversion {
    public static void main(String args[]) 
    {
     Scanner sc =new Scanner (System.in);
     
     double fahernheit ;
     
     System.out.println("Conversion of Fahernheit To Celsius  = ");
     
       fahernheit = sc.nextDouble();
       
      double celsius ;
      
        celsius  = (fahernheit -32)*5/9 ;
    
       System.out.println(" Here is a Conversion of fahernheit To Celsius  = "+celsius);
      
      
      
    }
}