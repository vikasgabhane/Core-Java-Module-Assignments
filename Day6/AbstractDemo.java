import java.util.*;
abstract class Processor
{
	int data;
	void showData()
	{
		System.out.println("Result = "+data);
	}
	abstract void proccess();
} 
class Factorial extends Processor
{
	void proccess()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		data=fact;
	}
}

class Circle extends Processor
{
	void proccess()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius to calculate Circle :");
		int r=sc.nextInt();
		data=(int)(3.14*r)*2;
	}
}
class AbstractDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur Choice :\n1) Calculate Factorial \n2)Calculate Area of circle");
		
		int ch=sc.nextInt();
		
		switch(ch)
		{
			case 1:
				Factorial f = new Factorial();
				f.proccess();
				f.showData();
				break;
			case 2:
				Circle c = new Circle();
				c.proccess();
				c.showData();
				break;
			default :
				System.out.println("Invalid Choice");
		}
	}
}