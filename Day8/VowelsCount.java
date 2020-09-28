package Day8;

import java.util.Scanner;

public class VowelsCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Persons Name :");
		String name = sc.next();
		name=name.toLowerCase();
		int vCnt=0;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u')
			{
				vCnt++;
			
			}
		}
		System.out.println("Nomber of Vowels in String :-"+vCnt);
	}

}
