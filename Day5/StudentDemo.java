class Student 
{
	private int rNo;
    	private double percentage;

    	Student() 
	{
              	percentage = 0;
    	}

    	Student(int rollNo, double percentage) 
	{
        	this.rNo = rNo;
        	this.percentage = percentage;
    	}

    	void show() 
	{
        	System.out.print("Roll no. : " + rNo + " Percentage: " + percentage + "%");
    	}

    	int getRollNo() 
	{
        	return rNo;
    	}

    	double getPercentage() 
	{
        	return percentage;
    	}

}

class CollegeStudent extends Student 
{
    	private int semester;

    	CollegeStudent() 
	{
        	semester = 0;
    	}

    	CollegeStudent(int rNo, double percentage, int semester) 
	{
        	super(rNo, percentage);
        	this.semester = semester;
	}

    	void show() 
	{
        	super.show();
        	System.out.println(" Semester : " + semester);
    	}

}

class SchoolStudent extends Student 
{
    	private int className;

    	SchoolStudent() 
	{
        	className = 0;
    	}

    	SchoolStudent(int rNo, double percentage, int className) 
	{
        	super(rNo, percentage);
        	this.className = className;
    	}

    	void show() 
	{
        	super.show();
        	System.out.println(" className: " + className);
    	}

}

public class StudentDemo 
{

    	public static void main(String args[]) 
	{
        	Student arr[] = { new CollegeStudent(10, 60, 1), new CollegeStudent(12, 80, 2), new SchoolStudent(15, 95, 10),
                	new SchoolStudent(16, 90, 8), new SchoolStudent(18, 70, 7) };

        	for (Student s : arr) {
            	s.show();
        }

        int searchRollNo = 15;

        for (Student s : arr) 
	{
            if (s.getRollNo() == searchRollNo) 
	    {

                if (s instanceof CollegeStudent)
		{
                    	System.out.println("This is a college student with following details:");
                }
		else if (s instanceof SchoolStudent)
                {
		   	System.out.println("This is a School student with following details:");
                }
		s.show();
            }
        }
        int count = 0;
        for (Student s : arr) {
            if (s.getPercentage() >= 75) 
	    {
                System.out.print("Grade = A  ");
                s.show();
                count++;
            }
        }

        System.out.println("No of students with A grade: " + count);

    }

}