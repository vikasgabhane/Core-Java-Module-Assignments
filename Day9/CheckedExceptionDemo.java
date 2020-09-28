package Day9;

import java.io.IOException;

class Voter{
	int voterId;
	String name;
	int age;
	public Voter(int voterId, String name, int age) {
		super();
		this.voterId = voterId;
		this.name = name;
		this.age = age;
		try {
			if(age >18)
			{
				System.out.println("ok");
			}
			else {
				throw new IOException();
			}
		}
		catch(IOException e) {
			System.out.println("invalid age for voter ");
		}
	}
	
}
public class CheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Voter v=new Voter(1,"ght",17);
	}

}
