package Day8;

import java.util.Scanner;

public class FirstCapitalLatter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String str=sc.next();
		String outputString=str.substring(0, 1).toUpperCase() + str.substring(1);
		System.out.println("Output String :"+outputString);
	}

}
