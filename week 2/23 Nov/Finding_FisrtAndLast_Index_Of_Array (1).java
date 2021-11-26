import java.util.*;

public class Finding_FisrtAndLast_Index_Of_Array {
	
 	//Method to find the first index of element in an array
	public static void indexfirst(int a[],int n)
	{
		int findex=-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
			findex=i;
			break;
			}
		}
		System.out.println("Index First of "+n+" = "+findex);
	}
	
	//Method to find the last index of given element in an array
	public static void indexlast(int a[],int n)
	{
		int lindex=-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
			lindex=i;
			}
		}
		System.out.println("Last Index of "+n+" = "+lindex);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int index;
		System.out.println("Enter size of array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter the elements in the array:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
    
	  System.out.println("Enter the element whose index is to be found :");
	 
	  index=sc.nextInt();
	  indexfirst(a,index);
	  indexlast(a,index);
	}
}