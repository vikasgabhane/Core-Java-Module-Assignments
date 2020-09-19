import java.util.*;

class AreaCer
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius ");
		int r = sc.nextInt();
		
		float area = (float)(2*3.14*r)*2;
		System.out.println("Area = "+area);
		
		float cir = (float)(2*3.14*r);
		System.out.println("Circumference = "+cir);
	}
}
