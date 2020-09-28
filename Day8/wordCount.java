package Day8;

import java.util.Scanner;

public class wordCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String str = sc.next();
		int wCnt=0;
		for(int i=0;i<str.length();i++)
		{
			wCnt++;
		}
		System.out.println("Nomber of Words in String :-"+wCnt);
	}

}
