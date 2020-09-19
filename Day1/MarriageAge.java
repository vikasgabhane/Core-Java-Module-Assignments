import java.util.*;
class MarriageAge
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter gender & age : ");
		char sex = sc.next().charAt(0);
		int age = sc.nextInt();
		
		if ((sex=='m' && age >21) || (sex=='f' && age > 18))
		{
			System.out.println("person is eligible for marriage");
		}
		else
		{
		  	System.out.println("person is Not eligible for marriage");
		}
	}
}
