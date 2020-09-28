package Day8;
import java.util.*;
public class SplitParseIntDemo {

	public static void main(String[] args) {
		String str= "67,89,23,67,12,55,66";
		String strarr[] = str.split(",");
		int sum=0;
		for(String a: strarr)
		{
			int n=Integer.parseInt(a);
			sum+=n;
		}
		System.out.println("Sum : "+sum);

	}

}
