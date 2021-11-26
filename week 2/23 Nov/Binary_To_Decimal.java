

public class Binary_To_Decimal {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
	
		int num = 1001;
		int temp = num;
		int decimalvalue=0;
		int base = 1;
		while(temp>0)
		{
			int last_digit = temp%10;
			temp =temp/10;
			decimalvalue= decimalvalue + (base*last_digit);
			base = base*2;
		}
		System.out.println("Here is the Result = ");

		System.out.println(decimalvalue);
	}

}