import java.util.*;
class MatrixDiagonalSum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[][]=new int[3][3];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();	
				if(i==j)
				{
					sum+=arr[i][j];
				}
			}
		}
		System.out.println("Sum of All Diagonal Elements in Array Matrix :- "+sum);
	}
}