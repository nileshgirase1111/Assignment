import java.util.Scanner;

public class Using_Function_Odd_Even_UI 
{
	
	static String oddeven(int a)
	{
		String s;
		if(a%2==0) 
		{
			s="Even";
		}
		else {
			s="Odd";
		}
		return s;
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		char ch;
		do
	    {
			System.out.println("Enter the number of which is to be checked :");
			int n=sc.nextInt();
			String result=oddeven(n);
			System.out.println("The number is = "+result);
			
			System.out.println("If you want to continue? then type (y) only");
			ch=sc.next().charAt(0);
			
		}
		while(ch=='y'||ch=='Y');
		sc.close();
	}

}