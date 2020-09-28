package Day7;

import java.util.Scanner;

class Employee{
	private int empId;
	private String name;
	private double salary;
	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public boolean equals(Object obj) {
		Employee emp=(Employee)obj;
		return empId == emp.empId;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
public class ToStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Employee arr[]= new Employee[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Id :");
			int id=sc.nextInt();
			System.out.println("Enter name :");
			String name=sc.next();
			System.out.println("Enter salary :");
			double sal=sc.nextDouble();
			Employee e=new Employee(id,name,sal);
			arr[i]=e;
			
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]+".equals("+arr[i+1]+"):"+arr[i].equals(arr[i+1]));
		}
		
		
	}

}
