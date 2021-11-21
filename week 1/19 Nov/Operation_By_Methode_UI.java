import java.util.Scanner;
public class Operation_By_Methode_UI {

         static void operation(int a,int b) {
		int c;
		c=a+b;
		System.out.println(" addition = "+c);
		c=a-b;
		System.out.println(" substraction = "+c);
		c=a*b;
		System.out.println("multiplication = "+c);
		c=a/b;
		System.out.println("division = "+c);
}
	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the First number");
		int y=sc.nextInt();
		System.out.println("Enter the Second number");
		int z=sc.nextInt();
		
		operation(y,z);
    	sc.close();
	
	}
}