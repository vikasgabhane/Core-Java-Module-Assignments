import java.util.*;

class Table
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		System.out.println("Table of "+n+" :");
		for(int i=1;i<=10;i++)
		{
			int product=n*i;
			System.out.println(product);
		}
	}
}
