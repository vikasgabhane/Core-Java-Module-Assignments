package Day10;


public class Q61_ThreadStarPattern {

	public static void main(String[] args) {
		MyThread1 th = new MyThread1(3);
		th.start();

	}

}
class MyThread1 extends Thread {
	
	int line;
	public MyThread1(int line) {
		this.line = line;
	}
	public void run()
	{
		for(int i=1;i<=line;i++)
		{
			for(int j=1;j<=(i*i);j++)
			{
				System.out.print("*");
				try
				{
					Thread.sleep(1000);
				}catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			System.out.println();
		}
		
	}
}