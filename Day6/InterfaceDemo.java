import java.util.*;
interface Taxable
{
	float salesTax=7f,incomeTax=10.5f;
	void calcTax();
}
class Employee implements Taxable
{
	int empId;
	String name;
	double salary;
	float tax;
	Employee(int empId, String name, double salary)
	{
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	public void calcTax()
	{
		tax=(float)((salary*12)*(incomeTax))/100;
	}
	void show()
	{
		System.out.println("Annual Income Tax ="+tax);
	}
}
class Product implements Taxable
{
	int pid;
	float price;
	int quantity;
	float tax;
	Product(int pid, float price, int quantity)
	{
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	public void calcTax()
	{
		tax=(float)(price*salesTax)/100;
	}
	void show()
	{
		System.out.println("per unit sales Tax = "+tax);
	}
}

class InterfaceDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter empId, name , salary :");
		int empId = sc.nextInt();
		String name = sc.next();
		double salary = sc.nextDouble(); 
		Employee e = new Employee(empId,name,salary);
		e.calcTax();
		e.show();

		System.out.println("Enter pid,price,quantity :");
		int pid=sc.nextInt();
		float price=sc.nextFloat();
		int quantity=sc.nextInt();
		
		Product p = new Product(pid,price,quantity);
		p.calcTax();
		p.show();
	}
}