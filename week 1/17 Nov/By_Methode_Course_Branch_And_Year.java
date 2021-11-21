import java.util.Scanner;

public class By_Methode_Course_Branch_And_Year {
	
	public static void Course(int m,String n) {
	
		if(m == 1) {
			if(n.equals("CSE") || n.equals("ECE") || n.equals("MECH")) {
			 System.out.println("Your course is English,Maths,Science");
			}
			else {
			System.out.println("You entered wrong Information");
			}
		}
		else if(m == 2) {
			if(n.equals("CSE")) {
			System.out.println("Your course is Operating System, Java, Data Structure");
			}
			else if(n.equals("ECE")) {
			System.out.println("Your course is Micro Processor, Logic Switching Theory");
			}
			else if(n.equals("MECH")) {
			System.out.println("Your course is Drawing, Manufacturing Machine");
			}
			else {
			System.out.println("You entered wrong Branch");
			}
		}
		else if(m== 3) {
			if(n.equals("CSE")) {
			System.out.println("Your course is Computer Organization, Multimedia");
			}
			else if(n.equals("ECE")) {
			System.out.println("Your course is Fundamentals Of Logic Design, Microelectronics");
			}
			else if(n.equals("MECH")) {
			System.out.println("Your course is Internal Combustion Engines, Mechanical Vibration");
			}
			else {
			System.out.println("You entered wrong Branch");
			}
		}
		else if(m == 4) {
			if(n.equals("CSE")) {
			System.out.println("Your course is Data Comunication and Networks, Multimedia");
			}
			else if(n.equals("ECE")) {
			System.out.println("Your course is Embedded System, Image Processing");
			}
			else if(n.equals("MECH")) {
			System.out.println("Your course is Production Technology, Thermal Engineering");
			}
			else {
			System.out.println("You entered wrong Branch");
			}
		}
		else {
			System.out.println("You entered wrong year");
		}
	}

	    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String n;
		
		System.out.println("Enter the year : ");
		int m =sc.nextInt();
		System.out.print("Enter the Branch : ");
		n = sc.next();
		
	    Course(m,n);
	    

	}

 }