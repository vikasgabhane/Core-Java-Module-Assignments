import java.util.*;

class ReverseNo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		int reverse=0;
		int rem;
		System.out.println("Number = "+n);
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			reverse = (reverse*10)+rem;
		}
		
		System.out.println("Reverse No = "+reverse);
	}
}
