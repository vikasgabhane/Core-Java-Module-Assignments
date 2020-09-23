import java.util.*;

class Tile{
	public float Edge_length ;
	Tile(){}
	Tile(float Edge_length){
		this.Edge_length=Edge_length;
	}
	
}
class FloorDemo
{
	private float length;
	private float width;
	FloorDemo(){}
	FloorDemo(float length , float width)
	{
		this.length = length;
		this.width=width;
	}
	float totalTiles(Tile t)
	{
		float total=0;
		float area_tile = t.Edge_length * t.Edge_length;
		float area_floor = length * width;
		total = area_floor/area_tile;
		return total;
	}
	
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the tile edge length");
		float el= sc.nextFloat();

		Tile t = new Tile(el);

		System.out.println("enter the floor length and width");
		float length = sc.nextFloat();
		float width = sc.nextFloat();

		FloorDemo f = new FloorDemo(length,width);

		float result = f.totalTiles(t);

		System.out.println("total no of tilles  : "+result);
	}
	
}