import java.util.Scanner;
public class By_Using_Terenary_Ope_Comare_2_Num {

public static void main (String args[]){
    
    Scanner sc =new Scanner (System.in);
         
         System.out.println(" Enter First Number  =  ");
         int a = sc.nextInt();
         System.out.println(" Enter Second Number =  ");
         int b= sc.nextInt();
         
        int  s=(a>b) ? a:b;
         System.out.println(" Greater Number is =  "+s);

    }
    
}
     
     
      
    