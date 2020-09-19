import java.util.*;
class GrossSal
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic Salary");
		double sal = sc.nextDouble();
		if(sal < 10000)
		{
			double HRA = sal*0.10;
			double DA = sal*0.90;
			double GrossSal= sal + HRA + DA;
			System.out.println("Gross Salary = "+GrossSal);
		}
		else
		{
			double HRA = 2000;
			double DA = sal*0.98;
			double GrossSal= sal + HRA + DA;
			System.out.println("Gross Salary = "+GrossSal);
		}
	}
}
