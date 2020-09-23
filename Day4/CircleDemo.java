class Circle
{
	private float radius;
	private float area;
	void init(float radius)
	{
		this.radius=radius;
	}
	void calculateArea()
	{
		area = (float)(3.14*radius)*2;
	}
	void display()
	{
		System.out.println("Area of Circle = "+area);
	}
}
class CircleDemo 
{
	public static void main(String args[])
	{
		Circle c= new Circle();
		c.init(2.5f);
		c.calculateArea();
		c.display();
	}
}