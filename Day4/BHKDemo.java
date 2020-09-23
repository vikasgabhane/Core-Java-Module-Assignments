class OneBHK
{
	private int roomArea;
	private int hallArea;
	private int price;
	
	OneBHK()
	{
		this.roomArea=0;
		this.hallArea=0;
		this.price=0;
	}
	OneBHK(int roomArea,int hallArea,int price)
	{
		this.roomArea=roomArea;
		this.hallArea=hallArea;
		this.price=price;
	}
	void show()
	{
		System.out.println("Room Area = "+roomArea+" Hall Area = "+hallArea+" Price = "+price);
	}
}
class TwoBHK extends OneBHK
{
	private int room2Area;
	TwoBHK()
	{
		this.room2Area=0;
	}
	TwoBHK(int roomArea,int hallArea,int price, int room2Area)
	{
		super(roomArea, hallArea, price);
		this.room2Area=room2Area;
	}
	void show()
	{
		super.show();
		System.out.println("Room 2 Area = "+room2Area);
	}
}
class BHKDemo
{
	public static void main(String args[])
	{
		TwoBHK tb=new TwoBHK(125,56,3600,128);
		tb.show();
	}
}