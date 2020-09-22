import java.util.*;
class StringArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size :-");
		int n=sc.nextInt();
		String str[]=new String[n];
		for(int i=0;i<n;i++)
		{
			str[i]=sc.next();
		}
		System.out.println("String Array Data :-");
		for(String a : str)
		{
			System.out.println(a);
		}
	}
}
