import java.util.Scanner;

public class To_Calculate_Digits_Of_a_number {
	public static String digits(int z) {
		String f;
		int n=0;
		
		while(z>0) {
			z=z/10;
			n++;
		}
		f="You have entered : "+n+" digit number";
		
		return f;	
	}
	
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	char ch;
	do 
	{
	System.out.println("Enter number     :");
	int a=sc.nextInt();
	
	String r=digits(a);
	System.out.println(r);
	
	System.out.println("Do you wish to continue?(Yes/No)");
	 ch=sc.next().charAt(0);
	 System.out.println();
	}
	while(ch=='y' || ch=='Y');
	sc.close();
}

}