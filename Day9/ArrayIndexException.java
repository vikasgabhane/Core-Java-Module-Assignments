package Day9;

import java.util.Scanner;

public class ArrayIndexException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str = "Sunday,Monday,Tuesday,Wednesday,Thurseday,Friday,Satarday";
		String strarr[]=str.split(",");
		System.out.println("Enter Day :");
		int day =sc.nextInt();
		if(day<=6)
		{
			for(int i=0;i<strarr.length;i++)
			{
				if(i==day)
					System.out.println("Day : "+strarr[i]);
			}
		}
		else {
			throw new ArrayIndexOutOfBoundsException();
		}
		
	}

}
