import java.util.*;
class Array2dSum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[5][];
		int sum=0;
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter col size for row "+i);
			int c=sc.nextInt();
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
				sum+=arr[i][j];
			}
		}
		System.out.println("Sum of all array Element ="+sum);
	}
}
