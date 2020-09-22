import java.util.*;
class ArrayMaxMin
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size :-");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array "+n+" elements :-");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		int max=arr[0];
		for(int i=1;i<n;i++)
		{
			if(max < arr[i])
			{
				max=arr[i];
			}
			else if(min > arr[i])
			{
				min=arr[i];
			}			
		}
		System.out.println("Max Element in Array :- "+max);
		System.out.println("Min Element in Array :- "+min);
	}
}
