package Day7;

import java.util.Scanner;

public class BankAccount {

	int accNo;
	String name;
	double balance;
	String branch;
	
	public BankAccount(int accNo, String name, double balance, String branch) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		this.branch = branch;
	}
	void deposit(double amt)
	{
		balance+=amt;
		System.out.println("Depositet Successfully");
	}
	void withdraw(double amt)
	{
		Scanner sc=new Scanner(System.in);
		if(balance!=0)
		{
			balance=balance-amt;
		}
		else
		{
			System.out.println("Insufficient Balance!..");
		}
	}
	void showBalance()
	{
		System.out.println("Balance ="+balance);
	}
	
	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", name=" + name + ", balance=" + balance + ", branch=" + branch + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur choice create Account :\n1)Saving Account\n2)Current Account");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Create Saving Account Enter Details :");
			System.out.println("Enter account no:");
			int accno=sc.nextInt();
			System.out.println("Enter Name :");
			String name=sc.next();
			System.out.println("Enter Balance more than 5000 :");
			double amt=sc.nextDouble();
			System.out.println("Enter Branch :");
			String branch=sc.next();
			if(amt>=5000)
			{
				BankAccount b1=new BankAccount(accno,name,amt,branch);
				
				System.out.println("Enter choice to Perform\n1)deposit\n2)withdraw\n3)show Balance\n4)show Data");
				int ch1=sc.nextInt();
				switch(ch1)
				{
				case 1:
					System.out.println("Enter Amount to deposit :");
					int dep=sc.nextInt();
					b1.deposit(dep);
					break;
				case 2:
					System.out.println("Enter amt to withdraw :");
					int withdraw=sc.nextInt();
					b1.withdraw(withdraw);
					break;
				case 3:
					b1.showBalance();
					break;
				case 4:
					System.out.println(b1);
					break;
					
				default :
					System.out.println("Invalid Input..");
					break;
					
				}
				
			}
			else {
				System.out.println("Minimum 5000 balance required for Account Opening");
			}
			
			
			
			
			break;
			
		case 2:
			System.out.println("Create Current Account Enter Details :");
			System.out.println("Enter account no:");
			int accno1=sc.nextInt();
			System.out.println("Enter Name :");
			String name1=sc.next();
			System.out.println("Enter Balance more than 5000 :");
			double amt1=sc.nextDouble();
			System.out.println("Enter Branch :");
			String branch1=sc.next();
			if(amt1>=1000)
			{
				BankAccount b2=new BankAccount(accno1,name1,amt1,branch1);
				
				System.out.println("Enter choice to Perform\n1)deposit\n2)withdraw\n3)show Balance\n4)show Data");
				int ch1=sc.nextInt();
				switch(ch1)
				{
				case 1:
					System.out.println("Enter Amount to deposit :");
					int dep=sc.nextInt();
					b2.deposit(dep);
					break;
				case 2:
					System.out.println("Enter amt to withdraw :");
					int withdraw=sc.nextInt();
					b2.withdraw(withdraw);
					break;
				case 3:
					b2.showBalance();
					break;
				case 4:
					System.out.println(b2);
					break;
					
				default :
					System.out.println("Invalid Input..");
					break;
				}
			}
			else {
				System.out.println("Minimum 1000 balance required for Account Opening");
			}
			break;
		
		default :
			System.out.println("Invalid Data");
			break;
			
		}
		
	}

}
