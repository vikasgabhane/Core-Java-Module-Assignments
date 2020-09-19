import java.util.*;

class Calender
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Days : ");
		int days=sc.nextInt();
		
		int year = days/365;
		days = days%365;
		
		int month = days/30;
		days = days%30;
		System.out.println("Years = "+year+" Months = "+month+" Days = "+days);
	}
}
