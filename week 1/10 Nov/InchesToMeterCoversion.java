import java.util.Scanner;
public class InchesToMeterCoversion {
    public static void main(String args[]) 
    {
     Scanner sc =new Scanner (System.in);
     
     double inches ;
     
     System.out.println("Conversion of Inches Into Meter  = ");
     
       inches = sc.nextDouble();
       
      double meter;
      
        meter = inches * 0.0254;
      
       System.out.println(" Here is a Conversion of Inches Into Meter  = "+meter);
      
      
      
    }
}