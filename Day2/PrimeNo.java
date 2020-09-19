import java.util.*;

class PrimeNo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		int m=n/2;
		int flag = 0;
		for(int i=2;i<=m;i++)
		{
			if(n%i==0)
				flag=1;
		}
		if(flag==0)
			System.out.println("Prime No");
		else
			System.out.println("Not a Prime No");
	}
}
