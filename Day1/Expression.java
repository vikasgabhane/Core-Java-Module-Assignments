class Expression
{
	public static void main(String args[])
	{
		int x=4;
		int y=(x^2)+(x*3)-7;
		System.out.println("Y = "+y);
		
		y=x++ + ++x;
		System.out.println("X = "+x+"Y = "+y);
		
		int z =x++ - --y - --x + x++;
		System.out.println("X = "+x+"Y = "+y+" Z = "+z);
		
		boolean X = true;
		boolean Y = true;
		
		boolean Z = X && Y || !(X || Y);
		System.out.println(" Z = "+Z);
		
	}
}
