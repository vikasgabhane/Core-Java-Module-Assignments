import java.util.*;
class Array1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array");
		int n=sc.nextInt();
		int arr[] = new int[n];
		int sum=0;
		float avg;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		avg=(float)sum/n;
		System.out.println("Sum of element ="+sum);
		System.out.println("Average ="+avg);
	}
}
