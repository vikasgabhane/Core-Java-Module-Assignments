class Person
{
	private int age;
	private String name;
	Person()
	{
		age=18;
	}
	Person(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	void display()
	{
		System.out.println("Age = "+age+" Name = "+name);
	}
}
class PersonDemo
{
	public static void main(String args[])
	{
		Person p=new Person();
		Person p1= new Person(21,"ABC");
		p.display();
		p1.display();
	}
}