import java.util.Scanner;
public class Multiply_Number_By_Method {
	
	static float multi(float n,float m) {
		
		float r=n*m;
		
		return r;
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First number - ");
		float a=sc.nextFloat();
		System.out.println("Enter Second number - ");
		float b=sc.nextFloat();
	    
	    sc.close();
		
		float prod=multi(a,b);
		
		System.out.println("The multiplication is - "+ prod);
		
	}

}