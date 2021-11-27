
public class Addition_Of_Array {

	public static void main(String[] args) {

		int[][] a = {{10,20},{22,44}};
		int[][] b = {{35,45},{52,63}};
		int[][] c = new int[2][3];
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=0; j<b.length;j++)
			{
				c[i][j] = a[i][j]+b[i][j];
			}
		}
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=0; j<b.length;j++)
			{
				System.out.print(c[i][j]+" ");	;
			}
			System.out.println();
		}
	}

}