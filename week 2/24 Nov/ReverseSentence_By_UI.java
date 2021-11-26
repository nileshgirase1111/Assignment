import java.util.*;

public class ReverseSentence_By_UI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter here that you want to print reverse = ");
	
		String str = sc.nextLine();
		String[] a = str.split(" ");
		String st="";
		for(int i= a.length-1;i>=0;i--) {
			st += a[i]+" ";
		}
		System.out.println(st);

	}

}