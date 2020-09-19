import java.util.*;
class SearchInArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array :");
		int n= sc.nextInt();
		int arr[]= new int[n];
		int flag=0;
		System.out.println("Enter array Elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter Number to search in array :");
		int num= sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(num==arr[i])
			{
				System.out.println(num+" is at "+i+" index");
				flag=0;
				break;
			}
			else
			{
				flag=1;
				continue;
			}
		}
		
		if(flag==1)
			System.out.println("Number is Not present in array");
	}
}
