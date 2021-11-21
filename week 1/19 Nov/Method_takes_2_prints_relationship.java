import java.util.Scanner;

public class Method_takes_2_prints_relationship {

	static int relation(int x,int y) {
		
		int z = (x>y) ? x:y ;
		return z;

	}	 
	
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int a=sc.nextInt();
		System.out.println("Enter Second Number");
		int b=sc.nextInt();
		
		int  s=relation(a,b);
      System.out.println(" Greater Number is = "+s);
		sc.close();
	}

}