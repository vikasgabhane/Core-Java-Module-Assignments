import java.util.*;
class Series
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range :");
		int range = sc.nextInt();
		int sum=0;
		int i=2;
		while(i<=(range+2))
		{
			sum+=i;
			i=i+10;
		}
		System.out.println("Sum = "+sum);
	}
}
