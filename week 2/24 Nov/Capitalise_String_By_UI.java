
import java.util.*;

public class Capitalise_String_By_UI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String str = sc.nextLine();
		String st ="";
		char[] c = str.toCharArray();
		char f = Character.toUpperCase(str.charAt(0));
		st = st+f;
		for(int i =1;i<c.length;i++) {
			char k = c[i];
			if(c[i-1]==' ') {
				k = Character.toUpperCase(k);
				}
			st +=k;
			}
		System.out.println(st);
		

	}

}