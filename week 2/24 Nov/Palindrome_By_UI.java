import java.util.*;

public class Palindrome_By_UI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String str = sc.nextLine();
		char[] c = str.toCharArray();
		String st="";
		for(int i = c.length-1;i>=0;i--) {
			st+=c[i];
		}
		if(st.equals(str)) {
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");

	}

}
