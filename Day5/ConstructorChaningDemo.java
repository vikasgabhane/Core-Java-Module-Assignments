class Base
{
	Base()
	{
		System.out.println("No-arg Constructor Base");
	}
	Base(int i)
	{
		System.out.println("Parameterized Constructor Base");
	}
}
class Derived extends Base
{
	Derived()
	{
		
		System.out.println("No-arg Constructor Derived");
	}
	Derived(int i)
	{
		System.out.println("Parameterized Constructor Derived");
	}
}
class ConstructorChaningDemo
{
	public static void main(String args[])
	{
		Derived d = new Derived();
		Derived d1 = new Derived(11);
	}
}