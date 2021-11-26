import java.util.*;

public class MiddleElementArrByUI {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter the Element in the Array");
       
        int arr[]=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Here is the result : ");

        System.out.println(arr[10/2-1]);
    }
}