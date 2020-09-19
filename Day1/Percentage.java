import java.util.*;
class Percentage
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of 5 Subject :");
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		int s4 = sc.nextInt();				
		int s5 = sc.nextInt();
		
		int sum = s1+s2+s3+s4+s5;
		
		float per =(float)(sum/5);
		System.out.println("Percentage marks = "+per+"%");
	}
}
