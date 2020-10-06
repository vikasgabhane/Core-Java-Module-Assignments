package Day10;

import java.util.Scanner;

public class Q62_ThreadPrimeNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :-");
		int n=sc.nextInt();
		MyThreadPrime mt= new MyThreadPrime(n);
		
		Thread th = new Thread(mt);
		
		th.start();
		
	}

}
class MyThreadPrime implements Runnable{
	int no;
	boolean flag=false;
	public MyThreadPrime(int no) {
	
		this.no = no;
	}
	

	@Override
	public void run() {
		for(int i=2;i<=no/2;i++)
		{
			if(no%i==0)
			{
				flag=false;
			}
			else
			{
				flag=true;
			}
			
		}
		if(flag)
		{
			System.out.println(no+" is Prime Number");
		}
		else
		{
			System.out.println(no+" is Not Prime Number");
		}
	}
	
}