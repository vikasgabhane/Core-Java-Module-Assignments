class Employee
{
	private static int empNo=0;
	private float salary;
	private static float totalSalary;
	Employee(float salary)
	{
		empNo++;
		this.salary=salary;
		totalSalary+=salary;
	}
	static void calTotalSalary()
	{
		System.out.println(totalSalary);
	}
	void display()
	{
		System.out.println(empNo+" "+salary);
	}
}
class EmployeeDemo
{
	public static void main(String args[])
	{
		Employee e=new Employee(2000);
		Employee e1=new Employee(2000);
		Employee e2=new Employee(2000);
		e.display();
		e1.display();
		e2.display();
		Employee.calTotalSalary();
	}
}