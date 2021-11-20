import java.util.Scanner;

public class Grade_Using_Method_UI {
	
	static char grade(float x) {
		char result=' ';
		float total=x/5;
		float g=total;
		
		if(g>=90 && g<=100) {
			result='A';
		}else if(g>80 && g<=89) {
			result='B';
		}else if(g>70 && g<=79) {
			result='C';
		}else if(g>60 && g<=59) {
			result='D';
		}else if(g>50 && g<=49) {
			result='E';
		}else{
		    result ='F';
		}
		System.out.println("Here Your percentage is = "+total);
		return result;
	}
	
	
	public static void main(String args[]) {
		char ch;
		float a=0;
		Scanner sc=new Scanner(System.in);
		
		do {
			for(int j=1;j<=5;j++) {
			System.out.println("Enter your marks of "+j+" subject");
			a+=sc.nextFloat();
			}
			
			char r=grade(a);
			System.out.println("Final grade is = "+r);
			System.out.println("If you wish to continue? Then Type (y/Y) only");
			ch=sc.next().charAt(0);
			
			
		}while(ch=='y'||ch=='Y');
		sc.close();
	}

}
