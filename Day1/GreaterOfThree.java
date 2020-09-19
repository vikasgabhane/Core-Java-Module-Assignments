import java.util.*;
class GreaterOfThree
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Numbers :");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		System.out.println("Using IF Else : ");
		
		if(n1>n2 && n1>n3)
		{
			System.out.println("Greater is = "+n1);
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println("Greater is = "+n2);
		}
		else
		{
			System.out.println("Greater is = "+n3);
		}
		
		System.out.println("Using Ternary Operator : ");
		
		int res = (n1>n2 && n1>n2)?n1:(n2>n1 && n2>n3)?n2:n3;
		System.out.println("Greater is = "+res);
		
	}
}
