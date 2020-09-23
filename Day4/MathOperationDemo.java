import java.util.*;
class MathOperation
{
	static int add(int a, int b)
	{
		return a+b;
	}
	static int substract(int a, int b)
	{
		return a-b;
	}
	static int multiply(int a, int b)
	{
		return a*b;
	}
	static long power(int a, int b)
	{
		long res = a;
		while(b!=0)
		{
			res*=a;
			b--;
		}
		return res;
	}
}
class MathOperationDemo 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 nos :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Addition = "+MathOperation.add(a,b));
		System.out.println("Substraction = "+MathOperation.substract(a,b));
		System.out.println("Multiplication = "+MathOperation.multiply(a,b));
		System.out.println("Power = "+MathOperation.power(a,b));
		
	}
}