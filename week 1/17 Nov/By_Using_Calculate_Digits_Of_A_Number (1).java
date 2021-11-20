import java.util.Scanner;

public class By_Using_Calculate_Digits_Of_A_Number {
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
	char m;
	do 
	{
	System.out.println("Enter number     :");
	int a=sc.nextInt();
	
	String r=digits(a);
	System.out.println(r);
	
	System.out.println("If  you wish to continue type y only)");
	 m=sc.next().charAt(0);
	 System.out.println();
	}
	while(m=='y' || m=='Y');
	sc.close();
}

}