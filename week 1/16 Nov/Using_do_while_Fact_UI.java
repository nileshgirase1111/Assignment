import java.util.Scanner;

public class Using_do_while_Fact_UI {
	
	static int factorial(int z) 
	{
		int fact=1;
		int a=1;
		while(a<=z) {
			fact=fact*a;
			a++;
		}
		return fact;	
	}	
	
	public static void main(String arsg[])
	{
		Scanner sc=new Scanner(System.in);
		char ch;
	do
	{
		System.out.println("Enter The Number That Factorial is to be Calculate :");
		int n=sc.nextInt();
		int result=factorial(n);
		System.out.println("Factorial Of The Number is = "+result);
		
		System.out.println("If you want to continue? Then type (yes/no)");
		ch=sc.next().charAt(0);
		
	}
	while(ch=='y'||ch=='Y');
	sc.close();
}
}