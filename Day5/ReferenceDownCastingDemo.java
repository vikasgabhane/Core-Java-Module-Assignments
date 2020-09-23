import java.lang.*;

class Shape 
{

    	int length;
    	int height;

    	void show() 
	{
        	System.out.println("Length: " + length + " height: " + height);
    	}

    	Shape() 
	{
    	}

    	Shape(int length, int height) 
	{
        	this.length = length;
        	this.height = height;
    	}

    	void Area() 
	{
    	}

	}

	class Rectangle extends Shape 
	{

    	void Area() 
	{
        	super.show();
        	System.out.println("Area:  " + (length * height));
    	}

    	void diagonal() 
	{
        	double a = Math.pow(length, 2) + Math.pow(height, 2);
        	System.out.println(" Diagonal is: " + (Math.sqrt(a)));
    	}

    	Rectangle() 
	{
    	}

    	Rectangle(int length, int height) 
	{
        	super(length, height);
    	}
	
}

class Triangle extends Shape 
{
    	void Area() 
	{
        	super.show();
        	System.out.println("Area:  " + (0.5 * length * height));
    	}

    	Triangle() 
	{
    	}

    	Triangle(int length, int height) 
	{
        	super(length, height);
    	}
}

public class ReferenceDownCastingDemo 
{
	public static void main(String[] args) 
	{

        	Shape sArr[] = { new Rectangle(30, 40), new Triangle(10, 20) };

        	sArr[0].Area();

        	Rectangle r = (Rectangle) sArr[0];
        	r.diagonal();
        	sArr[1].Area();

    	}

}