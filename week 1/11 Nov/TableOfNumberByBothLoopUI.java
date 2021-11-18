import java.util.Scanner;
public class TableOfNumberByBothLoopUI
{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        
        //table using for loop
         System.out.println("Enter Number that you want table  =");
    
         int a =sc.nextInt();
      
         for(int i = 1;i<=10;i++){
             int table;
             table = a*i ;
        
         System.out.println(+table+"="+a+"*"+i );
         }
             
         //table using while loop
         
         int b =sc.nextInt();
            
          int i =1 ;
          while (i<=10){
               int tables;
              tables = b*i;
              System.out.println(+tables+"="+b+"*"+i );
            }
        
         }
    }
  