import java.util.*;

public class PositiveElementByUI {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the element = ");

        int arr[]=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            if(arr[i]>0)
                    
            System.out.println(arr[i]);
        }
    }
}