import java.lang.*;
import java.util.Scanner;

public class Prime_ui {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 2; i <= num; i++) {

            if (num % i == 0) {
                System.out.println("is not prime numbr");
            } else {
                System.out.println("is prime number");
            }

        }
    }
}