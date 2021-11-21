import java.util.Scanner;

public class Number_of_digits_while_loop_UI{
	 static int digits(int x) {
		int c=0;
		
		while(x>0) {
			x=x/10;
			c++;
		}
	System.out.println("digit is = "+c);

		return c;	
	}
	
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	char ch;
	do {
	System.out.println("Enter your number=");
	int a=sc.nextInt();
	
	int  r=digits(a);
;
	System.out.println("\n if you wish to continue?(Yes/No)");
	 ch=sc.next().charAt(0);
	 System.out.println();
	}while(ch=='y' || ch=='Y');
	sc.close();
}

}