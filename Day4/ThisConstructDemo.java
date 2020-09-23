class ThisConstruct
{
	private int id;
	private String name;
	ThisConstruct()
	{
		this(100,"ABC")
	}
	ThisConstruct(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}
class ThisConstructDemo
{
	public static void main(String args[])
	{
		ThisConstruct t=new ThisConstruct();
	}
}