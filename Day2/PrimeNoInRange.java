import java.util.*;

class PrimeNoInRange
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stating Number : ");
		int sn = sc.nextInt();
		System.out.println("Enter ending Number : ");
		int en = sc.nextInt();
		int flag = 0;
		System.out.println("Prime Nos :");
		for(int i=sn;i<=en;i++)
		{
			if(i==1 || i==0)
			{
				continue;	
			}
			flag=1;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
			System.out.println(i);
		}
		
	}
}
