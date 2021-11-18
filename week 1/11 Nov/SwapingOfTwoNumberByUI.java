import java.util.Scanner;
public class SwapingOfTwoNumberByUI
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter two Number");
        
            int a,b;
            a =sc.nextInt();
            b =sc.nextInt();
            
         System.out.println("Before swap ="+a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap ="+a+" "+b);
              }
           }