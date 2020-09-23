import java.util.*;
class Student
{
	int rno;
	String name;
	int age;
	int score;
	
	Student()
	{
		this.rno=0;
		this.name=null;
		this.age=0;
		this.score=0;
	}
	
	Student(int rno, String name,int age,int score)
	{
		this.rno=rno;
		this.name=name;
		this.age=age;
		this.score=score;
	}
	void show()
	{
		System.out.println(rno+" "+name+" "+age+" "+score);
	}
}
class StudentRecordDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Student arr[]=new Student[3];
		int cnt1=0,cnt2=0,cnt3=0,cnt4=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter Student" +i+" data");
			int rno=sc.nextInt();
			String name=sc.next();
			int age=sc.nextInt();
			int score=sc.nextInt();
			arr[i]=new Student(rno,name,age,score);
		}
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i].score>=0 && arr[i].score<=50)
			{
				System.out.println("Score Group between 0-50");
				arr[i].show();
				cnt1++;
			}
			else if(arr[i].score>50 && arr[i].score<=65)
			{
				System.out.println("Score Group between 50-65");
				arr[i].show();
				cnt2++;
			}
			else if(arr[i].score>65 && arr[i].score<=80)
			{
				System.out.println("Score Group between 65-80");
				arr[i].show();
				cnt3++;
			}
			else if(arr[i].score>80 && arr[i].score<=100)
			{
				System.out.println("Score Group between 80-100");
				arr[i].show();
				cnt4++;
			}
		}
		System.out.println("Total Student Score between 0-50 = "+cnt1);
		System.out.println("Total Student Score between 50-65 = "+cnt2);
		System.out.println("Total Student Score between 65-80 = "+cnt3);
		System.out.println("Total Student Score between 80-100 = "+cnt4);
		
		
		
	}
}