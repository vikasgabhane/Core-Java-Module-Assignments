import java.util.*;
class Faculty
{
	int facultyId;
	float salary;
	void input(int facultyId)
	{
		this.facultyId=facultyId;
	}
	void printSalary()
	{
		System.out.println("FacultyId = "+facultyId+" Salary ="+salary);
	}
	void setSalary(float salary)
	{
		this.salary=salary;
	}
	
}
class FullTimeFaculty extends Faculty
{
	float basicSalary;
	float allowance;
	void input(int facultyId,float basicSalary, float allowance)
	{
		input(facultyId);
		this.basicSalary=basicSalary;
		this.allowance=allowance;
		setSalary(basicSalary+allowance);
	}

	
}
class PartTimeFaculty extends Faculty
{
	int workingHours;
	float ratePerHour;
	void input(int facultyId, int workingHours, float ratePerHour)
	{
		input(facultyId);
		this.workingHours=workingHours;
		this.ratePerHour=ratePerHour;
		setSalary(workingHours * ratePerHour);
	}	
}
class FacultyDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Faculty Id, Basic Salary, Allowance for Full time Fac :");
		int facultyId;
		facultyId=sc.nextInt();
		float basicSalary=sc.nextFloat();
		float allowance=sc.nextFloat();

		FullTimeFaculty f = new FullTimeFaculty();
		f.input(facultyId,basicSalary,allowance);
		f.printSalary();

		System.out.println("Enter faculty Id, working hours,Rate per Hour for Part time Fac :");
		facultyId=sc.nextInt();
		int workingHour=sc.nextInt();
		float ratePerHour=sc.nextFloat();

		PartTimeFaculty p = new PartTimeFaculty(); 
		p.input(facultyId,workingHour,ratePerHour);
		p.printSalary();
	}
}