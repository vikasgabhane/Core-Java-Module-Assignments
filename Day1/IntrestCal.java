import java.util.*;

class IntrestCal
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount : ");
		double amt = sc.nextDouble();
		System.out.println("Enter rate of Intrest :");
		int rate = sc.nextInt();
		System.out.println("Enter Total Time");
		float time = sc.nextFloat();
		
		double intrest = (amt*rate*time)/100;
		System.out.println("Simple Interst = "+intrest);
	}
}
