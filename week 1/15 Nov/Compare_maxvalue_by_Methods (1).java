import java.util.Scanner;

public class Compare_maxvalue_by_Methods {
	
	static int maxvalue(int x,int y) {
		 int res=0;
		if(x>y) {
			 res=x;
		}
		else if(y>x) {
			 res=y;
		}
		else {
			System.out.println("The numbers are equal");
		}
		return res ;	
	}
	static int maxvalue(int x,int y,int z) {
		 int res=0;
		if(x>y && x>z) {
			 res=x;
			 
		}
		else if(y>x && y>z) {
			 res=y;
		}
		else if(z>x && z>y) {
			res=z;
		}
		else {
			System.out.println("The numbers are equal");
		}
			return res;
	}
	static int maxvalue(int w,int x,int y,int z) {
		 int res=0;
		if(x>w && x>y && x>z) {
			 res=x;
			 
		}
		else if(y>w && y>x && y>z) {
			 res=y;
		}
		else if(z>w && z>x && z>y) {
			res=z;
		}
		else if(w>x && w>y && w>z) {
			res=w;
		}
		else {
			System.out.println("The numbers are equal");
		}
			return res;
	}
	
	
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		char i;
		do 
		{
			System.out.println("How many number do you wish to comapre?(2/3/4)");
			int ch=sc.nextInt();
			if(ch==2) {
				System.out.println("Enter First number");
				int a=sc.nextInt();
				System.out.println("Enter second number");
				int b=sc.nextInt();
				int max=maxvalue(a,b);
				System.out.println("The maximun value is = "+max);
			}
			else if(ch==3) {
				System.out.println("Enter First number");
				int a=sc.nextInt();
				System.out.println("Enter Second number");
				int b=sc.nextInt();
				System.out.println("Enter Third number");
				int c=sc.nextInt();
				int max=maxvalue(a,b,c);
				System.out.println("The maximun value is = "+max);
			}
			else if(ch==4) {
				System.out.println("Enter First number");
				int a=sc.nextInt();
				System.out.println("Enter Second number");
				int b=sc.nextInt();
				System.out.println("Enter Third number");
				int c=sc.nextInt();
				System.out.println("Enter Forth number");
				int d=sc.nextInt();
				int max=maxvalue(a,b,c,d);
				System.out.println("The maximun value is = "+max);
			}
			System.out.println("if you want to contnue? then type y only");
			i=sc.next().charAt(0);
		}
		while(i=='y');
		sc.close();
	}
}