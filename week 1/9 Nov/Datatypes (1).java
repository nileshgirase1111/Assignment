import java.util.Scanner;
public class Datatypes {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please Enter Your Number:");
        int N =sc.nextInt();
        System.out.println(" Your Number Here= "+N);
        
        //long datypes are Used//
        
      System.out.println("Please Enter Your Salary:");
        long bal =sc.nextLong();
        System.out.println(" Your Salary Here= "+bal);
      
      //char datatypes//
      
       System.out.println("You Created your acount:");
      
      char choice=sc.next().charAt(0);
       if (choice=='f'){
           System.out.println("You Created your FB acount");
       }
       else if (choice=='g'){
           System.out.println(" Your Created Your Google Acount");
           
       }
       else {
           System.out.println("  Your Created Your Insta Acount");
           
       }
           
        //   Boolean Datatypes are used//
      
      System.out.println("  if You clear your examp it is true Or false");

          boolean pass =sc.nextBoolean();
          if(pass) {
              System.out.println("You have Successfully clear your examp");
              
          }
              
              else{
                  System.out.println(" Please Try again");
              }
          
      //float datatypes are used//
      
      System.out.println(" Please Enter your salary in lakh :");
       
       float lakh= sc.nextFloat();
       
        System.out.println(" your salary in lakh ="+lakh);
      
      //double datatypes are used//
      
      System.out.println(" Please Enter your marks in decimal :");
       
        double decimal= sc.nextDouble();
       
        System.out.println(" you marks in decimal ="+decimal);
      
      
    }
}