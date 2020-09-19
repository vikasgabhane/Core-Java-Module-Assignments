import java.util.*;
class ArrayReverse
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array");
		int n=sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter "+n+" Array Elements :");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int b[]=new int[n];
		int j=n;
		for(int i=0;i<n;i++)
		{
			b[j-1]=arr[i];
			j=j-1;
		}
		System.out.println("Print Array in Reverse order :");
		for(int i=n-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Reverse Array in another Array :");
		for(int i=0;i<n;i++)
		{
			System.out.println(b[i]);
		}
	}
}
