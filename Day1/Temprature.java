import java.util.*;
class Temprature
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temprature in Fahrenheit : ");
		float f = sc.nextFloat();
		
		float c =5*(f-32)/9;
		System.out.println("Temprature in Celsius is = "+c);
	}
}
