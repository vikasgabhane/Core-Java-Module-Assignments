import java.util.*;
class EvenOddSum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size :-");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int evenSum=0,oddSum=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]%2==0)
			{
				evenSum+=arr[i];
			}
			else
			{
				oddSum+=arr[i];
			}
		}
		
		System.out.println("Sum of Even elements :- "+evenSum);
		System.out.println("Sum of Odd elements :- "+oddSum);
	}
}
