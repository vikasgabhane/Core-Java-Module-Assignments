class Student
{
	private int rno;
	private String name;
	static int cnt;
	void setData(int rno,String name)
	{
		this.rno=rno;
		this.name=name;
		cnt++;
	}
	void showData()
	{
		System.out.println(cnt+" "+rno+" "+name);
	}
}
class StaticDemo 
{
	public static void main(String args[])
	{
		Student s= new Student();
		s.setData(100,"Vikas");
		s.showData();
		Student s2= new Student();
		s.setData(100,"Vikas");
		s.showData();
	}
}