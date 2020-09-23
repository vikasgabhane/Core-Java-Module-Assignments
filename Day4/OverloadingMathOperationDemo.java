import java.util.*;
class MathOperation
{
	static int multiply(int a, int b)
	{
		return a*b;
	}
	static float multiply(float a, float b,float c)
	{
		return a*b*c;
	}
	static double multiply(int a, double b)
	{
		return a*b;
	}
	static int multiply(int a[])
	{
		int sum=1;
		for(int i=0;i<a.length;i++)
		{
			sum*=a[i];
		}
		return sum;
	}
}
class OverloadingMathOperationDemo 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		MathOperation m = new MathOperation();
		System.out.println("Enter 2 Int :-");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=m.multiply(a,b);
		System.out.println("Adition of 2 int :-");

		System.out.println("Enter 3 Floats :-");
		float p=sc.nextFloat();
		float q=sc.nextFloat();
		float r=sc.nextFloat();
		float d=m.multiply(p,q,r);

		System.out.println("Enter 1 Int & 1 Double");
		int x=sc.nextInt();
		double y=sc.nextDouble();
		double z=m.multiply(x,y);

		System.out.println("Enter Size of array :");
		int n=sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int tot=m.multiply(arr);

		System.out.println("multipliction of 2 Int = "+a);
		System.out.println("multipliction of 3 float = "+d);
		System.out.println("multipliction of 1 Int 1 Double = "+z);
		System.out.println("multipliction of array ele = "+tot);
	}
}